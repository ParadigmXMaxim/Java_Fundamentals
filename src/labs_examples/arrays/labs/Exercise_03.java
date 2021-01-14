package labs_examples.arrays.labs;

/**
 *  2D Array
 *
 *      Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {
        int[][] multiplesOfThree = new int[5][5];
        int multi = 1; // used in the loop to make sure that 3 is multiplied

        //Populating the array
        for(int x = 0; x < multiplesOfThree.length; x++){
            for(int y = 0; y < multiplesOfThree[x].length; y++){
                multiplesOfThree[x][y] = 3 * multi;
                multi++;
            }
        }

        //Prints out the array
        for(int[] val: multiplesOfThree){
            for(int num: val){
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}
