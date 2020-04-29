public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello Thread: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Name of thread: " + Thread.currentThread().getName());
        System.out.println("Id of thread: " + Thread.currentThread().getId());
        System.out.println();

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        System.out.println("Name of t1: " + t1.getName());
        System.out.println("Name of t2: " + t2.getName());
        System.out.println("id of t1: " + t1.getId());
        System.out.println("id of t2: " + t2.getId());
        System.out.println();

        t1.start();
        t2.start();
    }
}
