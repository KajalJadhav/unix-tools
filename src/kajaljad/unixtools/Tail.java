package kajaljad.unixtools;

class TailOperations{
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
        MyFileReader fileData = new MyFileReader();
        int length = 10;
        String fileContent = null;
        try {
            if (args.length == 2) {
                length = Math.abs(Integer.parseInt(args[0]));
                fileContent = fileData.readFile(args[1]);
            } else {
                fileContent = fileData.readFile(args[0]);
            }
        } catch (Exception e) {
            System.err.println("Error");
        }
        operations.tail(length, fileContent);
    }
}
