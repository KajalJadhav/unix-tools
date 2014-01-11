package kajaljad.unixtools;

import java.io.BufferedWriter;
import java.io.FileWriter;

class ReduceSpaceOperations extends MyFileReader {
    BufferedWriter writeInto;

    public ReduceSpaceOperations() {
        try {
            writeInto = new BufferedWriter(new FileWriter("data.txt"));
        } catch (Exception e) {
            System.err.println("Error");
        }
    }

    public void reduceSpace(String fileContent) {
        try {
            String content = fileContent.replaceAll("[ ]+", " ");
            System.out.println(content);
            writeInto.write(content);
            writeInto.close();
        } catch (Exception e) {
            System.err.println("Error");
        }
    }
}

public class ReduceSpace {
    public static void main(String[] args) {
        ReduceSpaceOperations operations = new ReduceSpaceOperations();
        String fileContent = operations.readFile(args[0]);
        operations.reduceSpace(fileContent);
    }
}
