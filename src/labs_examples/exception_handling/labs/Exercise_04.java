package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */
public class Exercise_04 {
    public static void main(String[] args){
        try{
            String[] names = {"Ian", "Gwendolyn", "Shirley", "Robert", "Steve"};
            for(int x = 0; x < 10; x++){
                System.out.println("Name: " + names[x]);
            }
        }catch(IndexOutOfBoundsException ioe){
            System.out.println("You went out of the index scope of the array");
            System.out.println("Index " + ioe.getMessage() + " is not in scope");
            try{
                System.out.println("Print the list within the scope this time");
                String[] names = {"Ian", "Gwendolyn", "Shirley", "Robert", "Steve"};
                for(int y = 0;y < 7; y++){
                    System.out.println("Name: " + names[y]);
                }
            }catch(Exception e){
                System.out.println("I see you still have not learned...");
                System.out.println("Index " + ioe.getMessage() + " is not in scope");
            }
        }finally{
            System.out.println("Novus Ordos Seclorum");
        }
    }
}