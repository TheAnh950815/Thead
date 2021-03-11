package OddendEven;

public class TestThead {
    public static void main(String[] args) {
        OddThead obj1 = new OddThead();
        EvenThead obj2 = new EvenThead();
        Thread thread1= new Thread(obj1);
        Thread thread2= new Thread(obj2);

        try {
            thread2.join();
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread1.start();
        thread2.start();
    }
}
