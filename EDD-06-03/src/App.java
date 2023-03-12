
import javax.swing.JOptionPane;

public class App {

    static Files file = new Files();
    static Ordenation order = new Ordenation();
    static PathsToFiles path = new PathsToFiles();

    static int totalNumbers[] = { 1000, 5000, 10000, 30000 };

    static String pathDirectory;
    static String pathFile;

    public static void main(String[] args) throws Exception {
        // Considerando seus conhecimentos sobre trabalhar com arquivos, crie uma
        // estrutura que permite
        // a importação de arquivos com os valores a serem ordenados.

        // Esses arquivos devem conter 1.000, 5.000, 10.000 e 30.000 valores que deverão
        // ser importados,
        // ordenados e exportados com a adição do texto "_ord" no nome do arquivo.

        // Exemplo:
        // - Arquivo de entrada 5000.txt, após ordenação, arquivo de saída 5000_ord.txt

        String typeVector[] = { "Ordenado", "Aleatório", "Não ordenado" };

        int typeChoiced = JOptionPane.showOptionDialog(null, "Escolha o tipo de vetor", "Vetor",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, typeVector, typeVector[0]);

        // selecionar pasta para salvar arquivos
        JOptionPane.showMessageDialog(null, "Selecione a pasta que serão salvos os arquivos criados!", "SALVAR",
                JOptionPane.PLAIN_MESSAGE);

        pathDirectory = path.pathDirectory(); // caminho
        generateVector(typeChoiced);

        for (int total : totalNumbers) {
            System.out.println();

            pathFile = pathDirectory + "\\" + Integer.toString(total);

            String vector[] = file.fileRead(pathFile, total);
            int vectorOrder[] = order.ordenacao(vector, total);

            file.Write(vectorOrder, pathFile, true);

            JOptionPane.showMessageDialog(null, "Números do arquivo: " + total + ".txt" + " foram ordenados!",
                    "Ordenação",
                    JOptionPane.PLAIN_MESSAGE);
        }
    }

    public static void generateVector(int typeVector) {

        for (int total : totalNumbers) {
            int vector[] = new int[total];

            for (int i = 0; i < total; i++) {

                switch (typeVector) {
                    case 0:
                        // vetor totalmente ordenado
                        vector[i] = i;
                        break;

                    case 1:
                        // vetor aleatorio
                        vector[i] = (int) (Math.random() * (total * 2));
                        break;

                    case 2:
                        // vetor totalmente desordenado
                        vector[i] = total - i;
                        break;

                }
            }

            pathFile = pathDirectory + "\\" + Integer.toString(total);

            file.Write(vector, pathFile, false); // escrever vetor no arquivo
        }

        JOptionPane.showMessageDialog(null, "Arquivos criados! \nPasta: " + pathDirectory, "Arquivos",
                JOptionPane.PLAIN_MESSAGE);
    }
}
