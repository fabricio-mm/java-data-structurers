import java.util.Queue;
import java.util.LinkedList;


public class Main{
    public static void main(String[] args) {
        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        //Filas = Estrutura de dados baseada em FIFO. First-in, First-out (Pense numa fila de pessoas)
        //              Uma coleção para armzenar elementos por ordem de prioridade de processamento
        //              Uma estrutura de dados Linear

        //              add     = enqueue, offer()
        //              remove  = dequeue, poll()

        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        // A interface Queue em si não pode ser instanciada diretamente. Precisamos de uma classe concreta para criar um objeto de fila.
        // A classe LinkedList é uma lista duplamente encadeada, o que significa que cada elemento possui referências para o próximo e o anterior
        // Obs... A lib Queue herda alguns métodos da lib Collection como o isEmpty() para verificar se a fila está vazia.

        Queue<String> fila = new LinkedList<String>();

        fila.offer("Gumball"); //Head, o primeiro da fila
        fila.offer("Bob Esponja");
        fila.offer("Mordecai");
        fila.offer("Johnny Test"); //Tail, o último da fila
        System.out.println(fila); //[Gumball, Bob Esponja, Mordecai, Johnny Test]

        //Conferindo o tamanho da fila
        System.out.println(fila.size()); // Esse método também faz parte da Lib Collction

        //Conferindo se alguma pessoa realmente está na fila
        System.out.println(fila.contains("Gumball")); //Lib Collction == retorna um valor booleano

        // Método peek(), esse método retorna para nós o primeiro (head) da fila sem o remover
        System.out.println(fila.peek()); //Gumball

        //Método poll(), remove o primeiro da fila
        fila.poll(); //Gumball saiu da fila
        fila.poll(); //Bob Esponja saiu da fila

        //Armazenando quem saiu da fila em uma variável
        String pessoa = fila.poll();
        System.out.println(pessoa + " foi atendido. Proximo!");
    }
}