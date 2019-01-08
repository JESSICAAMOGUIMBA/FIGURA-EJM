package Interfaces;

public class Circulo implements Figura{

    private double radio;

          
    @Override
    public double calcularArea(double radioC, double NO) {
     return PI*(radioC*radioC);
    }

    @Override
    public double calcularPerimetro(double radioC, double NO, double N0) {
     return 2*PI*radioC;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
