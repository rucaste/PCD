package _04;

public class Escavadora extends Thread {

    private int id;
    private Balanca balanca;

    public Escavadora(int id, Balanca balanca) {
        super();
        this.id = id;
        this.balanca = balanca;
    }

    @Override
    public void run(){
        while (!Thread.currentThread().isInterrupted()) {
            int peso = (int)(Math.random() * 10);
            try {
                synchronized (balanca) {
                    balanca.addPeso(peso);
                    System.out.println("Escavadora " + id + " adicionou " + peso + " kg");
                    sleep(100);
                }
            } catch (InterruptedException e) {
                System.out.println("Escavadora " + id + " interompida");
                return;
            }
        }
    }

}
