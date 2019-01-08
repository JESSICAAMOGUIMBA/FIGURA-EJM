package Interfaces;

public class Rectangulo implements Figura{

    private double base;
    private double altura;

        
    @Override
    public double calcularArea(double baseR, double alturaR) {
     return baseR*alturaR;
    }

    @Override
    public double calcularPerimetro(double baseR, double alturaR, double N0) {
     return (2*baseR)*(2*alturaR);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
