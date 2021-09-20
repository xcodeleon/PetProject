package oop.main;

import oop.box.Box;
import test.Empty;

public class BoxMain {
    public static void main(String[] args) {
        Box box1 = new Box(100);
        Box box2 = new Box(10, 10, 10);
        Box box3 = box1.sumBox(box2);
        Box box4 = new Box(box1, box3);
        Empty empty = new Empty();
        empty.toString();

        box1.showVolume();
        box2.showVolume();
        box3.showVolume();

        double volumeSum = box1.volume() + box3.volume();

        System.out.println("box1 + box3 = " + volumeSum);
        System.out.println(box2.toString());
    }
}
