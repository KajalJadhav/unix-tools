package kajaljad.unixtools.libraries;

public class TailOperations {

    public String getTailLines(String fileData, int noOfLines) {
        String[] lines = fileData.split("\r\n");
        StringBuilder result = new StringBuilder();
        for (int i = (lines.length - noOfLines); i < lines.length; i++)
            result.append(lines[i]).append("\r\n");
        return result.toString();
    }

    public int getNumberOfLines(String[] args) {
        int defaultNumberOfLines = 10;
        for (String arg : args) {
            if (arg.startsWith("-n")) {
                return Integer.parseInt(arg.replace("-n", ""));
            }
        }
        return defaultNumberOfLines;
    }

    public String getFileName(String[] args) {
        for (String arg : args) {
            if (!arg.startsWith("-")) {
                return arg;
            }
        }
        return null;
    }
}
