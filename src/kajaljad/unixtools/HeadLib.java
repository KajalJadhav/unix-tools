package kajaljad.unixtools;

public class HeadLib {
    String text;
    int size;
    public HeadLib(int noOfLines,String text) {
        this.text = text;
        this.size = noOfLines;
    }
    public String head() {
        String[] lines = text.split("\r\n");
        if(lines.length < size)
            size = lines.length;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            result.append(lines[i]).append("\r\n");
        }
        return result.toString();
    }
}
