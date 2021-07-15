package Interfaces;

public class Cook extends Employee implements CanCooking{
    public Cook(String name){
        super(name);
    }

    @Override
    public void cooking() {
        System.out.println(getName() + " готовит еду");
    }
}
