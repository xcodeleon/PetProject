package Interfaces;

public class MainDirector {

    public static void main(String[] args) {
        Director director = new Director();
        Accountant accountant = new Accountant();
        director.force(accountant, 12);

        director.force(new Counter() {
            @Override
            public String report(int month) {
                return "Отчёт за " + month + " месяцев";
            }
        }, 6);


    }



}
