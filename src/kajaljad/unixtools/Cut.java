package kajaljad.unixtools;

import java.io.BufferedReader;
import java.io.FileReader;

class CutOperations {
    public void cut(int fieldNumber, String input) {
        String lines[] = input.split("\n");
        String words[];
        String result = "";
        for (int i = 0; i < lines.length; i++) {
            words = lines[i].split(" ");
            result = result + words[fieldNumber - 1] + "\r\n";
        }
        System.out.println(result);
    }
}

public class Cut {
    public static void main(String[] args) {
        CutOperations operations = new CutOperations();
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
        operations.cut(Integer.parseInt(args[1]), fileContent);
    }
}
