package kajaljad.unixtools.cli;

import kajaljad.unixtools.filesystem.MyFileReader;
import kajaljad.unixtools.libraries.UniqOperations;

public class Uniq {
    public static void main(String[] args) {
        UniqOperations operations = new UniqOperations();
        MyFileReader readContent = new MyFileReader();
        String fileData = readContent.readFile(args[0]);
        System.out.println(operations.uniq(fileData));
    }
}
