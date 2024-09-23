import java.util.Stack;
public class Main {
    public static void main(String[] args) {

        //Pilhas = É uma estrutura de dados LIFO. Last-in First-out
        //       Amazena objetos como uma torre vertical
        //       push() para adcionar um objeto ao topo
        //       pop() para remover um objeto do topo

        Stack<String> pilha = new Stack<String>(); // Aqui estamos criando uma pilha utilizando o modulo Stack
        // <> serve para colocarmos o tipo de dado que vamos armazenar na pilha, no nosso caso foi string

        System.out.println(pilha.empty());                                                    //true          empty() confere se a pilha está vazia, no momento ela está
        pilha.push("Forza");
        pilha.push("Devil May Cry 3");
        pilha.push("Minecraft");
        pilha.push("Skyrim");
        pilha.push("Elden Ring");

        System.out.println(pilha.empty());                                                     //false         pois acabamos de adicionar objetos à nossa pilha
        System.out.println(pilha); //[Forza, Devil May Cry 3, Minecraft, Skyrim, Elden Ring]

        pilha.pop();
        System.out.println(pilha);
        // não é necessário especificar pq o pop SEMPRE vai tirar o do topo da pilha (o ultimo a ser inserido)

        // Itens na pilha: [Forza, Devil May Cry 3, Minecraft, Skyrim]
        System.out.println("O objeto no topo é " + pilha.peek());                              // peek()   Isso retorna o objeto no topo da pilha o mantendo nela
        String myFavGame = pilha.pop();                                                        // Aqui estamos armazenando o objeto que foi retirado em uma variável String
        System.out.println( "Retirei meu jogo favorito "+ myFavGame + " da pilha para jogar"); // Skyrim
        System.out.println(pilha);                                                             // [Forza, Devil May Cry 3, Minecraft]

        // Para procurar um objeto usamos a função search(), ela  informa a posição do objeto que estamos procurando.
        System.out.println(pilha.search("Forza")); // 3

        //Vamos supor que somos a Bethesda e temos 1 milhão de cópias de Fallout76 que não foram vendidas e queremos adcionar isso a nossa pilha
        for(int adciona = 0; adciona <1000000; adciona++) {
            pilha.push("Fallout76");
        }
        // variavel int adiciona é criada e seu valor é igual a 0 | int adciona = 0;
        // adiciona vai passar pelo código dentro do for 999999 vezes | adiciona <1000000;
        // a cada vez que adciona executa o código dentro do for, +1 será agregado ao seu valor | adciona++

        System.out.println(pilha);

        // usabilidades de pilhas

        // 1. Recursos de Desfazer/Refazer em Editores de Texto
        // 2. Navegação Voltar/Avançar no Histórico do Navegador
        // 3. Algoritmos de Retrocesso (Backtracking)
        // 4. Chamada de Funções (Pilha de Chamadas)

    }
}
