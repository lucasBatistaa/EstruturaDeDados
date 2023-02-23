package Ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Arquivos {
    JFileChooser chooser = new JFileChooser();
    int returnValue;

    public void Write(String vector[]) {
        try {
            String pathFileWriter = "";

            returnValue = chooser.showSaveDialog(chooser);

            if (returnValue == JFileChooser.APPROVE_OPTION) {
                pathFileWriter = chooser.getSelectedFile().getAbsolutePath();
            }

            System.out.println("Escrevendo no arquivo " + pathFileWriter);

            FileWriter writer = new FileWriter(pathFileWriter, true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);

            for (String number : vector) {
                bufferWriter.append(number + "\n");
            }

            bufferWriter.close();
            writer.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public String fileRead() {
        try {
            String line;
            String fileRead = "";
            String readNumbers = "";

            FileNameExtensionFilter filter = new FileNameExtensionFilter("txt ou doc", "txt");

            chooser.addChoosableFileFilter(filter);

            returnValue = chooser.showOpenDialog(chooser);

            if (returnValue == JFileChooser.APPROVE_OPTION) {
                fileRead = chooser.getSelectedFile().getAbsolutePath();
            }

            BufferedReader bufferReader = new BufferedReader(new FileReader(fileRead));
            System.out.println("Lendo o arquivo " + fileRead);

            while ((line = bufferReader.readLine()) != null) {
                readNumbers += line + ", ";
            }

            bufferReader.close();

            return readNumbers;

        } catch (Exception e) {
            System.out.println(e);

        }

        return "";

    }

}
