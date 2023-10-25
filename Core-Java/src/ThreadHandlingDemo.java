package src;

class Counter {
    int count;

    public synchronized void increment() {
        count++;
    }
}

public class ThreadHandlingDemo {
    public static void main(String[] args) {
        var counter = new Counter();

        Runnable obj1 = () -> {
            for (int i = 1; i <= 10000; i++) {
                counter.increment();
            }
        };

        Runnable obj2 = () -> {
            for (int i = 1; i <= 10000; i++) {
                counter.increment();
            }
        };

        var thread1 = new Thread(obj1);
        var thread2 = new Thread(obj2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count Value: " + counter.count);
    }
}
