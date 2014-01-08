package kajaljad.unixtools;

import java.io.*;

public class WC {
    public static void main(String[] args) {
        int lines, words, characters;
        char[] array = new char[50];
        try {
            File file = new File(args[0]);
            FileReader fr = new FileReader(file);
            char[] a = new char[50];
            fr.read(a);
            int i = 0;
            for (char c : a) {
                array[i] = c;
                i++;
            }
            fr.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
        String text = new String(array);
        Operations operations = new Operations();
        lines = operations.countLines(text);
        words = operations.countWords(text);
        characters = operations.countCharacters(text);
        System.out.println(lines + " " + words + " " + characters + " " + args[0]);
    }
}
