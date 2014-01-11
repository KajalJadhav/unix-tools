package kajaljad.unixtools;

class HeadOperations extends MyFileReader {
    public void head(int size, String text) {
        String[] result = text.split("\r\n");
        for (int i = 0; i < size; i++) {
            System.out.println(result[i]);
        }
    }
}

public class Head {
    public static void main(String[] args) {
        HeadOperations operations = new HeadOperations();
        int length = 10;
        String fileContent = null;
        try {
            if (args.length == 2) {
                length = Integer.parseInt(args[0]) * (-1);
                fileContent = operations.readFile(args[1]);
            } else
                fileContent = operations.readFile(args[0]);
        } catch (Exception e) {
            System.err.println("Error");
        }
        operations.head(length, fileContent);
    }
}
