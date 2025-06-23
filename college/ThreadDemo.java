
class Thread1 extends Thread {

    public void run() {
        try {
            while (true) {
                System.out.println("Thread1");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
        }
    }
}

class Thread2 extends Thread {

    public void run() {
        try {
            while (true) {
                System.out.println("Thread2");
                Thread.sleep(2000);
            }
        } catch (Exception e) {
        }
    }
}

class ThreadDemo {

    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}
