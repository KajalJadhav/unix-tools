package kajaljad.unixtools.libraries;

public class WcFileHandler {
    public String getFileName(String[] args) {
        for (String arg : args) {
            if (!arg.startsWith("-")) {
                return arg;
            }
        }
        return null;
    }
}
