package oop.main;

import oop.box.Employee;

public class MainEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee("Иванов Иван", "Программист", 60000);
        String info = employee.getInfo(12);
        System.out.println(info);

    }
}
