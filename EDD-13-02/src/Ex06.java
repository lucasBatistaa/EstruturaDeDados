import javax.swing.JOptionPane;

public class Ex06 {
    public static int menor(int vector[], int n) {
        if (n > 0) {
            int x = menor(vector, n - 1);

            if (vector[n] > x) {
                return x;
            } else {
                return vector[n];
            }
        }

        return vector[n];
    }

    public static void main(String[] args) {
        // Escreva uma função recursiva que retorne o menor elemento de um vetor

        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o tamanho do vetor(N): "));

        int vector[] = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número no índice[" + i + "]: "));
        }

        System.out.println("O menor valor é: " + menor(vector, n - 1));
    }
}
