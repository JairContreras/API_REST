public class FactoryFigura{

    public Figura getFigura(String figura){
        if(figura == null){
            return new FiguraVacia();
        }
        if(figura.equals("Circulo")){
            return new Circulo(5);
        } else if (figura.equals("Rectangulo")){
            return new Rectangulo(5,2);
        }
        return new FiguraVacia();
    }
}