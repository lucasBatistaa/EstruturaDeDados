
public class Pilha {

    static int topo = -1;
    static int tamanho = 10;
    static int vet[] = new int[tamanho];

    // empilha elemento no topo da pilha
    public static void empilhar(int valor) {
        if (!cheia()) {
            topo++;
            vet[topo] = valor;
        }
    }

    // desempilha elemento do topo da pilha
    public static void desempilhar() {
        if (!vazia()) {
            topo--;
        }
    }

    // retorna elemento do topo da pilha
    public static int topo() {
        if (!vazia()) {
            return vet[topo];
        }

        return -1;
    }

    // Retorna verdadeiro (true) se a pilha está vazia
    public static boolean vazia() {
        if (topo < 0) {
            System.out.println("Pilha está vazia!");
            return true;
        }

        return false;
    }

    // Retorna verdadeiro (true) se a pilha está cheia
    public static boolean cheia() {
        if (topo == (tamanho - 1)) {
            System.out.println("Pilha está cheia!");
            return true;
        }

        return false;
    }

    // retorna numero de elementos da pilha
    public static int tamanho() {
        return (topo + 1);
    }

    public static void main(String[] args) {
        // Implemente a classe Pilha com os seguintes atributos e métodos:
        // - Atributos: int vet[], int topo, int tamanho
        // - Métodos: void empilhar(int), void desempilhar(), int topo(), boolean
        // vazia(), boolean cheia(), int tamanho()
        // Teste sua classe e todas suas funcionalidades!

        empilhar(4);
        empilhar(10);
        empilhar(3);

        desempilhar();

        int elemento = topo();

        if (elemento != -1) {
            System.out.println("Elemento no topo: " + elemento);
        }

        System.out.println("Tamanho da pilha: " + tamanho());
    }

}
