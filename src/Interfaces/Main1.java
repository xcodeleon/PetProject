package Interfaces;

import java.util.ArrayList;


public class Main1 {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Вася");
        Programmer programmer1 = new Programmer("Коля");
        Programmer programmer2 = new Programmer("Саша");

       Cook cook1 = new Cook("Маша");
       Cook cook2 = new Cook("Таня");
       Cook cook3 = new Cook("Оля");

       Driver driver1 = new Driver("Игорь");
       Driver driver2 = new Driver("Миша");
       Driver driver3 = new Driver("Леонид");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(programmer);
        employees.add(programmer1);
        employees.add(programmer2);
        employees.add(cook1);
        employees.add(cook2);
        employees.add(cook3);
        employees.add(driver1);
        employees.add(driver2);
        employees.add(driver3);
        for (Employee empl : employees) {
            empl.voice();
        }

        ArrayList<CanProgramming> programmings = new ArrayList<>();
        programmings.add(programmer);
        programmings.add(programmer1);
        programmings.add(programmer2);
        for (CanProgramming prg : programmings) {
            prg.programming();
        }

        ArrayList<CanCooking> cookings = new ArrayList<>();
        cookings.add(cook1);
        cookings.add(cook2);
        cookings.add(cook3);
        for (CanCooking cook: cookings
        ) {
            cook.cooking();
        }

        ArrayList<CanDriving> drivings = new ArrayList<>();
        drivings.add(driver1);
        drivings.add(driver2);
        drivings.add(driver3);
        for (CanDriving drv: drivings) {
            drv.driving();
        }
    }
}
