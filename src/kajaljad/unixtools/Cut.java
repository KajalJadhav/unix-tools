package kajaljad.unixtools;

public class Cut {
    public static void main(String[] args) {
        CutOperations operations = new CutOperations();
        String fileContent;
        try {
            if(args.length == 2) {
                fileContent = operations.readFile(args[1]);
                int fieldNumber = Integer.parseInt(args[0].substring(2,3));
                operations.cutByField(fieldNumber, fileContent);
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
