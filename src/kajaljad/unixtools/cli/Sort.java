package kajaljad.unixtools.cli;

import kajaljad.unixtools.filesystem.MyFileReader;
import kajaljad.unixtools.libraries.SortOperations;

public class Sort {
    public static void main(String[] args) {
        String[] sortedData;
        SortOperations so = new SortOperations();
        MyFileReader rf = new MyFileReader();
        String fileContent;
        if (args.length == 2 && 0 == args[0].compareTo("-r")) {
            fileContent = rf.readFile(args[1]);
            String[] reverse = so.reverseData(fileContent);
            for (String s : reverse)
                System.out.println(s);
        } else {
            fileContent = rf.readFile(args[0]);
            sortedData = so.sort(fileContent);
            for (String s : sortedData)
                System.out.println(s);
        }
    }
}

