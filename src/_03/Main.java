package _03;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Account account = new Account();

        Client[] clients = new Client[10];
        for(int i = 0; i< clients.length; i++){
            clients[i] = new Client(account);
        }
        for(Client client: clients){
            client.start();
        }
        sleep(5000);
        for(Client client: clients){
            client.interrupt();
        }
        for(Client client: clients){
            client.join();
        }

        int aux = 0;
        for(Client client: clients){
            aux = aux + client.getSum();
        }

        System.out.println(account.getBalance());
        System.out.println(aux);



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