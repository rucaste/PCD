package _02;

// A classe ThreadA deve gerar constantemente números aleatórios entre 1000 e 9999 até ser interrompida.
// Os números gerados devem ser escritos na consola. Não deve ser chamado o método Sleep.
// Nota: deve verificar usando o método interrupted() para verificar se a thread foi interrompida.

import java.io.IOException;

public class ThreadA extends Thread{

    private int count = 0;

    @Override
    public void run(){
        int i;
        while(!Thread.currentThread().isInterrupted()){
                i = 1000 + (int)(Math.random() * 9000);
                System.out.println(i + " A " + count);
                count++;
        }
        System.out.println("A was interrupted!" + count);
    }

}
