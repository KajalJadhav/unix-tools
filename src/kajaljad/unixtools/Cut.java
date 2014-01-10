package kajaljad.unixtools;

import com.sun.jndi.url.dns.dnsURLContext;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by kajaljad on 1/10/14.
 */
public class Cut {
    public static void main(String[] args) {
        String fileContent = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null) {
                fileContent += "\r\n" + currentLine;
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
