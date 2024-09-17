import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Main{
    public static void main(String[] args) {
        // Fila de prioridade = estrtura de dados FIFO que serve elementos com maior prioridade primeiro


        Queue<Double> notas = new LinkedList<Double>();
        notas.offer(3.4);
        notas.offer(5.5);
        notas.offer(4.5);
        notas.offer(9.5);
        notas.offer(2.5);

        while (!notas.isEmpty()) {
            System.out.println(notas.poll());
            //Enquanto minhas fila não estiver vazia, remova os elementos presentes nela operador NOT = !
            //Resultado usando LinkedList: 3.4 5.5 4.5 9.5 2.5
            //Repare que a lista não teve ordenação nenhuma
        }

        Queue<String> letras = new PriorityQueue<>();
        letras.offer("F");
        letras.offer("X");
        letras.offer("A");
        letras.offer("R");
        letras.offer("Y");

        // String ls1 = letras.poll(); // A
        // String ls2 = letras.poll(); // F
        // String ls3 = letras.poll(); // R
        // String ls4 = letras.poll(); // X
        // String ls5 = letras.poll(); // Y
        // System.out.println(ls1 + ls2 + ls3 + ls4 + ls5);

        while (!letras.isEmpty()) {
            System.out.println(letras.poll());
            // O resultado será sempre uma lista ordenada, pois o método poll() quando usamos a classe PriorityQueue
            // Sempre seguirá a ordem alfabética ou a ordem crescente se for uma fila de números
            // Se você quiser a ordem reversa, basta passar o comparador Collections.reverseOrder() como parâmetro

            // Ficando assim == Queue<String> letras = new PriorityQueue<>(Collections.reverseOrder());
        }

    }
}