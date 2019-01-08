package Interfaces;

public class Cuadrado implements Figura{
    
    private double lado;
 

    @Override
    public double calcularArea(double ladoC,double NO) {
        return ladoC*ladoC;
    }

    @Override
    public double calcularPerimetro(double ladoC,double NO, double N0) {
        return 4*ladoC;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
}
