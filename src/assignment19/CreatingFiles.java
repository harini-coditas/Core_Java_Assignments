package assignment19;

import java.io.File;
import java.io.IOException;

public class CreatingFiles {
    public static void main(String[] args) throws IOException {
        File file1 = new File("File1.txt");
        if(file1.exists()){
            System.out.println("Exists");
        }
        else{
            file1.createNewFile();
        }

        File file2 = new File("File2.txt");
        if(file2.exists()){
            System.out.println("Exists");
        }else{
            file2.createNewFile();
        }

        File file3 = new File("Output.txt");
        if(file3.exists()){
            System.out.println("exists");
        }else{
            file3.createNewFile();
        }

        File file4 = new File("File4.txt");
        if(file4.exists()){
            System.out.println("exists");
        }else{
            file4.createNewFile();
        }

        File file5 = new File("File5.txt");
        if(file5.exists()){
            System.out.println("exists");
        }else{
            file5.createNewFile();
        }
    }
}
