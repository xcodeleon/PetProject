package Interfaces;

public class Programmer extends Employee implements CanProgramming{
    public Programmer(String name){
        super(name);
    }

    @Override
    public void programming() {
        System.out.println(getName() + " пишет код");
    }

}
