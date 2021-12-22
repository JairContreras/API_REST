class Rectangulo implements Figura{
    int alto;
    int ancho;
    public Rectangulo(int alto, int ancho){
        this.alto = alto;
        this.ancho = ancho;
    }   

    @Override
    public void perimetro(){
        System.out.println("El perimetro del rectangulo: "+(this.alto+this.alto+this.ancho+this.ancho));
    }

    @Override 
    public void area(){
        System.out.println("El area del rectangulo: "+ (this.alto*this.ancho));
    }
}