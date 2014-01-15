package kajaljad.unixtools.cli;

import kajaljad.unixtools.filesystem.MyFileReader;
import kajaljad.unixtools.libraries.TailOperations;

public class Tail {
    public static void main(String[] args) {
        int length = 10;
        String fileName = args[0];
        String fileData;
        StringBuilder stringBuilder = new StringBuilder();
        Tail tail = new Tail();
        MyFileReader readContent = new MyFileReader();
        String[] processArgs = tail.getArguments(args);
        if (processArgs[1] != null) {
            length = Math.abs(Integer.parseInt(processArgs[1]));
            fileName = processArgs[0];
        }
        fileData = readContent.readFile(fileName);
        TailOperations tailOperations = new TailOperations(length, fileData);
        String lines = tailOperations.tail();
        String[] result = lines.split("\r\n");
        for (String line : result) {
            stringBuilder.append(line);
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder.toString());
    }

    String[] getArguments(String[] args) {
        String[] options = new String[2];
        for (int i = 0; i < args.length; i++) {
            if (Tail.isNumber(args[i]))
                options[1] = args[i];
            if (!Tail.isNumber(args[i]))
                options[0] = args[i];
        }
        return options;
    }

    static boolean isNumber(String args) {
        return args.matches("-.*");
    }
}
