package kajaljad.unixtools;

import java.io.BufferedReader;
import java.io.FileReader;

class TailOperations {
    public void tail(int size, String text) {
        String[] result = text.split("\r\n");
        for (int i = result.length - size; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}

public class Tail {
    public static void main(String[] args) {
        TailOperations operations = new TailOperations();
        int length = 10;
        BufferedReader bufferedReader;
        String fileContent = null;
        try {
            if (args.length == 2) {
                length = Integer.parseInt(args[0]) * (-1);
                bufferedReader = new BufferedReader(new FileReader(args[1]));
            } else {
                bufferedReader = new BufferedReader(new FileReader(args[0]));
            }
            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null)
                fileContent += "\r\n" + currentLine;
        } catch (Exception e) {
            System.out.println("Error");
        }
        operations.tail(length, fileContent);
    }
}
