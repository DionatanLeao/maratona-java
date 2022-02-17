package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretory = new File("folder");
        boolean isDiretoryCreated = fileDiretory.mkdir();
        System.out.println(isDiretoryCreated);
//        File file = new File("C:\\workspace\\maratona-java\\folder\\file.txt");
        File file = new File(fileDiretory,"file.txt");
        boolean newFile = file.createNewFile();
        System.out.println(newFile);

        File fileRenamed = new File(fileDiretory, "file_renamed.txt");
        boolean isRenamed = file.renameTo(fileRenamed);
        System.out.println(isRenamed);

        File diretoryRename = new File("folder2");
        boolean isDiretoryRenamed = fileDiretory.renameTo(diretoryRename);
        System.out.println(isDiretoryRenamed);
    }
}
