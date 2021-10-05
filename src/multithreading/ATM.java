package multithreading;


public class ATM {
    private int amount;
    private final Object monitor = new Object();
    public ATM(int amount){
        this.amount = amount;
    }

    public void withdraw(String name, int amount) {
        synchronized (monitor) {
            System.out.println(name + " when to the ATM");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (amount <= this.amount) {
                this.amount -= amount;
                System.out.println(name + " withdraw " + amount);
                System.out.println("Left: " + this.amount);
            } else {
                System.out.println("There is not enough money in the account for " + name);
            }
        }
    }
}
