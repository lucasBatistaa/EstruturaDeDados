import javax.swing.JOptionPane;

public class Ex01 {
    public static void main(String[] args) throws Exception {
        // Crie um programa em que solicita ao usuário o valor de N e, posteriormente os N números que devem ser armazenados em um vetor. 
        // Em um segundo momento, exiba o vetor na ordem em que os elementos foram digitados e em ordem inversa.

        int totalNumbers =  Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos números você deseja inserir? "));
        int vector[] = new int[totalNumbers];
        int inverseVector[] = new int[totalNumbers];

        for (int i = 0; i < totalNumbers; i++) {
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o " + (i + 1) + "º número: "));
            inverseVector[(totalNumbers - 1) - i] = vector[i];
        }

        System.out.println("Ordem inserida pelo usuário: ");
        
        for (int number : vector) {
            System.out.println(number);
        }

        System.out.println("\nOrdem inversa: ");

        for (int number : inverseVector) {
            System.out.println(number);
        }

    }
}
