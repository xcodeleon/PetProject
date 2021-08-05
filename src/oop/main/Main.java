package oop.main;

import oop.box.Box;
import oop.box.BoxWeight;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(10);
        BoxWeight boxWeight = new BoxWeight(10, 20, 15, 7);

        box.showInfo();
        boxWeight.showInfo();
    }
}
