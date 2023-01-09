package ie.atu.week8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File myFile = new File("MyFile2.txt");
        System.out.println("My file is located at " + myFile.getAbsolutePath());
        String content = "Details to write";
            try
            {
                FileWriter myWriter = new FileWriter(myFile);
                myWriter.write("ggg");
                myWriter.close();
            } catch (IOException e)
            {
                e.printStackTrace();
            }
    }
}