package kajaljad.unixtools.cli;

import kajaljad.unixtools.filesystem.MyFileReader;
import kajaljad.unixtools.libraries.TailOperations;

public class Tail {
    public static void main(String[] args) {
        MyFileReader rf = new MyFileReader();
        int length = 10;
        String fileData;
        String fileName = args[0];
        if (args.length == 2) {
            length = Math.abs(Integer.parseInt(fileName));
            fileName = args[1];
        }
        fileData = rf.readFile(fileName);
        TailOperations tailOperations = new TailOperations(length, fileData);
        String lines = tailOperations.tail();
        String[] result = lines.split("\r\n");
        StringBuilder stringBuilder = new StringBuilder();
        for (String line : result) {
            stringBuilder.append(line);
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder.toString());
    }
}
