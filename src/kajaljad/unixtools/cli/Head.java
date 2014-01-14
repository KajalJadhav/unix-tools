package kajaljad.unixtools.cli;

import kajaljad.unixtools.libraries.HeadLib;
import kajaljad.unixtools.filesystem.MyFileReader;

public class Head {
    public static void main(String[] args) {
        MyFileReader rf = new MyFileReader();
        int length = 10;
        String fileContent;
        String fileName = args[0];
        if (args.length == 2) {
            length = Math.abs(Integer.parseInt(args[0]));
            fileName = args[1];
        }
        fileContent = rf.readFile(fileName);
        HeadLib headOperations = new HeadLib(length,fileContent);
        String lines = headOperations.head();
        String[] result = lines.split("\r\n");
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : result) {
            stringBuilder.append(s);
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder.toString());
    }
}
