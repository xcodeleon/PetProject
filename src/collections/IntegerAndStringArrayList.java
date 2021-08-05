package collections;

import java.util.ArrayList;

public class IntegerAndStringArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> str = new ArrayList<>();
        ArrayList<String> str2 = new ArrayList<>();

        for (int i = 0; i < 6; i ++){
            numbers.add(i);
        }

        str.add("Джава");
        str.add("Питон");
        str.add("Си++");
        str.add("С#");
        str.add("Лисп");
        str.add("Си");

       for (int i = 0; i < numbers.size(); i++){
           String s = numbers.get(i) + " - " + str.get(i);
           str2.add(s);
        }

        for (String string: str2) {
            System.out.println(string);
        }
    }
}
