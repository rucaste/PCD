package _02;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) throws InterruptedException {

/*        Window game = new Window(Integer.valueOf(30));

        Cavalo cavalo1 = new Cavalo(1, 30, game);
        Cavalo cavalo2 = new Cavalo(2, 30, game);
        Cavalo cavalo3 = new Cavalo(3, 30, game);
        cavalo1.start();
        cavalo2.start();
        cavalo3.start();

        boolean a = true;
        while(a){
            System.out.println(cavalo1.getStatus());
            if (cavalo1.getStatus() || cavalo2.getStatus() || cavalo3.getStatus()) {
                cavalo1.interrupt();
                cavalo2.interrupt();
                cavalo3.interrupt();
                a = false;
            }
        }*/

        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();

        threadA.start();
        threadB.start();

        sleep(10000);

        threadA.interrupt();
        threadB.interrupt();

    }

}

// Gerador de números aleatórios
// Quando o programa começa deve criar e iniciar duas threads de classes diferentes:

// A classe ThreadA deve gerar constantemente números aleatórios entre 1000 e 9999 até ser interrompida.
// Os números gerados devem ser escritos na consola. Não deve ser chamado o método Sleep.
// Nota: deve verificar usando o método interrupted() para verificar se a thread foi interrompida.
// A classe ThreadB deve gerar constantemente números aleatórios entre 1 e 9 até ser interrompida.
// Os números gerados devem ser escritos na consola. Entre a geração de cada número a thread deve dormir (sleep) 0.5 segundo.
// Ambas as threads devem manter o registo de quantos números foram já gerados.
// Quando o botão Stop for pressionado ambas as threads devem ser interrompidas e terminar.
// Só após as duas threads terem terminado deve ser escrito na consola o número de valores gerados por cada uma das threads.


// Considere uma aplicação para simular uma corrida de cavalos. Na corrida participam sempre 3 cavalos que correm de 7
// forma independente. A evolução de cada cavalo deve ser visível num campo do tipo JTextField, tal como se exemplifica
// na figura em baixo. A interface da aplicação inclui, ainda, um botão para iniciar a corrida. A movimentação dos
// cavalos deve obedecer aos seguintes requisitos:
//  a) o percurso total dos cavalos é constituído por 30 movimentos;
//  b) um movimento consiste em subtrair uma unidade aos movimentos que faltam;
//  c) após cada movimento o cavalo deve dormir um tempo aleatório.
