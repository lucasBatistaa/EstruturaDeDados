import javax.swing.JOptionPane;

public class Ex04 {
    public static void ordemDecrescente(int num) {

        if (num >= 0) {
            System.out.println(num);
            ordemDecrescente(num - 1);
        }
    }

    public static void main(String[] args) {
        // Faça uma função recursiva que receba um número inteiro positivo N
        // e exiba todos os números de N até 0 em ordem decrescente

        int num;

        do {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor de N: "));

        } while (num < 0);

        ordemDecrescente(num);
    }
}
