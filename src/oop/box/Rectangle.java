package oop.box;

public class Rectangle {
    int length;
    int width;

    public void setSize(int width, int length) {
        this.length = length;
        this.width = width;
    }

    public int perimetr() {
        return length + width;
    }

    public int square() {
        return length * width;
    }
}
