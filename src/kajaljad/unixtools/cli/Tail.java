package kajaljad.unixtools.cli;

import kajaljad.unixtools.filesystem.MyFileReader;
import kajaljad.unixtools.libraries.TailOperations;

public class Tail {
    public static void main(String[] args) {
        TailOperations operations = new TailOperations();
        MyFileReader fileData = new MyFileReader();
        int length = 10;
        String fileContent = null;
        try {
            if (args.length == 2) {
                length = Math.abs(Integer.parseInt(args[0]));
                fileContent = fileData.readFile(args[1]);
            } else {
                fileContent = fileData.readFile(args[0]);
            }
        } catch (Exception e) {
            System.err.println("Error");
        }
        operations.tail(length, fileContent);
    }
}
