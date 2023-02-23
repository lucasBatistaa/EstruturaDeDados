package Ex04;

public class Ex04 {
    public static void main(String[] args) {
        // Crie um programa em JAVA que faça a leitura de um arquivo de texto
        // contendo um número inteiro em cada linha onde: O número da primeira linha
        // é o valor de N e os números subsequentes são a sequência numérica de
        // interesse.
        // Armazene os valores lidos em um vetor e exiba-o. Aproveite sua implementação
        // do Exercício 1.
        // e escreva em outro arquivo a sequência numérica em ordem inversa.

        Arquivos file = new Arquivos();

        String vectorString[] = file.fileRead().split(", "); // size, numeros => {4, 5, 4, 6, 1}

        int sizeVector = Integer.parseInt(vectorString[0]);

        String inverseVectorString[] = new String[sizeVector];
        int vectorInNumber[] = new int[sizeVector];

        for (int i = 0; i < sizeVector; i++) {
            vectorInNumber[i] = Integer.parseInt(vectorString[i + 1]);
            inverseVectorString[(sizeVector - 1) - i] = vectorString[i + 1];
        }

        for (int number : vectorInNumber) {
            System.out.println(number);
        }

        file.Write(inverseVectorString);
    }
}
