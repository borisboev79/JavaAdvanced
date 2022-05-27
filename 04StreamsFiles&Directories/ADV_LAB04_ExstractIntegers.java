package Advanced_Lab4_StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ADV_LAB04_ExstractIntegers {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\Users\\Boevi Main\\OneDrive\\Документи\\Java\\Advanced\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream fileInputStream = new FileInputStream(path);

        Scanner scanner = new Scanner(fileInputStream);
        PrintWriter writer = new PrintWriter(new FileOutputStream("integers-out.txt"));

        while(scanner.hasNext()){
            if(scanner.hasNextInt()){
                writer.println(scanner.next());
            } else{
                scanner.next();
            }

        }
        writer.close();
    }
}

