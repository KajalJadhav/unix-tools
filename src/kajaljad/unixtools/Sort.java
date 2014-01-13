package kajaljad.unixtools;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class SortOperations {
    public String[] sort(String fileContent) {
        String[] lines = fileContent.split("\r\n");
        Arrays.sort(lines);
        return lines;
    }

    public String[] reverseData(String fileContent) {
        String[] lines = sort(fileContent);
        List<String> strList = Arrays.asList(lines);
        Collections.reverse(strList);
        lines = strList.toArray(new String[strList.size()]);
        return lines;
    }
}

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
