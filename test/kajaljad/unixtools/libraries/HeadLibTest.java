package kajaljad.unixtools.libraries;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class HeadLibTest {
    @Test
    public void testHead() throws Exception {
        String input = "Kajal Anant Jadhav\r\nLaxit Anant Jadhav\r\nVaidehi Sunil Jadhav";
        HeadLib head1 = new HeadLib(2, input);
        String expected = "Kajal Anant Jadhav\r\nLaxit Anant Jadhav\r\n";
        String actual = head1.head();
        assertEquals(expected, actual);
    }
}
