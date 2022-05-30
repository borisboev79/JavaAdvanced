package Advanced_Exercise4_StreamsFilesAndDirectories;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ADV_EXS01_SumLines {
    public static void main(String[] args) {
        String path = "C:\\Users\\Boevi Main\\OneDrive\\Документи\\Java\\Advanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String line = bufferedReader.readLine();
            while(line != null){
                long sum = 0;
                char[] charactersFromLine = line.toCharArray();
                for (char singleCharacter : charactersFromLine) {
                    sum += singleCharacter;
                }
                System.out.println(sum);
                line = bufferedReader.readLine();
            }
        }catch (FileNotFoundException e){

        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
