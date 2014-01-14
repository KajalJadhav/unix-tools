package kajaljad.unixtools.cli;

import kajaljad.unixtools.libraries.ReduceSpaceOperations;

public class ReduceSpace {
    public static void main(String[] args) {
        ReduceSpaceOperations operations = new ReduceSpaceOperations();
        String fileContent = operations.readFile(args[0]);
        operations.reduceSpace(fileContent);
    }
}
