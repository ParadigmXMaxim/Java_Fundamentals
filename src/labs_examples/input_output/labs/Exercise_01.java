package labs_examples.input_output.labs;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.FileInputStream;

class Example {
    public static void main(String[] args) throws IOException{

        String filePath = "labs_examples/input_output/labs/AsAManThinketh.txt";
        FileInputStream input = null;
        BufferedInputStream buffInput = null;

        try{
            input = new FileInputStream(filePath);
            buffInput = new BufferedInputStream(input);

            byte[] bits = new byte[5];
            int bytes;
            while((bytes = buffInput.read(bits)) != -1){
                System.out.println((new String(bits, 0, bytes)));
            }
        }catch(IOException ioe){
            System.out.println("Error " + ioe.getMessage());
        }finally{
            try{
                input.close();
                buffInput.close();
            }catch(IOException ioe){
                System.out.println("Error: " + ioe.getMessage());
            }

        }

    }
}