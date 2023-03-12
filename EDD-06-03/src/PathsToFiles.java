
import javax.swing.JFileChooser;

public class PathsToFiles {
    JFileChooser chooser = new JFileChooser();
    int returnValue;

    public String pathDirectory() {
        String pathDirectoryWriter = "";

        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        returnValue = chooser.showSaveDialog(chooser);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            pathDirectoryWriter = chooser.getSelectedFile().getAbsolutePath();
        }

        return pathDirectoryWriter;
    }
}
