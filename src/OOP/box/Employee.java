package OOP.box;

public class Employee {
    String name;
    String position;
    int salary;

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getInfo(int i){
        return "Сотрудник " + name + "," + " должность " + position + "," + " за последние " + i + " месяцев получил " + i * salary + " рублей";
    }
}
