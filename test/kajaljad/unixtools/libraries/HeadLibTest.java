package kajaljad.unixtools.libraries;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class HeadLibTest {
    @Test
    public void getNumberOfLinesWhenNumberOfLinesAreNotSpecified() throws Exception {
        HeadLib operations = new HeadLib();
        String[] args = {"names.txt"};
        int actual = operations.getNumberOfLines(args);
        assertEquals(10, actual);
    }

    @Test
    public void getNumberOfLinesWhenNumberOfLinesAreSpecified() throws Exception {
        HeadLib operations = new HeadLib();
        String[] args = {"-n5", "names.txt"};
        int actual = operations.getNumberOfLines(args);
        assertEquals(actual, 5);
    }
}

