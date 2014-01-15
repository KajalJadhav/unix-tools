package kajaljad.unixtools.libraries;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class WcLibTest {
    @Test
    public void countLines() throws Exception {
        WcLib operation = new WcLib("Kajal\r\nAnant\r\nJadhav");
        int expected = 3;
        int actual = operation.countLines();
        assertEquals(actual, expected);
    }

    @Test
    public void countLinesWhenEmptyLineIsPresentInEnd() throws Exception {
        WcLib operation = new WcLib("Kajal\r\nAnant\r\nJadhav\r\n");
        int expected = 3;
        int actual = operation.countLines();
        assertEquals(actual, expected);
    }
}
