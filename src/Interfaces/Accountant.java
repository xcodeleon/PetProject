package Interfaces;

public class Accountant implements Counter{
    @Override
    public String report(int month) {
        return "Отчёт за " + month + " месяцев";
    }
}
