package kajaljad.unixtools.libraries;

import kajaljad.unixtools.filesystem.MyFileReader;

public class UniqOperations extends MyFileReader {
    public void uniq(String text) {
        String[] fileContent = text.split("\r\n");
        System.out.println(fileContent[0]);
        for (int i = 1; i < fileContent.length; i++) {
            if (!fileContent[i].equals(fileContent[i - 1])) {
                System.out.println(fileContent[i]);
            }
        }
    }
}
