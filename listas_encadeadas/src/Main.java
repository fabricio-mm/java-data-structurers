import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        //Listas encadeadas funcionam da seguinte forma. Temos um endereço da memória que é ligado ao próximo, assim sucessivamente
        //Endereços de memória = Nodes. Nodes são locações de memória não consecutiva
        //Isso significa que cada node tem uma ponteira encaminhando para o próximo. Exemplo:
        //[A][addr: str B] -----> [B][addr: str C] -----> [C][addr: str D] -----> [D][addr: null]        Como se estivesse seguinte pistas para resolver um misterio
        //Uma lista encadeada diferente de um arraylist tem uma vantagem na utilização de memória quando falamos de adcionar e remover itens
        //Mas sofre quando se trata de localizar um elemento por causa da necessidade de percorrer T-O-D-O o vetor em busca dele.


        LinkedList<String> list = new LinkedList<String>(); //Isso é uma lista encadeada, usando o método push(), ela se comportará como uma pilha
        /*list.push("A");
        list.push("B");
        list.push("C");
        list.push("D");
        list.push("E");
        list.push("F");
        list.pop()*/

        // Para que ela se comporte como um lista, utilizamoso método offer()
        list.offer("A");
        list.offer("B");
        list.offer("C");
        list.offer("D");
        list.offer("E");
        list.offer("F");
        // list.poll();

        //Adicionando elementos em uma lista encadeada
        list.add(6, "G"); //seleciona o index do ultimo item e adiciona o próximo
        list.addFirst("a"); // na primeira posição
        list.addLast("H"); // na ultima posição
        System.out.println(list);

        //Removendo da lista
        list.remove("G");
        String primeiro = list.removeFirst();
        String ultimo = list.removeLast();
        System.out.println(list);

        //Procurando index dos elementos da lista
        System.out.println(list.indexOf("F")); // especifico
        System.out.println(list.peekFirst()); // primeiro
        System.out.println(list.peekLast()); // ultimo

        System.out.println(list);

        //      1. vantagens
        //      * estrutura de dados de dinamica (pode usar mémoria para adicionar dados enquando roda)
        //      * inserir e deletar nodes é bme fácil. O(1)
        //      * Sem/Baixo desperdicio de memória.

        //      2. desvantagens
        //      * maior uso de memória (adicionando um node)
        //      * sem acesso randomico de elementos ( index[i])
        //      * acessar e procurar elementos consume mais tempo. O(n)

        //      3. usos
        //      * implementas filas e pilhas
        //      * navegação GPS
        //      * playlist de música

    }
}