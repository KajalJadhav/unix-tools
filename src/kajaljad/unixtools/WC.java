package kajaljad.unixtools;

public class WC {
    public static void main(String[] args) {
        WcLib operations = new WcLib();
        String fileData;
        int lines, words, characters;
        fileData = new MyFileReader().readFile(args[0]);
        lines = operations.countLines(fileData);
        words = operations.countWords(fileData);
        characters = operations.countCharacters(fileData);
        System.out.println(lines + " " + words + " " + characters + " " + args[0]);
    }
}

