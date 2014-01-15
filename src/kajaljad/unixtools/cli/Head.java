package kajaljad.unixtools.cli;

import kajaljad.unixtools.libraries.HeadLib;
import kajaljad.unixtools.filesystem.MyFileReader;

public class Head {
    public static void main(String[] args) {
        String fileName = "";
        String fileData, result;
        HeadLib operations = new HeadLib();
        MyFileReader rf = new MyFileReader();
        int noOfLines;
        try {
            fileName = operations.getFileName(args);
            noOfLines = operations.getNumberOfLines(args);
            fileData = rf.readFile(fileName);
            result = operations.getHeadLines(fileData, noOfLines);
        } catch (NullPointerException ex) {
            System.err.println("Please Specify File Name");
            return;
        } catch (Exception ex) {
            System.err.println(" " + fileName + " :No such File or Directory");
            return;
        }
        System.out.println(result);
    }
}
