package oop.box;

public abstract class Figura {
    private double a;
    private double b;

    public Figura(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public abstract double square();

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}
