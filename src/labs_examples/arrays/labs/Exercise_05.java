package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args){
        String[] rpgs = {"Xenogears","Chrono Cross","Final Fantasy VII", "Breath of Fire IV", "Grandia"};
        //Complete list backwards
        System.out.println("Complete List (Backwards");
        for(int x = rpgs.length - 1; x >= 0; x--){
            System.out.println(rpgs[x]);
        }
        System.out.println();
        //Every other element printed backwards
        System.out.println("Every other element backwards");
        for(int x = rpgs.length - 1; x >= 0; x -= 2){
            System.out.println(rpgs[x]);
        }
    }

}
