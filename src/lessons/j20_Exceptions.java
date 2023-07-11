package lessons;

import java.io.FileInputStream;
import java.io.IOException;

public class j20_Exceptions {
    public static void main(String[] args) throws IOException {

        FileInputStream file = new FileInputStream("src/lessons/text");
        int s;
        try {
            while ((s = file.read()) != -1) {
                System.out.print((char) s);
            }
        }catch (IOException e){
            System.out.println("e.getMessage() = " + e.getMessage());
            System.out.println("Here İS catch");
        }
       finally {
            System.out.println();
            System.out.println("Goodbye");
        }
    }
}
