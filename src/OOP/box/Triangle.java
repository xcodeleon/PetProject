package OOP.box;

public class Triangle extends Figura {

    private double c;
    public Triangle(double a, double b, double c){
        super(a, b);
        this.c = c;


    }

    public Triangle(double size){
        super(size, size);
        this.c = size;

    }

    @Override
    public double square() {
        double p = (getA() + getB() + c) / 2;
        double s = p * (p - getA()) * (p - getB()) * (p - c);
        return Math.sqrt(s);
    }
}
