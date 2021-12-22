--Countries  (ID int identity,Name varchar,Capital varchar,Population int,LanguageID int)
CREATE TABLE LANGUAGES(
     idLanguage int primary key,
     name varchar(30)
);
--Languages(ID int identity,Name varchar)
CREATE TABLE COUNTRIES(
    idCountry int primary key,
    name varchar(20),
    capital varchar(20),
    population int,
    languageID int not null,
    constraint rule foreign key (languageID) REFERENCES LANGUAGES(idLanguage)
)

-- Insert records into languages
insert into LANGUAGES values (1, 'Spanish');
insert into LANGUAGES values (2, 'English');
insert into LANGUAGES values (3, 'Italian');

-- Insert recordos into languages
insert into COUNTRIES values (1, 'Argentina', 'Buenos Aires', 45000000, 1);
insert into COUNTRIES values (2, 'Colombia', 'Bogota', 50000000, 1);
insert into COUNTRIES values (3, 'EUA', 'Washington DC', 300000000, 2);
insert into COUNTRIES values (4, 'Vatican', 'Vatican City', 1000, 3);

select * from LANGUAGES;
select * from COUNTRIES;


--update the first record the population field by 250000 (SQL senteces)
update COUNTRIES SET POPULATION = 250000 where IDCOUNTRY = 1;


--Delete countries with populations greater than 100,000 (SQL senteces)
delete from countries where POPULATION < 100000;


--Join tables
SELECT Countries.Name as CountryName,  Languages.Name  as LanguageName 
    FROM COUNTRIES 
    JOIN LANGUAGES 
    ON Countries.IDCOUNTRY = LANGUAGES.IDLANGUAGE;


--Group by languages
SELECT languageID, count(*) from COUNTRIES 
group by languageID;


------------------STORED PROCEDURES-----------------
--SELECTCS
CREATE PROCEDURE selectLanguages
AS
    SELECT * FROM LANGUAGES
GO

CREATE PROCEDURE selectCountries
AS
    SELECT * FROM COINTRIES
GO

--INSERTS
CREATE PROCEDURE insertLanguage(@idLanguage, @name)
AS
    INSERT INTO LANGUAGE (idLanguage, name) values (@idLanguage, @name)
GO;
CREATE PROCEDURE insertCountry(@idCountry, @name, @capital, @population, @languageID)
AS
    INSERT INTO COUNTRIES  (idCountry, name, capital, population, languageID)
    values(@idCountry, @name, @capital, @population, @languageID)
GO;

--DELETES
CREATE PROCEDURE deleteLanguage(@idLanguage)
AS
    DELETE FROM LANGUAGES WHERE idLanguage = @idLanguage;
GO;

CREATE PROCEDURE deleteCountry(@idCountry)
AS
    DELETE FROM COUNTRIES WHERE idCountry = @idCountry;
GO;
