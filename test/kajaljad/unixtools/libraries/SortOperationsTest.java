package kajaljad.unixtools.libraries;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortOperationsTest {
    @Test
    public void testSort() throws Exception {
        String input = "Kajal\r\nAnant\r\nJadhav";
        SortOperations sort = new SortOperations();
        String[] expected = {"Anant", "Jadhav", "Kajal"};
        String[] actual = sort.sortData(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testReverseData() throws Exception {
        String input = "Kajal\r\nAnant\r\nJadhav";
        SortOperations sort = new SortOperations();
        String[] expected = {"Kajal", "Jadhav", "Anant"};
        String[] actual = sort.reverseData(input);
        assertArrayEquals(expected, actual);
    }
}
