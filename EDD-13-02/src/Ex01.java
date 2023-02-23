import javax.swing.JOptionPane;

public class Ex01 {

    public static int soma(int num) {
        if (num == 1) {
            return num;
        } else {
            return (num + soma(num - 1));
        }
    }

    public static void main(String[] args) {
        // Crie uma função recursiva int soma(int) que receba um
        // número inteiro positivo N e calcule o somatório dos números de 1 a N

        // recebe o N
        int num;

        do {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número (N > 0): "));

        } while (num < 1);

        // Chamada da função soma(N)
        System.out.println("Valor da soma: " + soma(num));
    }
}
