package Advanced_Exercise4_StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ADV_EXS09_CopyAPicture {
    public static void main(String[] args) {
        byte[] buffer = new byte[1024];
        try(FileInputStream fis = new FileInputStream("C:\\Users\\Boevi Main\\Downloads\\Screenshot.jpg");
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Boevi Main\\Downloads\\Screenshot_copy.jpg")){
            while(fis.read(buffer) != -1){
                fos.write(buffer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
