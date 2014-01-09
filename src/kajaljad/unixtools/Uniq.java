package kajaljad.unixtools;

import java.io.BufferedReader;
import java.io.FileReader;

class UniqOperations {
    public void uniq(String text) {
        String[] result;
        result = text.split("\r\n");
        for (int i = 1; i < result.length - 1; i++) {
            if (0 != result[i].compareTo(result[i + 1])) {
                System.out.println(result[i]);
            }
        }
    }
}

public class Uniq {
    public static void main(String[] args) {
        UniqOperations operations = new UniqOperations();
        BufferedReader bufferedReader;
        String fileContent = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(args[0]));
            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null) {
                fileContent += "\r\n" + currentLine;
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
        operations.uniq(fileContent);
    }
}
