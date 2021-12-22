package com.restapi.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional; 

import com.restapi.model.Countries;

@Repository
@Transactional
public class CountryDAOImp implements CountryDAO {
    
	@Autowired
	  private EntityManager entityManager;

	@Override
	public List<Countries> findAll() {
		 	Query theQuery= (Query) entityManager.createQuery("from Countries");
	        List<Countries> transactions = theQuery.getResultList();

	        return transactions;
		
	}

	@Override
	public int delete(int id) {
		Query q = (Query) entityManager.createQuery("delete from Countries where id_Country=:id");
		q.setParameter("id", id);
		int deletedRows = q.executeUpdate();
		return deletedRows;
		
	}

	@Override
	public Countries getCountry(int id) {
		Countries country = entityManager.find(Countries.class, id);
		return country;
	}

	@Override
	public Countries save(Countries country) {
		Countries dbCountry = entityManager.merge(country);
		country.setIdCountry(dbCountry.getIdCountry());
		return country;
	}

}
