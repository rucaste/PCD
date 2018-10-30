package _03;

public class Client extends Thread{

    private Account account;
    private int sum;

    public Client(Account account){
        this.account = account;
        this.sum = 0;
    }

    @Override
    public void run(){

        while (!Thread.currentThread().isInterrupted()){
            int aux = (int)(10 * Math.random());
            account.deposit(aux);
            sum = sum + aux;
        }
    }

    public int getSum(){
        return sum;
    }

}




/*

Crie 10 Threads Cliente, cada um vai fazer depósitos contínuos de um valor aleatório (por exemplo entre 0 e 100€) até ser interrompido. Cada cliente guarda o total que ele próprio depositou.

        O main, fará o seguinte:

        Lança os 10 clientes
        dorme 10 segundos,
        interrompe todos os clientes,
        espera que terminem (usando o join()),
        imprime o saldo da conta
        soma o total depositado por todos os clientes para confirmação.
        Experimente com e sem sincronização do metodo deposit().
*/
