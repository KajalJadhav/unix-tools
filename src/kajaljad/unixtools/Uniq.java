package kajaljad.unixtools;

class UniqOperations extends MyFileReader {
    public void uniq(String text) {
        String[] fileContent = text.split("\r\n");
        System.out.println(fileContent[0]);
        for (int i = 1; i < fileContent.length; i++) {
            if (!fileContent[i].equals(fileContent[i - 1])) {
                System.out.println(fileContent[i]);
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
