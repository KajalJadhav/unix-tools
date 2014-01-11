package kajaljad.unixtools;

public class CutOperations extends MyFileReader{
    public void cutByField(int fieldNumber, String input) {
        String[] result = input.split("\r\n");
        for (int i = 0; i < result.length; i++) {
            String[] content = result[i].split(" ");
            if(content.length < fieldNumber)
                System.out.println("\n");
            else
                System.out.println(content[fieldNumber-1]);
        }
    }
}
