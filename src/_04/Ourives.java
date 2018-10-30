package _04;

import java.util.ArrayList;

public class Ourives extends Thread {

    private int id;
    private Balanca balanca;
    private ArrayList<Lingote> lingotes= new ArrayList<Lingote>();

    public Ourives(int id, Balanca balanca) {
        super();
        this.id = id;
        this.balanca = balanca;
    }

    @Override
    public void run(){
        while (!Thread.currentThread().isInterrupted()) {
            int peso = balanca.getPeso();
            if(peso >= 12){
                try {
                    Lingote lingote = null;
                    synchronized (balanca) {
                        lingote = balanca.getLingote();
                        lingotes.add(lingote);
                        System.out.println("Ourives " + id + " criou lingote com " + peso + " kg");
                        sleep(100);
                    }
                } catch (InterruptedException e) {
                    for(Lingote lingote:lingotes){
                        System.out.println(lingote.getPeso());
                    }
                    return;
                }
            }

        }
    }



}
