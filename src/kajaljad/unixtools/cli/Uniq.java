package kajaljad.unixtools.cli;

import kajaljad.unixtools.filesystem.MyFileReader;
import kajaljad.unixtools.libraries.UniqOperations;

public class Uniq {
    public static void main(String[] args) {
        String fileName = "";
        String result;
        String fileData;
        UniqOperations operations = new UniqOperations();
        MyFileReader rf = new MyFileReader();
        try {
            fileName = args[0];
            fileData = rf.readFile(fileName);
        } catch (NullPointerException ex) {
            System.err.println("Please Specify File Name");
            return;
        } catch (Exception ex) {
            System.err.println(" " + fileName + " :No such File or Directory");
            return;
        }
        result = operations.getUniqLines(fileData);
        System.out.println(result);
    }
}
