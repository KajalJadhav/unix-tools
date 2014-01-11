package kajaljad.unixtools;

class TailOperations extends MyFileReader{
    public void tail(int size, String text) {
        String[] result = text.split("\r\n");
        for (int i = result.length - size; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}

public class Tail {
    public static void main(String[] args) {
        TailOperations operations = new TailOperations();
        int length = 10;
        String fileContent = null;
        try {
            if (args.length == 2) {
                length = Integer.parseInt(args[0]) * (-1);
                fileContent = operations.readFile(args[1]);
            } else {
                fileContent = operations.readFile(args[0]);
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
        operations.tail(length, fileContent);
    }
}
