public class App {

    public static void ordenacao_versao1(int vet[], int n) {
        boolean flag = false; // false = não ordenado

        for (int i = 0; i < n; i++) {
            if (!flag) {
                int cont = n - 1 - i;
                for (int j = 0; j < (cont); j++) {
                    if (vet[j] > vet[j + 1]) {
                        int aux = vet[j];
                        vet[j] = vet[j + 1];
                        vet[j + 1] = aux;
                    } else if (j == (cont - 1)) {
                        flag = true;
                    }
                }
            } else {
                i = n;
            }
        }

    }

    public static void ordenacao_versao2(int vet[], int n) {
        boolean flag = false; // false = não ordenado
        int i = 0;

        // false = não ordenado
        while (flag == false) {
            int cont = n - 1 - i;

            for (int j = 0; j < (cont); j++) {
                if (vet[j] > vet[j + 1]) {
                    int aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                } else if (j == (cont - 1)) {
                    flag = true;
                }
            }

            i++;
        }

    }

    public static void ordenacao_versao3(int vet[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - 1); j++) {
                if (vet[j] > vet[j + 1]) {
                    int aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }
    }

    public static void ordenacao_versao4(int vet[], int n) {
        boolean flag = true; // false = não ordenado
        int i = 0;

        while (flag) {

            flag = false;
            int cont = n - 1 - i;

            for (int j = 0; j < (cont); j++) {
                if (vet[j] > vet[j + 1]) {
                    int aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;

                    flag = true;
                } else if (j == (cont - 1)) {
                    i++;
                }
            }

            i++;
        }

    }

    static void selection(int[] vet, int n) {
        for (int fixo = 0; fixo < (n - 1); fixo++) {
            int menor = fixo;

            for (int i = menor + 1; i < n; i++) {
                if (vet[i] < vet[menor]) {
                    menor = i;
                }
            }

            if (menor != fixo) {
                int t = vet[fixo];
                vet[fixo] = vet[menor];
                vet[menor] = t;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        int n = 1000;
        int vet[] = new int[n];

        long init, end;

        for (int i = 0; i < n; i++) {
            vet[i] = (int) Math.floor(Math.random() * n);

            // vetor totalmente ordenado
            // vet[i] = i;

            // vetor totalmente desordenado
            // vet[i] = n - 1;
        }

        init = System.currentTimeMillis();
        ordenacao_versao1(vet.clone(), n);
        end = System.currentTimeMillis();

        System.out.println("VERSAO 1: " + (end - init) + " ms");

        init = System.currentTimeMillis();
        ordenacao_versao2(vet.clone(), n);
        end = System.currentTimeMillis();

        System.out.println("VERSAO 2: " + (end - init) + " ms");

        init = System.currentTimeMillis();
        ordenacao_versao3(vet.clone(), n);
        end = System.currentTimeMillis();

        System.out.println("VERSAO 3: " + (end - init) + " ms");

        init = System.currentTimeMillis();
        ordenacao_versao4(vet.clone(), n);
        end = System.currentTimeMillis();

        System.out.println("VERSAO 4: " + (end - init) + " ms");

        init = System.currentTimeMillis();
        selection(vet.clone(), n);
        end = System.currentTimeMillis();

        System.out.println("Selection: " + (end - init) + " ms");
    }
}
