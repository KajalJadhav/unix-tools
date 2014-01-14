package kajaljad.unixtools.libraries;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class HeadLibTest {
    String input = "Kajal\r\nAnant\r\nJadhav\r\nLaxit\r\nAnant\r\nJadhav\r\nVaidehi\r\nSunil\r\nJadhav\r\nAnant\r\nShankar\r\nJadhav\r\n";

    @Test
    public void testHead() throws Exception {
        HeadLib headLib = new HeadLib(3, input);
        String expected = "Kajal\r\nAnant\r\nJadhav\r\n";
        String actual = headLib.head();
        assertEquals(expected, actual);
    }

    @Test
    public void test_display_default_head() throws Exception {
        HeadLib headLib = new HeadLib(10, input);
        String expected = "Kajal\r\nAnant\r\nJadhav\r\nLaxit\r\nAnant\r\nJadhav\r\nVaidehi\r\nSunil\r\nJadhav\r\nAnant\r\n";
        String actual = headLib.head();
        assertEquals(expected, actual);
    }
}
