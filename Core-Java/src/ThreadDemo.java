package src;

class ThreadProcess1 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hi " + i);
        }
    }
}

class ThreadProcess2 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello " + i);
        }
    }
}

class ThreadProcess3 extends Thread {
    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 100; i++) {
                System.out.println("Hi " + i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class ThreadProcess4 extends Thread {
    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 100; i++) {
                System.out.println("Hello " + i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class ThreadProcess5 implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hi " + i);
        }
    }
}

class ThreadProcess6 implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello " + i);
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        // var obj1 = new ThreadProcess1();
        // var obj2 = new ThreadProcess2();

        // obj1.start();
        // obj2.start();

        // var obj3 = new ThreadProcess3();
        // var obj4 = new ThreadProcess4();

        // System.out.println("====Thread priority====" + obj3.getPriority());
        // obj4.setPriority(Thread.MAX_PRIORITY);

        // obj3.start();
        // obj4.start();

        // Runnable obj5 = new ThreadProcess5();
        // Runnable obj6 = new ThreadProcess6();

        // var thread1 = new Thread(obj5);
        // var thread2 = new Thread(obj6);

        // thread1.start();
        // thread2.start();

        Runnable obj7 = new Runnable() {
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Hi " + i);
                }
            }
        };

        Runnable obj8 = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello " + i);
            }
        };

        var thread3 = new Thread(obj7);
        var thread4 = new Thread(obj8);

        thread3.start();
        thread4.start();
    }
}
