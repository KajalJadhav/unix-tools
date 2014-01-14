package kajaljad.unixtools.libraries;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ReduceSpaceOperations {
    BufferedWriter writeTo;
    public ReduceSpaceOperations() {
        try {
            writeTo = new BufferedWriter(new FileWriter("d.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String spaceReducer(String fileContent) throws IOException {
        String[] result = fileContent.split("\r\n");
        String data = new String();
        for (int i = 0; i < result.length; i++){
            data = data + result[i].replaceAll("\\s+", " ")+"\r\n";
            writeTo.write(data+"\r\n");
        }
        writeTo.close();
        return data;
    }
}
