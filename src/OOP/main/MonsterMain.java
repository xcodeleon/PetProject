package OOP.main;

import OOP.box.Monster;

public class MonsterMain {
    public static void main(String[] args) {
        Monster monster = new Monster();
        Monster monster1 = new Monster(1,1,3);
        Monster monster2 = new Monster(5,5);

        monster.voice();
        monster1.voice(10);
        monster2.voice(4,"Привет!!!");

    }
}
