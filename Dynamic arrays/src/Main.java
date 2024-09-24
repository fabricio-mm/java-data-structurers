public class Main {
    // O que é um array dinamico? um array dinamico é basicamente um array que aumenta o numero da sua capacidade conforme necessário
    // Um java, é chamado de ArrayList
    // Vantagens de um array dinamico: Acesso aleátorio aos elementos 0(1)
    // Boa referencia de utilização de memória já que os dados geralmente se encontram muitos proximos uns dos outro
    // Facil de inserir e deletar dados no final

    //Desvantagens;
    // Gasta mais memória
    // Tempo de consumo para alterar elementos O(n)
    public static void main(String[] args) {
        DynamicArray listarray = new DynamicArray(3);
        System.out.println(listarray.capacidade);
        listarray.add("A");
        listarray.add("B");
        listarray.add("C");
        listarray.insert(0, "X"); //repare que o nosso método grow() está funcionando, o array dobrou de tamanho.
        listarray.delete("A");
        listarray.delete("C"); // shrink() divide o array pela metade

        System.out.println("C position: " + listarray.search("C"));
        System.out.println(listarray);
        System.out.println("Size: " + listarray.size);
        System.out.println("Capacidade: " + listarray.capacidade);
        System.out.println("Empty: " + listarray.isEmpty());
    }
}