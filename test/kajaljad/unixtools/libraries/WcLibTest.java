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
        assertEquals(expected, actual);
    }

    @Test
    public void countWordsInASingleLine() throws Exception {
        WcLib operation = new WcLib("Kajal Laxit Vaidehi");
        int expected = 3;
        int actual = operation.countWords();
        assertEquals(expected, actual);
    }

    @Test
    public void countWordsInMultipleLines() throws Exception {
        WcLib operation = new WcLib("Kajal Anant Jadhav\r\nLaxit Anant Jadhav");
        int expected = 6;
        int actual = operation.countWords();
        assertEquals(expected, actual);
    }

    @Test
    public void countWordsWhenCommaIsPresentBetweenTwoWords() throws Exception {
        WcLib operation = new WcLib("Digvijay,Anil,Gunjal\r\nDigvijay Anil Gunjal");
        int expected = 4;
        int actual = operation.countWords();
        assertEquals(expected, actual);
    }

    @Test
    public void countCharactersInASingleLine() throws Exception {
        WcLib operation = new WcLib("Kajal Anant Jadhav");
        int expected = 18;
        int actual = operation.countCharacters();
        assertEquals(actual, expected);
    }
}
