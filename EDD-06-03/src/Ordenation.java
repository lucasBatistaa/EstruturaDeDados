
public class Ordenation {

    public int[] ordenacao(String[] vet, int n) {
        boolean trocou = false;
        int i = 0;

        int vectorInNumber[] = new int[n];

        for (int c = 0; c < n; c++) {
            vectorInNumber[c] = Integer.parseInt(vet[c]);
        }

        do {
            trocou = false;

            for (int j = 0; j < (n - 1 - i); j++) {
                if (vectorInNumber[j] > vectorInNumber[j + 1]) {
                    troca(vectorInNumber, j, j + 1);
                    trocou = true;
                }
            }

            i++;
        } while (trocou);

        return vectorInNumber;
    }

    public void troca(int[] vet, int a, int b) {
        int aux = vet[a];
        vet[a] = vet[b];
        vet[b] = aux;
    }
}
