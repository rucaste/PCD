package _04;

import javax.print.DocFlavor;

public class Balanca {

    private int peso;

    public Balanca() {
        this.peso = 0;
    }

    public synchronized void addPeso(int peso) throws InterruptedException {
        while(this.peso >= 12.5){
            wait();
        }
        this.peso = this.peso + peso;
        notifyAll();
        //System.out.println("Balança adiciou " + peso + " kg -> Total: " + this.peso + " kg");
    }

    public synchronized Lingote getLingote() throws InterruptedException {
        while(this.peso < 12.5){
            wait();
        }
        Lingote lingote = new Lingote(this.peso);
        this.peso = 0;
        notifyAll();
        //System.out.println("Balança retirou" + peso + " kg -> Total: " + this.peso + " kg");
        return lingote;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }




}
