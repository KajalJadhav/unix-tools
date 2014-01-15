package kajaljad.unixtools.cli;

import kajaljad.unixtools.filesystem.MyFileReader;
import kajaljad.unixtools.libraries.TailOperations;

public class Tail {
    public static void main(String[] args) {
        String fileName = "";
        String fileData;
        String result;
        TailOperations operations = new TailOperations();
        MyFileReader rf = new MyFileReader();
        int noOfLines;
        try {
            fileName = operations.getFileName(args);
            noOfLines = operations.getNumberOfLines(args);
            fileData = rf.readFile(fileName);
            result = operations.getTailLines(fileData,noOfLines);
        } catch (NullPointerException ex) {
            System.err.println("Please Specify File Name");
            return;
        } catch (Exception ex) {
            System.err.println(" " + fileName + " :No such File or Directory");
            return;
        }
        System.out.println(result);
    }
}
