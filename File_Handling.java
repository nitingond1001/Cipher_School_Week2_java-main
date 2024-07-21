// import java.io.FileWriter;
// import java.io.IOException;
import java.io.File;

public class File_Handling {

    public static void main(String[] args) {
        
        File f = new File("C:Users/asus/OneDrive/Desktop/Cipher School Week 2");

        String [] files = f.list();

        for(String file : files){
            System.out.println(file);
        }

        File[] files_arr = f.listFiles();

        for(File ff : files_arr){
            ff.delete();
        }
    }
    
}
