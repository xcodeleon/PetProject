package ReferenceType;

public class Main {
    public static void main(String[] args) {

        String str = "Это Иван, ему 34 года, его рост 170.5 см. Должность - программист";
        String name = str.substring(4, 8);
        String position = str.substring(54, 65);
        int age = Integer.parseInt(str.substring(14, 16));
        double height = Double.parseDouble(str.substring(32, 37));

        Programmer programmer = new Programmer(name, position, height, age);
        System.out.println(programmer.getName());
        System.out.println(programmer.getAge());
        System.out.println(programmer.getHeight());
        System.out.println(programmer.getPosition());
    }
}
