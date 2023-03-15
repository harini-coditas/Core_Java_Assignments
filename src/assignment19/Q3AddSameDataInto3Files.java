package assignment19;

import java.io.*;

public class Q3AddSameDataInto3Files {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos1 = new FileOutputStream("File1.txt");
        FileOutputStream fos2 = new FileOutputStream("File2.txt");
        FileOutputStream fos3 = new FileOutputStream("Output.txt");

        ByteArrayOutputStream bais = new ByteArrayOutputStream();
        String data = "Welcome to Coditas";
        byte[] b = data.getBytes();
        try{
            bais.write(b);
        }catch(IOException e){
            throw new RuntimeException(e);
        }

        try{
            bais.writeTo(fos1);
            bais.writeTo(fos2);
            bais.writeTo(fos3);
        }catch(IOException e){
            throw new RuntimeException(e);
        }

        try{
            bais.flush();
        }catch (IOException e){
            throw new RuntimeException(e);
        }

        try{
            bais.close();
            fos1.close();
            fos2.close();
            fos3.close();
        }catch(IOException e){
            throw new RuntimeException(e);
        }

    }
}
