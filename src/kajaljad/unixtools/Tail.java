package kajaljad.unixtools;

class TailOperations {
    public void tail(int size, String text) {
        String[] result = text.split("\r\n");
        for (int i = result.length-size; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}

public class Tail {
    public static void main(String[] args) {
        TailOperations operations = new TailOperations();

    }
}
