package _04;

public class Cozinheiro extends Thread{

    private Table table;
    private int id;

    public Cozinheiro(int id, Table table){
        super();
        this.id = id;
        this.table = table;
    }

    @Override
    public void run(){

        while (!Thread.currentThread().isInterrupted()) {
            synchronized(table) {
                int a = (int)Math.random()*9;
                try {
                    table.add(new Javali(a));
                    sleep(10);
                } catch (InterruptedException e) {
                    System.out.println("Interropido cozinheiro 1: " + id);
                    return;
                }
                System.out.println("Cozinehiro " + id + " adicionou javali " + a + " -> Mesa com " + table.getSize());
            }
        }
        System.out.println("Interropido cozinheiro 2: " + id);
    }




}
