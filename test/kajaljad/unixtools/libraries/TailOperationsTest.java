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

    @Test
    public void getTailLinesWhenNumberOfLinesAreNotSpecified() throws Exception {
        TailOperations operations = new TailOperations();
        String input = "Kajal\r\nAnant\r\nJadhav\r\nLaxit\r\nAnant\r\nJadhav\r\nVaidehi\r\nSunil\r\nJadhav\r\nAnant\r\n";
        String expected = "Kajal\r\nAnant\r\nJadhav\r\nLaxit\r\nAnant\r\nJadhav\r\nVaidehi\r\nSunil\r\nJadhav\r\nAnant\r\n";
        String actual = operations.getTailLines(input, 10);
        assertEquals(expected, actual);
    }

    @Test
    public void getTailLinesWhenNumberOfLinesAreSpecified() throws Exception {
        TailOperations operations = new TailOperations();
        String input = "Kajal\r\nAnant\r\nJadhav\r\nLaxit\r\nAnant\r\nJadhav\r\nVaidehi\r\nSunil\r\nJadhav\r\n";
        String expected = "Anant\r\nJadhav\r\nVaidehi\r\nSunil\r\nJadhav\r\n";
        String actual = operations.getTailLines(input, 5);
        assertEquals(expected, actual);
    }
}
