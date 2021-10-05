package multithreading;

public class MainMFP {
    public static void main (String[] args) {
        MFP mfp = new MFP();
        new Thread(new Runnable() {
            @Override
            public void run ( ) {
                mfp.print(1);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run ( ) {
                mfp.scan(1);
            }
        }).start();
    }
}
