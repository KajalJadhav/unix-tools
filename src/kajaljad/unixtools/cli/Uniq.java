package kajaljad.unixtools.cli;

import kajaljad.unixtools.libraries.UniqOperations;

public class Uniq {
    public static void main(String[] args) {
        UniqOperations operations = new UniqOperations();
        String fileContent = null;
        try {
            fileContent = operations.readFile(args[0]);
        } catch (Exception e) {
            System.out.println("Error");
        }
        operations.uniq(fileContent);
    }
}
