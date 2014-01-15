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
        assertEquals(5, actual);
    }

    @Test
    public void getHeadLinesWhenNumberOfLinesAreNotSpecified() throws Exception {
        HeadLib operations = new HeadLib();
        String input = "Kajal\r\nAnant\r\nJadhav\r\nLaxit\r\nAnant\r\nJadhav\r\nVaidehi\r\nSunil\r\nJadhav\r\n";
        String expected = "Kajal\r\nAnant\r\nJadhav\r\nLaxit\r\nAnant\r\nJadhav\r\nVaidehi\r\nSunil\r\nJadhav\r\n";
        String actual = operations.getHeadLines(input, 10);
        assertEquals(expected, actual);
    }

    @Test
    public void getHeadLinesWhenNumberOfLinesAreSpecified() throws Exception {
        HeadLib operations = new HeadLib();
        String input = "Kajal\r\nAnant\r\nJadhav\r\nLaxit\r\nAnant\r\nJadhav\r\nVaidehi\r\nSunil\r\nJadhav\r\n";
        String expected = "Kajal\r\nAnant\r\nJadhav\r\nLaxit\r\nAnant\r\n";
        String actual = operations.getHeadLines(input, 5);
        assertEquals(expected, actual);
    }

    @Test
    public void getHeadLinesWhenSpecifiedNumberOfLinesAreNotThere() throws Exception {
        HeadLib operations = new HeadLib();
        String input = "Kajal\r\nAnant\r\nJadhav\r\n";
        String expected = "Kajal\r\nAnant\r\nJadhav\r\n";
        String actual = operations.getHeadLines(input, 5);
        assertEquals(expected, actual);
    }

    @Test
    public void getFileNameFromArgument() throws Exception {
        HeadLib operations = new HeadLib();
        String[] args = {"names.txt"};
        String actualfileName = operations.getFileName(args);
        assertEquals("names.txt", actualfileName);
    }

    @Test
    public void getFileNameWhenFilenameIsNotSpecified() throws Exception {
        HeadLib operations = new HeadLib();
        String[] args = {"-n5"};
        String actualFileName = operations.getFileName(args);
        assertEquals(null, actualFileName);
    }
}