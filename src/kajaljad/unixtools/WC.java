package kajaljad.unixtools;

import java.io.BufferedReader;
import java.io.FileReader;

public class WC {
    public static void main(String[] args) {
        Operations operations = new Operations();
        int lines, words, characters;

        String fileContent = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null) {
                fileContent += "\r\n" + currentLine;
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
        lines = operations.countLines(fileContent);
        words = operations.countWords(fileContent);
        characters = operations.countCharacters(fileContent);
        System.out.println(lines + " " + words + " " + characters + " " + args[0]);
    }
}

