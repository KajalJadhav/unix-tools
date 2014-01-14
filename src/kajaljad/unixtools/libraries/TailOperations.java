package kajaljad.unixtools.libraries;

public class TailOperations {
    private String text;
    private int limit;

    public TailOperations(int noOfLines, String text) {
        this.text = text;
        this.limit = noOfLines;
    }

    public String tail() {
        String[] lines = text.split("\r\n");
        if (lines.length < limit) return lines.toString();
        StringBuilder result = new StringBuilder();
        for (int i = (lines.length - limit); i < lines.length; i++)
            result.append(lines[i]).append("\r\n");
        return result.toString();
    }
}
