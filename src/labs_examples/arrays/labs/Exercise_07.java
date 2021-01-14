package labs_examples.arrays.labs;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
//First ArrayList has to be imported
import java.util.ArrayList;
public class Exercise_07 {
    public static void main(String[] args){
        //Create an arrayList
        ArrayList<String> mainCharacter = new ArrayList<String>();

        //Add elements to arrayList
        mainCharacter.add("Fei Fong Wong");
        mainCharacter.add("Serge");
        mainCharacter.add("Cloud Strife");
        mainCharacter.add("Ryu");
        mainCharacter.add("Justin");

        //Printing out the whole list if arrayList is not empty
        if(mainCharacter.isEmpty()){
            System.out.println("There are no elements in the list");
        }else{
            //Prints out the list
            for(String names: mainCharacter){
                System.out.println(names);
            }
        }
    }
}
