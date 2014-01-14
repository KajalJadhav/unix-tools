package kajaljad.unixtools.cli;

import kajaljad.unixtools.filesystem.MyFileReader;
import kajaljad.unixtools.libraries.SortOperations;

public class Sort {
    public static void main(String[] args) {
        String[] sortedData;
        SortOperations operations = new SortOperations();
        MyFileReader fileData = new MyFileReader();
        String fileContent;
        if (args.length == 2 && 0 == args[0].compareTo("-r")) {
            fileContent = fileData.readFile(args[1]);
            String[] reverse = operations.reverseData(fileContent);
            for (String s : reverse) {
                System.out.println(s);
            }
        } else {
            fileContent = fileData.readFile(args[0]);
            sortedData = operations.sort(fileContent);
            for (String s : sortedData) {
                System.out.println(s);
            }
        }
    }
}
