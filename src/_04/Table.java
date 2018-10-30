package _04;

import java.util.ArrayList;

public class Table {

    private int size;
    private ArrayList<Javali> javalis;

    public Table(int size){
        this.javalis = new ArrayList<Javali>();
        this.size = size;
    }

    public synchronized void add(Javali javali) throws InterruptedException {
        while(javalis.size() == size){
            wait();
        }
        javalis.add(javali);
        notifyAll();
    }

    public synchronized Javali remove() throws InterruptedException {
        while(javalis.size() == 0){
            wait();
        }
        Javali javali = javalis.get(0);
        javalis.remove(0);
        notifyAll();
        return javali;
    }

    public synchronized int getSize(){
        return javalis.size();
    }

}
