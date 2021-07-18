package OOP.main;

import OOP.box.Rectangle;

public class MainRectangle {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setSize(5433, 5656);

        System.out.println(rect.perimetr());
        System.out.println(rect.square());
    }

}
