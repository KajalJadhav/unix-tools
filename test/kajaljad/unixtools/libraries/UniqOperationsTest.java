package kajaljad.unixtools.libraries;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class UniqOperationsTest {
    @Test
    public void getUniqLinesFromMultipleLines() throws Exception {
        String input = "Kajal Anant Jadhav\r\nKajal Anant Jadhav\r\nLaxit Anant Jadhav\r\nVaidehi Sunil Jadhav\r\nVaidehi Sunil Jadhav";
        UniqOperations uniq = new UniqOperations();
        String expected = "Kajal Anant Jadhav\r\nLaxit Anant Jadhav\r\nVaidehi Sunil Jadhav";
        String actual = uniq.getUniqLines(input);
        assertEquals(expected, actual);
    }

    @Test
    public void getUniqLinesWhenExtraEmptyLineIsThereAtEnd() throws Exception {
        String input = "Kajal Anant Jadhav\r\nKajal Anant Jadhav\r\nLaxit Anant Jadhav\r\nVaidehi Sunil Jadhav\r\nVaidehi Sunil Jadhav\r\n";
        UniqOperations uniq = new UniqOperations();
        String expected;
        String actual;
        expected = "Kajal Anant Jadhav\r\nLaxit Anant Jadhav\r\nVaidehi Sunil Jadhav";
        actual = uniq.getUniqLines(input);
        assertEquals(expected, actual);
    }
}