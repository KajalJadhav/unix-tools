package kajaljad.unixtools.cli;

import kajaljad.unixtools.filesystem.MyFileReader;
import kajaljad.unixtools.libraries.CutOperations;

public class Cut {
    public static void main(String[] args) {
        CutOperations operations = new CutOperations();
        MyFileReader readContent = new MyFileReader();
        String fileContent;
        if (args.length == 3) {           // for delimiter
            String separator = args[1].substring(2, 3);
            int fieldNumber = Integer.parseInt(args[0].substring(2, 3));
            fileContent = readContent.readFile(args[2]);
            String data = operations.cutByFieldAndSeparator(fieldNumber, separator, fileContent);
            String[] result = data.split("\r\n");
            for (Object o : result)
                System.out.println(o);
        }
        try {
            if (args.length == 2) {           // for field and character
                fileContent = readContent.readFile(args[1]);
                int fieldNumber = Integer.parseInt(args[0].substring(2, 3));
                String character = args[0].substring(0, 2);
                String data;
                if (0 == character.compareTo("-f"))
                    data = operations.cutByField(fileContent);
                else data = operations.cutByCharacter(fieldNumber, fileContent);
                String[] result = data.split("\r\n");
                for (Object o : result)
                    System.out.println(o);
            }
        } catch (Exception e) {
            System.err.println("Error");
        }
    }
}
