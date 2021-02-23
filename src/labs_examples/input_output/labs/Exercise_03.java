package labs_examples.input_output.labs;

/**
 * Input/Output Exercise 3: variety
 *
 *    1) Demonstrate the usage of at least two additional Byte Streams
 *    2) Demonstrate the usage of at least two additional Character Streams
 *    3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams
 *    4) Demonstrate the use of the DataInputStream and DataOutputStream
 *
 */
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;

class Exercise_03{
    public static void main(String[] args){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        FileReader fr = null;
        FileWriter fw = null;
        DataInputStream dis = null;
        DataOutputStream dos = null;

        String filePath = "C:/Users/Ian/Documents/CodingNomads/labs/online-java-fundamentals/src/labs_examples/input_output/labs/Lao Tzu.txt";

        try{
            fis = new FileInputStream(filePath);
            fos = new FileOutputStream("C:/Users/Ian/Documents/CodingNomads/labs/online-java-fundamentals/src/labs_examples/input_output/labs/Fileoutput.txt");
            int i;

            while((i = fis.read()) != -1){
                fos.write(i);
            }
            fos.write(101010101);
        }catch(IOException ioe){
            System.out.println("Error: " + ioe.getMessage());
        }finally{
            try{
                fis.close();
            }catch(IOException ioe){
                System.out.println("Error: " + ioe.getMessage());
            }
            try{
                fos.close();
            }catch(IOException ioe){
                System.out.println("Error: " + ioe.getMessage());
            }
        }

        //Data
        try{
            dis = new DataInputStream(new FileInputStream(filePath));
            dos = new DataOutputStream(new FileOutputStream("C:/Users/Ian/Documents/CodingNomads/labs/online-java-fundamentals/src/labs_examples/input_output/labs/DataOutput.txt"));
            byte[] bit = new byte[10];
            int h;
            while((h = dis.read(bit)) != -1){
                dos.write(bit);
            }
        }catch(IOException ioe){
            System.out.println("Error: " + ioe.getMessage());
        }finally{
            try{
                dis.close();
            }catch(IOException ioe){
                System.out.println("Error: " + ioe.getMessage());
            }
            try{
                dos.close();
            }catch(IOException ioe){
                System.out.println("Error: " + ioe.getMessage());
            }
        }

        //try with resources for buffer and file
        try(BufferedReader br = new BufferedReader(new FileReader(filePath));BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Users/Ian/Documents/CodingNomads/labs/online-java-fundamentals/src/labs_examples/input_output/labs/BufferedOutput.txt"))){
            int w;
            while((w = br.read()) != -1){
                bw.write(w);
                System.out.println((char)w + ": " + w);
            }
        }catch(IOException ioe){
            System.out.println("Error: " + ioe.getMessage());
        }
    }
}