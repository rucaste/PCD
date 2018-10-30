package _02;

import javax.swing.*;

public class Cavalo extends Thread {

    private int id;
    private int moves, move;
    private Window window;
    private boolean status;

    public Cavalo(int id, int moves, Window window){
        this.status = false;
        this.moves = moves;
        this.move = moves;
        this.id = id;
        this.window = window;
    }

    @Override
    public void run() {
        for (var i = 0; i <= moves; i++) {
            try {
                long aux = (long)(Math.random()*1000);
                sleep(aux);
                window.move(id, move);
                this.move--;
                if (this.move == 0){
                    window.move(id, move);
                    this.status = true;
                }
            } catch (InterruptedException e) {
                System.out.println(this.id + " I was interrupted!");
                return;
            }
        }
    }

    public boolean getStatus(){
        return status;
    }

}
