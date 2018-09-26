package _02;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        NameThread nameThread1 = new NameThread(1);
        NameThread nameThread2 = new NameThread(2);
        nameThread1.start();
        nameThread2.start();

        nameThread1.interrupt();


        try {
            nameThread1.join();
            nameThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        nameThread1.interrupt();
        nameThread2.interrupt();

        System.out.println("end");

    }

}
