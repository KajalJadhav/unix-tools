package kajaljad.unixtools;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class WcLibTest {
    String input = "Kajal Anant Jadhav\r\nLaxit Anant Jadhav\r\nVaidehi Sunil Jadhav";
    @Test
    public void testCountLines() throws Exception {
        WcLib wc = new WcLib();
        int expected = 3;
        int actual = wc.countLines(input);
        assertEquals(expected,actual);
    }

    @Test
    public void testCountWords() throws Exception {
        WcLib wc = new WcLib();
        int expected = 9;
        int actual = wc.countWords(input);
        assertEquals(expected,actual);
    }

    @Test
    public void testCountCharacters() throws Exception {
        WcLib wc = new WcLib();
        int expected = 60;
        int actual = wc.countCharacters(input);
        assertEquals(expected,actual);
    }
}
