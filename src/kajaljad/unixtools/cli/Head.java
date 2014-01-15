package kajaljad.unixtools.cli;

import kajaljad.unixtools.libraries.HeadLib;
import kajaljad.unixtools.filesystem.MyFileReader;

public class Head {
    public static void main(String[] args) {
        int length = 10;
        String fileName = args[0];
        String fileData;
        StringBuilder stringBuilder = new StringBuilder();
        Head head = new Head();
        MyFileReader readContent = new MyFileReader();
        String[] processArgs = head.getArguements(args);
        if (processArgs[1] != null) {
            length = Math.abs(Integer.parseInt(processArgs[1]));
            fileName = processArgs[0];
        }
        fileData = readContent.readFile(fileName);
        HeadLib headLib = new HeadLib(length, fileData);
        String lines = headLib.head();
        String[] result = lines.split("\r\n");
        for (String line : result) {
            stringBuilder.append(line);
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder.toString());
    }

    String[] getArguements(String[] args) {
        String[] options = new String[2];
        for (int i = 0; i < args.length; i++) {
            if (Head.isNumber(args[i]))
                options[1] = args[i];
            if (!Head.isNumber(args[i]))
                options[0] = args[i];
        }
        return options;
    }

    static boolean isNumber(String args) {
        return args.matches("-.*");
    }
}
