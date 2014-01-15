package kajaljad.unixtools.libraries;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TailOperationsTest {
    @Test
    public void getNumberOfLinesWhenNumberOfLinesAreNotSpecified() throws Exception {
        TailOperations operations = new TailOperations();
        String[] args = {"names.txt"};
        int actual = operations.getNumberOfLines(args);
        assertEquals(10, actual);
    }

    @Test
    public void getNumberOfLinesWhenNumberOfLinesAreSpecified() throws Exception {
        TailOperations operations = new TailOperations();
        String[] args = {"-n5", "names.txt"};
        int actual = operations.getNumberOfLines(args);
        assertEquals(5, actual);
    }
}
