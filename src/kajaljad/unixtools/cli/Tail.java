package kajaljad.unixtools.cli;

import kajaljad.unixtools.filesystem.MyFileReader;
import kajaljad.unixtools.libraries.TailOperations;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Tail {
    public static void main(String[] args) {
        String fileName = null;
        InputStream is = null;
        String fileData = null;
        String result;
        TailOperations operations = new TailOperations();
        MyFileReader rf = new MyFileReader();
        Properties prop = new Properties();
        int noOfLines;
        try {
            fileName = operations.getFileName(args);
            fileData = rf.readFile(fileName);
            noOfLines = operations.getNumberOfLines(args);
            if (args.length < 2) {
                is = new FileInputStream(System.getenv("UNIXTOOLS_SH") + "/lib/myconfig.properties");
                prop.load(is);
                noOfLines = Integer.parseInt(prop.getProperty("default.tail.properties"));
            }
        } catch (NullPointerException ex) {
            System.err.println("Please Specify File Name");
            return;
        } catch (Exception ex) {
            noOfLines = 10;
        }
        result = operations.getTailLines(fileData, noOfLines);
        System.out.println(result);
    }
}
