package oop.box;

public class Dog {
    private int speed;
    private String nickname;
    private String breed;
    private String run = "Бегу!!!";

    public void run() {
        String result = "";
        for (int i = 0; i < speed; i++) {
            result += "бегу!!!";

            //Проверяем последнее ли это слово "бегу" - если последнее , то ставим точку, если нет, то ставим запятую и пробел
            if (i == speed - 1) {
                result += ".";
            } else {
                result += ", ";
            }
        }
        System.out.println(result);
    }

    public String info() {
        return "Кличка: " + nickname + "\nПорода: " + breed + "\nСкорость: " + speed;
    }

}



