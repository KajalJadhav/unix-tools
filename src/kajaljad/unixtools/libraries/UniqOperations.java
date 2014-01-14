package kajaljad.unixtools.libraries;

public class UniqOperations {
    public String uniq(String text) {
        String[] lines = text.split("\r\n");
        StringBuilder stringBuilder = new StringBuilder();
        for(int i =0; i< lines.length-1; i++){
            if(!(lines[i].equalsIgnoreCase(lines[i + 1])))
                stringBuilder.append(lines[i]).append("\r\n");
        }
        stringBuilder.append(lines[lines.length-1]);
        return stringBuilder.toString();
    }
}
