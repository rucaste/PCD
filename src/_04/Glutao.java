package _04;

public class Glutao extends Thread{

    private Table table;
    private int id;

    public Glutao(int id, Table table){
        super();
        this.id = id;
        this.table = table;
    }

    @Override
    public void run(){
        while (!Thread.currentThread().isInterrupted()) {
            synchronized (table) {
                Javali javali = null;
                try {
                    javali = table.remove();
                    sleep(10);
                } catch (InterruptedException e) {
                    System.out.println("Interropido glutao 1: " + id);
                    return;
                }
                System.out.println("Glutao " + id + " consumiu javali " + javali.id + " -> Mesa com " + table.getSize());
            }
        }
        System.out.println("Interropido glutao 2: " + id);
    }
}
