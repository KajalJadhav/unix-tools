package kajaljad.unixtools;

class UniqOperations {
    public void uniq(String text) {
        String[] result = text.spilt("\r\n");
        for (int i = 1; i < result.length-1; i++) {
            if(0 != result[i].compareTo(result[i+1])){
                System.out.println(result[i]);
            }
        }
    }
}

public class Uniq {
    public static void main(String[] args) {
        UniqOperations operations = new UniqOperations();

    }
}
