package _02;

// A classe ThreadB deve gerar constantemente números aleatórios entre 1 e 9 até ser interrompida.
// Os números gerados devem ser escritos na consola. Entre a geração de cada número a thread deve dormir (sleep) 0.5 segundo.

public class ThreadB extends Thread{

    private int count = 0;

    @Override
    public void run(){
        int i;
        while(!Thread.currentThread().isInterrupted()){
            try {
                i = 1 + (int)(Math.random() * 9);
                System.out.println(i + " B " + count);
                count++;
                sleep(500);
            }
            catch (InterruptedException e){
                System.out.println("B was interrupted!" + count);
                return;
            }
        }
    }

}