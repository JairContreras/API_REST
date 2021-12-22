public class Main{
    public static void main(String[] args){
        FactoryFigura factory = new FactoryFigura();

        Figura fig1 = factory.getFigura("Rectangulo");
        Figura fig2 = factory.getFigura("Circulo");
        fig2.perimetro();
        fig1.area();
    }
}