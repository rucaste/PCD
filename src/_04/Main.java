package _04;

import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Balanca balanca = new Balanca();
        Ourives ourives1 = new Ourives(1, balanca);
        Escavadora escavadora1 = new Escavadora(1, balanca);
        Ourives ourives2 = new Ourives(2, balanca);
        Escavadora escavadora2 = new Escavadora(2, balanca);
        Ourives ourives3 = new Ourives(3, balanca);
        Escavadora escavadora3 = new Escavadora(3, balanca);

        ourives1.start();
        escavadora1.start();
        ourives2.start();
        escavadora2.start();
        ourives3.start();
        escavadora3.start();

        sleep(5000);

        ourives1.interrupt();
        escavadora1.interrupt();
        ourives2.interrupt();
        escavadora2.interrupt();
        ourives3.interrupt();
        escavadora3.interrupt();


// Um lingote típico de ouro é construído com ~12.5 kg de ouro. Para fazer um lingote, são precisos diversos pedaços de
// ouro extraídos da natureza.
// Crie uma aplicação que simule uma escavadora de ouro, uma balança e um ourives. A escavadora recolhe pequenos
// pedaços de ouro (cada pedaço pesa até 1 kg). Quando a escavadora acha o ouro, é posto numa balança. Quando 12.5 kg
// de ouro ou mais estão na balança, o ourives recolhe o ouro para fazer o lingote.Ambas a escavadora e o ourives devem
// ser threads. A escavadora pode acrescentar ouro na balança apenas se houver menos do que 12.5 kg de ouro na balança.
// Por outro lado, o ourives pode apenas recolher o ouro quando ficam 12.5 kg ou mais na balança. Depois de o ourives
// recolher o ouro da balança, leva-lhe 3 segundos a transformar o ouro num lingote.
// Utilize um double para representar a quantidade actual de ouro na balança. Deverá criar uma janela com o campo de
// texto e um botão. O campo de texto deve mostrar o peso do ouro que está na balança.
// Quando o utilizador pressiona o botão “Stop”, a escavadora e o ourives devem ser interrompidos e terminar. Antes de
// terminar, o ourives deve escrever na consola o número total de lingotes criados.
// A sua solução deve enviar mensagens que contenham o id da thread (Thread.currentThread().toString()) bem como o tipo
// de operação (ex: “inicio do run”) para a consola sempre que uma thread faz:
//   Inicio e fim do método run
//   Antes de tratar um InteruptedException
//   Antes de fazer um join
//   Antes e depois de fazer um wait ou um sleep
// Exemplo:System.out.println(Thread.currentThread().toString() + “ - inicio do run.”);



// Num banquete de javalis assados existem vários cozinheiros e
// glutões concorrentes e uma mesa com capacidade limitada (e.g., só cabem na mesa 10 javalis). Cada cozinheiro
// repetidamente produz um javali assado e coloca-o na mesa. Caso encontre a mesa cheia fica à espera que a mesa fique
// com espaço disponível para depositar o seu javali. Cada glutão repetidamente retira da mesa um javali e consome-o.
// Caso encontre a mesa vazia fica à espera que a mesa contenha de novo algum javali. Sincronizar o recurso mesa por
// forma a coordenar devidamente os vários cozinheiros e glutões. Utilizar ainda mensagens apropriadas para observação
// do comportamento dos vários atores no banquete. Cada Javali deve ser identificado pelo cozinheiro que o produziu e
// por um número de ordem.

//Versão 1: Considerar que os cozinheiros/glutões produzem/consomem um número fixo de javalis.
//Versão 2: Considerar que os cozinheiros/glutões ficam a funcionar um determinado tempo (p.ex. 10s), após o que são
// interrompidos e param.

    }

}