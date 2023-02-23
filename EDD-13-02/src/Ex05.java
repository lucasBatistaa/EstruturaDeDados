import javax.swing.JOptionPane;

public class Ex05 {
    public static int soma(int vector[], int n) {

        if (n >= 0) {
            return (vector[n] + soma(vector, n - 1));
        }

        return 0;
    }

    public static void main(String[] args) {
        // Crie uma função recursiva que retorne a soma dos elementos de um vetor de N
        // inteiros

        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o tamanho do vetor(N): "));

        int vector[] = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número no índice[" + i + "]: "));
        }

        System.out.println("A soma dos elementos é: " + soma(vector, (n - 1)));
    }
}
