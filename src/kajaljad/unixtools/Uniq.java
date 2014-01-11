package kajaljad.unixtools;

class UniqOperations extends MyFileReader {
    public void uniq(String text) {
        String[] result;
        result = text.split("\r\n");
        for (int i = 1; i < result.length - 1; i++) {
            if (0 != result[i].compareTo(result[i + 1])) {
                System.out.println(result[i]);
            }
        }
    }
}

public class Uniq {
    public static void main(String[] args) {
        UniqOperations operations = new UniqOperations();
        String fileContent = null;
        try {
            fileContent = operations.readFile(args[0]);
        } catch (Exception e) {
            System.out.println("Error");
        }
        operations.uniq(fileContent);
    }
}
