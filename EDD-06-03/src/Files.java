
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Files {

    public void Write(int vector[], String pathFile, boolean overwrite) {
        try {

            if (overwrite) {
                pathFile += "_ord.txt";
            } else {
                pathFile += ".txt";
            }

            System.out.println("Escrevendo no arquivo: " + pathFile);

            FileWriter writer = new FileWriter(pathFile, false);
            BufferedWriter bufferWriter = new BufferedWriter(writer);

            for (int number : vector) {
                bufferWriter.append(number + ", ");
            }

            bufferWriter.close();
            writer.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public String[] fileRead(String pathFile, int total) {

        String line;
        String readNumbers = "";

        try {

            pathFile += ".txt";
            System.out.println("Lendo o arquivo: " + pathFile);
            BufferedReader bufferReader = new BufferedReader(new FileReader(pathFile));

            while ((line = bufferReader.readLine()) != null) {
                readNumbers += line;
            }

            bufferReader.close();

            String vector[] = readNumbers.split(", ");

            return vector;

        } catch (Exception e) {
            System.out.println(e);

        }

        String vector[] = {};

        return vector;
    }
}