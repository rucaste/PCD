package _03;

class Account {

    private int value;

    public synchronized void deposit(int amount){
        value = value + amount;
    }

    public int getBalance(){
        return value;
    }

}
