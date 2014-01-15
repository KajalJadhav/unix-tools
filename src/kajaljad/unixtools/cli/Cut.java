package kajaljad.unixtools.cli;

import kajaljad.unixtools.filesystem.MyFileReader;
import kajaljad.unixtools.libraries.CutOperations;

import java.io.IOException;

public class Cut {
        public static void main(String args[])throws IOException {
            Cut cutclient = new Cut();
            MyFileReader fs = new MyFileReader();
            CutOperations cut = new CutOperations();

            String properArgv[] = cutclient.getArguments(args);
            int fieldValue = Integer.parseInt(properArgv[0].substring(2));
            String delimitor = properArgv[1].substring(2);
            String fileData = fs.readFile(properArgv[2]);
            StringBuilder columnData = cut.cutCount(fieldValue, delimitor, fileData);
            System.out.println(columnData);
        }

        String[] getArguments(String[] arg) {
            String options[] = new String[3];
            for (int i = 0; i < arg.length; i++) {
                if (Cut.isField(arg[i]))
                    options[0] = arg[i];
                if (Cut.isDelimiter(arg[i]))
                    options[1] = arg[i];
                if (!Cut.isFile(arg[i]))
                    options[2] = arg[i];
                if (Cut.isCharacter(arg[i]))
                    options[3] = arg[i];
            }
            return options;
        }

    static boolean isDelimiter(String arg) {
        return arg.matches("-d.*");
    }

    static boolean isField(String arg) {
        return arg.matches("-f.*");
    }

    static boolean isCharacter(String arg) {
        return arg.matches("-c.*");
    }

    static boolean isFile(String arg) {
        return arg.matches("-.*");
    }
}
