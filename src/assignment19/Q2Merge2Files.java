package assignment19;

import java.io.*;

public class Q2Merge2Files {
    public static void main(String[] args) throws IOException {
        FileInputStream fis1 =new FileInputStream("File1.txt");
        FileInputStream fis2 =new FileInputStream("File2.txt");
        FileOutputStream fos =new FileOutputStream("Output.txt");

        SequenceInputStream sis = new SequenceInputStream(fis1,fis2);
        int i;
        while ((i=sis.read())!=-1){
            fos.write(i);
        }
    }
}
