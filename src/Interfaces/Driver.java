package Interfaces;

public class Driver extends Employee implements CanDriving{
    public Driver(String name){
        super(name);
    }

    @Override
    public void driving() {
        System.out.println(getName() + " водит машину");
    }

}
