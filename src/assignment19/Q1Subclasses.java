package assignment19;

import java.io.*;

public class Q1Subclasses {
    public static void main(String[] args) throws IOException {
        //byte
        FileInputStream fis = new FileInputStream("File1.txt");
        int i = 0;
        while((i = fis.read()) != -1){
            System.out.println((char)i);
        }
        //fis.close();

        FileOutputStream fos = new FileOutputStream("File4.txt");
        String s = "How are you";
        byte b[] = s.getBytes();
        fos.write(b);
        //fos.close();

        System.out.println();

        //char
        String data = "doing good?";
        FileWriter fw = new FileWriter("File5.txt");
        fw.write(data);
        //fw.flush();
        fw.close();

        FileReader fr = new FileReader("File5.txt");
        int j = 0;
        while((j=fr.read()) != -1){
            System.out.println((char)j);
        }
        fr.close();
    }
}
