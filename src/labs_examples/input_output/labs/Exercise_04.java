package labs_examples.input_output.labs;

/**
 *
 *      Following the video examples and source code found in the src/labs_examples/input_output/examples/csv_parser
 *      package, create a new application that will parse a custom CSV file that you created and map each line of the
 *      csv to a custom POJO that you create.
 *
 *      Then add that object to an arraylist. After you have mapped each row of the csv to objects
 *      and added each object to an arraylist, print out each object using the objects custom toString() method.
 *
 *      Then, write the arraylist of objects back out to a new .csv file. Ensure that the resulting csv file is valid.
 *
 */
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

class Exercise_04{
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<Student>();
        String filePath = "C:/Users/Ian/Documents/CodingNomads/labs/online-java-fundamentals/src/labs_examples/input_output/files/students.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;

            while((line = br.readLine()) != null){
                String[] values = line.split(",");
                students.add(mapValuesToStudentObject(values));
            }

        }catch(FileNotFoundException e){
            System.out.println("Error: " + e.getMessage());
        }catch(IOException ioe){
            System.out.println("Error: " + ioe.getMessage());
        }

        for(Student student : students){
            System.out.println(student.toString());
        }

    }

    private static Student mapValuesToStudentObject(String[] values){
        Student student = new Student();

        student.setId(Integer.parseInt(values[0]));
        student.setFirstName(values[1]);
        student.setLastName(values[2]);
        student.setGpa(Double.parseDouble(values[3]));

        return student;
    }
}