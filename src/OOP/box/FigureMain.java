package OOP.box;

public class FigureMain {
    public static void main(String[] args) {
        Rect rect = new Rect(2, 10);
        Triangle tri = new Triangle(10);

        System.out.println(rect.square());
        System.out.println(tri.square());

    }
}
