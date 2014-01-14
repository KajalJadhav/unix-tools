package kajaljad.unixtools.cli;

import kajaljad.unixtools.filesystem.MyFileReader;
import kajaljad.unixtools.libraries.ReduceSpaceOperations;

import java.io.IOException;

public class ReduceSpace {
    public static void main(String[] args) throws IOException {
        MyFileReader readContent = new MyFileReader();
        ReduceSpaceOperations rso = new ReduceSpaceOperations();
        String fileContent = readContent.readFile(args[0]);
        System.out.println(rso.spaceReducer(fileContent));
    }
}
