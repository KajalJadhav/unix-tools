package kajaljad.unixtools.libraries;

public class CutOperations {
    public StringBuilder cutCount(int field_no,String delimeter,String input){
        String words[];
        StringBuilder res = new StringBuilder();
        String lines[] = input.split("\n");
        for (String line : lines) {
            words = line.split(delimeter);
            if(words.length < field_no)
                res.append("\r\n");
            else
                res.append(words[field_no-1]).append("\r\n");
        }
        return res;
    }

}
