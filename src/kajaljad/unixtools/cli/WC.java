package kajaljad.unixtools.cli;

import kajaljad.unixtools.filesystem.MyFileReader;
import kajaljad.unixtools.libraries.WcFileHandler;
import kajaljad.unixtools.libraries.WcLib;

import java.io.File;
import java.io.FileNotFoundException;

public class WC {
    public static void main(String[] args) throws Exception {
        MyFileReader rf = new MyFileReader();
        String fileData;
        String fileName;
        File file;
        WcFileHandler wcFileHandler = new WcFileHandler();
        fileName = wcFileHandler.getFileName(args);
        try {
            file = new File(fileName);
            fileData = rf.readFile(fileName);
        } catch (NullPointerException ex) {
            System.err.println("Specify File Name");
            return;
        }
        WcLib operations = new WcLib(fileData);
        int lines, words, characters;
        lines = operations.countLines();
        words = operations.countWords();
        characters = operations.countCharacters();
        System.out.println(lines + "\t" + words + "\t" + characters + "\t" + file.getName());
    }
}

