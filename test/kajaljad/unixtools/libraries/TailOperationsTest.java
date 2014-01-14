package kajaljad.unixtools.libraries;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TailOperationsTest {
    String input = "Kajal\r\nAnant\r\nJadhav\r\nLaxit\r\nAnant\r\nJadhav\r\nVaidehi\r\nSunil\r\nJadhav\r\nAnant\r\nShankar\r\nJadhav\r\n";

    @Test
    public void test_display_tail_for_specific_lines() throws Exception {
        TailOperations tailOperations = new TailOperations(3, input);
        String expected = "Anant\r\nShankar\r\nJadhav\r\n";
        String actual = tailOperations.tail();
        assertEquals(expected, actual);
    }

    @Test
    public void test_display_default_tail() throws Exception {
        TailOperations tailOperations = new TailOperations(10, input);
        String expected = "Jadhav\r\nLaxit\r\nAnant\r\nJadhav\r\nVaidehi\r\nSunil\r\nJadhav\r\nAnant\r\nShankar\r\nJadhav\r\n";
        String actual = tailOperations.tail();
        assertEquals(expected, actual);
    }
}
