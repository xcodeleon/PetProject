package multithreading;

public class MFP {
    private final Object printMonitor = new Object();
    private final Object scanMonitor = new Object();

    public void scan(int count){
        synchronized (scanMonitor){
            try {
                for (int i = 0; i < count; i++){
                    Thread.sleep(100);
                    System.out.println("Отсканировано " + i + " страниц.");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void print(int count){
        synchronized (printMonitor){
            try {
                for (int i = 0; i < count; i++){
                    Thread.sleep(100);
                    System.out.println("Напечатано " + i + " страниц.");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
