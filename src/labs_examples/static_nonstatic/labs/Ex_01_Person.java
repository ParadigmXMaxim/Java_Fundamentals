package labs_examples.static_nonstatic.labs;
import java.util.Scanner;
public class Ex_01_Person {
   public static void greeting(){
       System.out.println("Hello");
   }

   public static void concern(){
       greeting();
       System.out.println("Can you assist me please?");
   }

   public void internalThought(){
       System.out.println("(Hopefully they have the game that I have been searching for)");
   }

   public void question(){
       Ex_01_Store.assistance();
       internalThought();
       System.out.println("Do you have Xenogears for the PS1 and Xenosaga for PS2?");
       Ex_01_Store s1 = new Ex_01_Store();
       s1.inventory();
   }
   public void thankful(){
       System.out.println("Yes!!! My collection shall now be completed.");
   }

    public static void main(String[] args){
       concern();
       Ex_01_Person p1 = new Ex_01_Person();
       p1.question();
    }
}


