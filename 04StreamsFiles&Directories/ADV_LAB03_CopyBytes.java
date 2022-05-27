package Advanced_Lab4_StreamsFilesAndDirectories;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
public class ADV_LAB03_CopyBytes {
    public static void main(String[] args) {

        String path = "C:\\Users\\Boevi Main\\OneDrive\\Документи\\Java\\Advanced\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        try {
            FileInputStream inputStream = new FileInputStream(path);
            FileOutputStream outputStream = new FileOutputStream("output.txt");

            int read = inputStream.read();


            PrintWriter writer = new PrintWriter(outputStream);


            while (read != -1) {
                if (read == ' ') {
                    writer.print(' ');
                } else if (read == 10) {
                    writer.println();
                } else {
                    writer.print(read);
                }

                read = inputStream.read();
            }
            writer.close();
        } catch (IOException ignored) {
        }
    }
}
