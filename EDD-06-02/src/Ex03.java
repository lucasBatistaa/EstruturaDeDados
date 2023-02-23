import javax.swing.JOptionPane;

public class Ex03 {
    public static int Insere_Exclusivo(int vet[], int n) {
        int newNumber;
        boolean flag;

        do {
            flag = true;
            newNumber = (int) Math.floor(Math.random() * (n + 1));

            for (int number : vet) {
                if (newNumber == number) {
                    flag = false;
                }
            }

        } while (flag == false);

        return newNumber;
    }

    public static void main(String[] args) {
        // Crie um método chamado Insere_Exclusivo(int vet[], int N) que alimenta um
        // vetor de N
        // elementos com valores aleatórios entre 1 e N sem que ocorram números
        // repetidos. Exiba o vetor gerado.

        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade do vetor: "));
        int vet[] = new int[n];

        for (int i = 0; i < n; i++) {
            vet[i] = Insere_Exclusivo(vet, n);
        }

        for (int number : vet) {
            System.out.println(number);
        }
    }
}
