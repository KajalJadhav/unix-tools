package kajaljad.unixtools.libraries;

public class WcLib {
    String fileData = "";
    public WcLib(String fileData) {
        this.fileData = fileData;
    }

    public int countLines() {
        String[] result = fileData.split("\r\n");
        return result.length;
    }

    public int countWords() {
        int noOfWords = 0;
        String[] result = fileData.split("\r\n");
        for (String item : result) {
            noOfWords += item.split(" ").length;
        }
        return noOfWords;
    }

    public int countCharacters() {
        return fileData.length();
    }

}


