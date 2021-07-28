package Interfaces;

public class Director {
    private int month = 0;
    public void force(Counter counter, int i){
        String report = counter.report(i);
        System.out.println(report );
    }
}
