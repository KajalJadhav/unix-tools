package kajaljad.unixtools;

import java.io.BufferedWriter;
import java.io.FileWriter;

class ReduceSpaceOperations extends MyFileReader{
    BufferedWriter writeInto;
    public ReduceSpaceOperations(){
        try {
            writeInto = new BufferedWriter(new FileWriter("data.txt"));
        } catch (Exception e) {
            System.err.println("Error");
        }
    }
    public void reduceSpace(String fileContent) {
        String[] result = fileContent.split("\r\n");
        try {
        for (int i = 0; i < result.length-1; i++) {
            String content = result[i].replaceAll("\\s+"," ");
            System.out.println(content);
            writeInto.write(content+"\r\n");
        }
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
