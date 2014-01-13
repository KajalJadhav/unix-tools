package kajaljad.unixtools;

public class WcLib {
    public int countLines(String text) {
        int noOfLines = 0;
        String[] result = text.split("\r\n");
        for (String i : result) {
            noOfLines += i.split("\n").length;
        }
        return noOfLines;
    }

    public int countWords(String text) {
        int noOfWords = 0;
        String[] result = text.split("\r\n");
        for (String item : result) {
            noOfWords += item.split(" ").length;
        }
        return noOfWords;
    }

    public int countCharacters(String text) {
        return text.length();
    }
}

