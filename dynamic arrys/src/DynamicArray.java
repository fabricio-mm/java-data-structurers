//Criando uma classe para nosso array
public class DynamicArray {
    int size; //Representa o tamanho atual do array
    int capacidade = 10; // A capacidade que por padrão seria 10
    Object[] array; // Um array de objetos do tipo object que vai armazenar os elementos

    public DynamicArray() {
        this.array = new Object[capacidade]; //O construtor padrão que inicia com a capacidade 10
    }

    public DynamicArray(int capacidade) { // Contrutor que aceita que possamos dar uma capacidade da nossa preferencia.
        this.capacidade = capacidade;
        this.array = new Object[capacidade];
    }

    public void add(Object data) { //permite adcionar elementos ao final do array;
        if (size >= capacidade) {
            grow();
        }
        array[size] = data;
        size++;

    }

    public void insert(int index, Object data) { //permite inserir um elemento em qualquer lugar do array
        if (size >= capacidade) {
            grow();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];

        }
        array[index] = data;
        size++;


    }

    public void delete(Object data) { // remove um elemento do array
        for (int i = 0; i < size; i++) {
            if (array[i] == data) {
                for (int j = 0; j < (size - i - 1); j++) {
                    array[i + j] = array[i + j + 1];
                }
                array[size - 1] = null;
                size--;
                if (size <= (int) (capacidade / 3)) {
                    shrink();
                }
                break;
            }
        }

    }

    public int search(Object data) { // procura um elemento no array
        for (int i = 0; i < size; i++) {
            if (array[i] == data) {
                return i;
            }
        }
        return -1;
    }

    private void grow() { // dobra o array de tamanho quando ele atinge o maximo da capacidade
        int novacapacidade = (capacidade * 2);
        Object[] newArray = new Object[novacapacidade];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacidade = novacapacidade;
        array = newArray;
    }

    private void shrink() { //divide nosso array pela metade quando 1/3 dele estiver sendo usado
        int novacapacidade = (capacidade / 2);
        Object[] newArray = new Object[novacapacidade];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacidade = novacapacidade;
        array = newArray;
    }

    public boolean isEmpty() { // Confere se o array está vazio
        return size == 0;
    }

    public String toString() { // Converte os objetos inseridos no array para string

        String string = "";
        for (int i = 0; i < capacidade; i++) {
            string += array[i] + ", ";
        }
        if (string != "") {
            string = "[" + string.substring(0, string.length() - 2) + "]";
        } else {
            string = "[]";
        }
        return string;
    }
}
