package kajaljad.unixtools.libraries;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ReduceSpaceOperationsTest {
    @Test
    public void testSpaceReducer() throws Exception {
        String input = "Digvijay Anil            Gunjal\r\n";
        ReduceSpaceOperations rso = new ReduceSpaceOperations();
        String expected = "Digvijay Anil Gunjal\r\n";
        String actual = rso.spaceReducer(input);
        assertEquals(expected, actual);
    }
}
