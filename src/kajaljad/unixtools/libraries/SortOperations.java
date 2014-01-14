package kajaljad.unixtools.libraries;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortOperations {
    public String[] sortData(String fileContent) {
        String[] lines = fileContent.split("\r\n");
        Arrays.sort(lines);
        return lines;
    }

    public String[] reverseData(String fileContent) {
        String[] lines = sortData(fileContent);
        List<String> strList = Arrays.asList(lines);
        Collections.reverse(strList);
        lines = strList.toArray(new String[strList.size()]);
        return lines;
    }
}
