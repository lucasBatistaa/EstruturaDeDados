import javax.swing.JOptionPane;

public class Ex02 {
    public static void main(String[] args) {
        // Crie um programa em JAVA que solicita ao usuário o valor de N e, 
        // posteriormente, alimente o vetor com valores aleatórios entre 0 e M (M também é informado pelo usuário). Exiba o vetor gerado.

        int totalNumbers = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade de números que você deseja: "));
        int vector[] = new int[totalNumbers];
        int maxValue = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor máximo do número aleatório: "));

        for (int i = 0; i < totalNumbers; i++) {
            vector[i] = (int) Math.floor(Math.random() * (maxValue + 1)); 
        }

        for (int number : vector) {
            System.out.println(number);
        }
    }
}
