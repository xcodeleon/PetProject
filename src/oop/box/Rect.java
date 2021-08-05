package oop.box;

public class Rect extends Figura {

    public Rect(double a, double b) {
        super(a, b);
    }

    public Rect(double size) {
        super(size, size);

    }

    @Override
    public double square() {
        return getA() * getB();
    }
}
