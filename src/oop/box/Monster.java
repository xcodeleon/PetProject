package oop.box;

public class Monster {
    int hands;
    int eyes;
    int foot;
    String voice = "Голос!!!";


    public Monster() {
        this.eyes = 2;
        this.foot = 2;
        this.hands = 2;
    }

    public Monster(int hands) {
        this.hands = hands;
        this.eyes = 2;
        this.foot = 2;
    }

    public Monster(int hands, int foot) {
        this.hands = hands;
        this.foot = foot;
        this.eyes = 2;
    }

    public Monster(int hands, int eyes, int foot) {
        this.hands = hands;
        this.eyes = eyes;
        this.foot = foot;
    }

    public void voice() {
        System.out.println(voice);
    }

    public void voice(int count) {
        String result = " ";
        for (int i = 0; i < count; i++) {
            result += voice;

            //Проверяем последнее ли voice - если последнее , то ставим точку, если нет, то ставим запятую и пробел
            if (i == count - 1) {
                result += ".";
            } else {
                result += ", ";
            }
        }
        System.out.println(result);
    }
//Второй вариант метода
//    void voice(int n) {
//        for (int i = 0; i < n; i++) {
//            System.out.println("Голос");
//        }
//    }

    public void voice(int countWord, String word) {
        String result = " ";
        for (int i = 0; i < countWord; i++) {
            result += word;

            //Проверяем последнее ли это слово word - если последнее , то ставим точку, если нет, то ставим запятую и пробел
            if (i == countWord - 1) {
                result += ".";
            } else {
                result += ", ";
            }
        }
        System.out.println(result);
    }

//    void voice(int n, String word) {
//        for (int i = 0; i < n; i++) {
//            System.out.println(word);
//        }
//    }
}
