package referencetype;

public class Programmer {
    private String name;
    private String position;
    private double height;
    private int age;

    public Programmer(String name, String position, double height, int age) {
        this.name = name;
        this.position = position;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }
}
