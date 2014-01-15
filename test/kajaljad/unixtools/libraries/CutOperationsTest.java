package kajaljad.unixtools.libraries;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CutOperationsTest {
    String input = "Kajal Anant Jadhav\r\nLaxit Anant Jadhav\r\nVaidehi Sunil Jadhav\r\n";

    @Test
    public void testCut_by_specific_character() throws Exception {
        CutOperations cut = new CutOperations();
        String expected = "K\r\nL\r\nV\r\n";
        String actual = cut.cutByCharacter(1, input);
        assertEquals(expected, actual);
    }

    @Test
    public void testCut_by_specific_field() throws Exception {
        CutOperations cut = new CutOperations();
        String expected = input;
        String actual = cut.cutByField(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testCut_by_specific_field_and_seperator() throws Exception {
        CutOperations cut = new CutOperations();
        String expected = "Kajal\r\nLaxit\r\nVaidehi\r\n";
        String actual = cut.cutByFieldAndSeparator(1, " ", input);
        assertEquals(expected, actual);
    }
}
