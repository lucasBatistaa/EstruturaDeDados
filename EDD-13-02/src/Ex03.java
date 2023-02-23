import javax.swing.JOptionPane;

public class Ex03 {
    public static void ordemCrescente(int num) {
        if (num >= 0) {
            ordemCrescente(num - 1);
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        // Faça uma função recursiva que receba um número inteiro positivo N
        // e exiba todos os números de 0 até N em ordem crescente

        // recebe numero N
        int num;

        do {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número inteiro positivo N: "));

        } while (num < 0);

        // chama a função - ordemCrescente()
        ordemCrescente(num);
    }
}
