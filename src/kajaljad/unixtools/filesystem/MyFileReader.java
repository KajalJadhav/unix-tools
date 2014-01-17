package kajaljad.unixtools.filesystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyFileReader {
    public String readFile(String fileName) {
        String fileContent;
        fileContent = "";
        File file = new File(fileName);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                if (fileContent == "")
                    fileContent += scanner.nextLine();
                fileContent += "\r\n" + scanner.nextLine();
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File Not Found");
        }
        return fileContent;
    }
}

