package kajaljad.unixtools.libraries;

public class TailOperations{
    public void tail(int size, String text) {
        String[] result = text.split("\r\n");
        for (int i = result.length - size; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
