package labs_examples.input_output.labs;

/**
 * Input/Output Exercise 2: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      Then, ead back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
class Exercise_02{
    public static void main(String[] args){
        String filePath = "C:/Users/Ian/Documents/CodingNomads/labs/online-java-fundamentals/src/labs_examples/input_output/labs/Lao Tzu.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath));FileWriter writer = new FileWriter("C:/Users/Ian/Documents/CodingNomads/labs/online-java-fundamentals/src/labs_examples/input_output/labs/Lao Tzu Encrypted.txt")){
            int i;
            while((i = reader.read()) != -1){
                writer.write(i + 1);
            }

        }catch(IOException ioe){
            System.out.println("Error: " + ioe.getMessage());
        }

        String newFilePath = "C:/Users/Ian/Documents/CodingNomads/labs/online-java-fundamentals/src/labs_examples/input_output/labs/Lao Tzu Encrypted.txt";
        try(BufferedReader read = new BufferedReader(new FileReader(newFilePath))){
            int x;
            while((x = read.read()) != -1){
                System.out.print((char)(x - 1));
            }

        }catch(IOException ioe){
            System.out.println("Error: " + ioe.getMessage());
        }
    }
}