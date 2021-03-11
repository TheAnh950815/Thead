package NumberGenerator;

public class NumberGenerator implements Runnable {

    @Override
    public void run() {
        NumberGenerator numberGenerator = new NumberGenerator();

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                Thread.sleep(5000);

            }
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    public static void main(String[] args) {
        NumberGenerator obj1 = new NumberGenerator();
        NumberGenerator obj2 = new NumberGenerator();
        Thread thread1 = new Thread(obj1);
        Thread thread2 = new Thread(obj2);
        thread1.start();
        thread2.start();
    }
}
