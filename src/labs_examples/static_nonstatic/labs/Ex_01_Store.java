package labs_examples.static_nonstatic.labs;

public class Ex_01_Store {
   public static void greeting(){
       System.out.println("WELCOME TO GAME IMPORIUM");
   }

   public static void assistance(){
       greeting();
       System.out.println("What may I assist you in finding today?");
   }

   public void inventory(){
       System.out.println("We have Xenogears and Xenosaga in stock. Give me a sec I will go get them now.");
       Ex_01_Person p1 = new Ex_01_Person();
       p1.thankful();
   }
}
