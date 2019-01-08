package Interfaces;

public class Triangulo implements Figura{
    
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;

   

    @Override
    public double calcularArea(double baseT, double alturaT) {
        return (baseT*alturaT)/2;
    }

    @Override
    public double calcularPerimetro(double lado1T, double lado2T, double lado3T) {
        return lado1T+lado2T+lado3T;
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

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    
}
