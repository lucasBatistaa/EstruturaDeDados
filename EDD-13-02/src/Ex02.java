import javax.swing.JOptionPane;

public class Ex02 {

    public static double pot(int x, int n) {
        System.out.println(n);

        if (n == 0) { // expoente 0, resultado = 1
            return 1;
        } else if (n > 0) { // expoente positivo
            return (x * pot(x, n - 1));
        } else { // expoente negativo, muda o sinal para positivo
            return 1 / pot(x, -n);
        }
    }

    public static void main(String[] args) {
        // Implemente, de forma recursiva, uma função int pot(int x, int n) que,
        // dados dois números inteiros x e n, calcula o valor de x^n

        int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor de X: "));
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor de N: "));

        System.out.println("Valor da potência: " + x + " ^ " + n + " = " + pot(x, n));
    }
}
