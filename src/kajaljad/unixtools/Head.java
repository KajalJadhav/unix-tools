package kajaljad.unixtools;

import java.io.BufferedReader;
import java.io.FileReader;

class HeadOperations {
    public void head(int size, String text) {
        String[] result = text.split("\r\n");
        for (int i = 1; i < size; i++) {
            System.out.println(result[i]);
        }
    }
}

public class Head {
    public static void main(String[] args) {
        HeadOperations operations = new HeadOperations();
        int length = 10;
        String fileContent = null;
        BufferedReader bufferedReader;
        try {
            if (args.length == 2) {
                length = Integer.parseInt(args[0]) * (-1);
                bufferedReader = new BufferedReader(new FileReader(args[1]));
            } else {
                bufferedReader = new BufferedReader((new FileReader(args[0])));
            }
            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null)
                fileContent += "\r\n" + currentLine;
        } catch (Exception e) {
            System.out.println("Error");
        }
        operations.head((length + 1), fileContent);
    }
}
