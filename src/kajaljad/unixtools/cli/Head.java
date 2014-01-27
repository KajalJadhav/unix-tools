package kajaljad.unixtools.cli;

import kajaljad.unixtools.libraries.HeadLib;
import kajaljad.unixtools.filesystem.MyFileReader;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Head {
    public static void main(String[] args) {
        String fileName = null;
        InputStream is = null;
        String fileData = null;
        String result = null;
        HeadLib operations = new HeadLib();
        MyFileReader rf = new MyFileReader();
        Properties prop = new Properties();
        int noOfLines;
        try {
            fileName = operations.getFileName(args);
            fileData = rf.readFile(fileName);
            noOfLines = operations.getNumberOfLines(args);
            if(args.length < 2){
                is = new FileInputStream(System.getenv("UNIXTOOLS_SH")+"/lib/config.properties");
                prop.load(is);
                noOfLines = Integer.parseInt(prop.getProperty("default.head.properties"));
            }
        } catch (NullPointerException ex) {
            System.err.println("Please Specify File Name");
            return;
        } catch (Exception ex) {
            noOfLines = 10;
        }
        result = operations.getHeadLines(fileData, noOfLines);
        System.out.println(result);
    }
}