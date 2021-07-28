package Collections;

public class Main {
    public static void main(String[] args) {
        MyArrayList employees = new MyArrayList();

        employees.add("Василий");
        employees.add("Николай");
        employees.add("Никита");
        employees.add("Ольга");
        employees.add("Дмитрий");
        employees.add("Елена");
        employees.add("Ефим");
        employees.add("Алина");
        employees.add("Саша");
        employees.add("Женя");
        employees.add("Алиса");
        employees.remove("Никита");
        employees.remove("Елена");
        employees.remove("Жорж");

        for (int i = 0; i < employees.getSize(); i++) {
            System.out.println(employees.get(i));
        }
    }
}

