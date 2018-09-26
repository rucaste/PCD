package _02;

public class NameThread extends Thread {

    private int id;
    private long start;

    public NameThread(int id){
        this.id = id;
        long start = System.nanoTime();
    }

    @Override
    public void run() {
        for (var i = 0; i < 10; i++) {
            try {
                long aux = (long)(Math.random()*1000);
                this.sleep(aux);

            } catch (InterruptedException e) {
                System.out.println(id + ": Done! I was interrupted!");
            }
            long time = System.nanoTime() - this.start;
            System.out.println(time/1000000 + " >>>>>" + this.id);
        }
    }
}
