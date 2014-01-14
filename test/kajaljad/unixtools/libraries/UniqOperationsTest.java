package kajaljad.unixtools.libraries;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class UniqOperationsTest {
    @Test
    public void test_uniq_lines() throws Exception {
        String input = "Kajal Anant Jadhav\r\nKajal Anant Jadhav\r\nLaxit Anant Jadhav\r\nVaidehi Sunil Jadhav\r\nVaidehi Sunil Jadhav";
        UniqOperations uniq = new UniqOperations();
        String expected;
        String actual;

        expected = "Kajal Anant Jadhav\r\nLaxit Anant Jadhav\r\nVaidehi Sunil Jadhav";
        actual = uniq.uniq(input);
        assertEquals(expected, actual);
    }

    @Test
    public void test_uniq_lines_when_have_extra_empty_line_at_end() throws Exception {
        String input = "Kajal Anant Jadhav\r\nKajal Anant Jadhav\r\nLaxit Anant Jadhav\r\nVaidehi Sunil Jadhav\r\nVaidehi Sunil Jadhav\r\n";
        UniqOperations uniq = new UniqOperations();
        String expected;
        String actual;
        expected = "Kajal Anant Jadhav\r\nLaxit Anant Jadhav\r\nVaidehi Sunil Jadhav";
        actual = uniq.uniq(input);
        assertEquals(expected, actual);
    }
}
