package kajaljad.unixtools;

public class CutOperations extends MyFileReader {
    public void cutByField(int fieldNumber, String input) {
        String[] result = input.split("\r\n");
        for (int i = 0; i < result.length; i++) {
            String[] content = result[i].split(" ");
            if (content.length < fieldNumber)
                System.out.println("\n");
            else
                System.out.println(content[fieldNumber - 1]);
        }
    }

    public void cutByDelimeter(int fieldNumber, String separator, String input) {
        String[] result = input.split("\r\n");
        for (int i = 0; i < result.length - 1; i++) {
            System.out.println(result[i].split(separator)[fieldNumber]);
        }
    }
}
