class Circulo implements Figura{
    int radio;

    public Circulo(int radio){
        this.radio = radio;
    }   

    @Override
    public void perimetro(){
        System.out.println("El perimetro del circulo: "+ (2*3.1416*this.radio));
    }

    @Override 
    public void area(){
        System.out.println("El area del circulo:"+ (3.1416*this.radio*this.radio));
    }
}