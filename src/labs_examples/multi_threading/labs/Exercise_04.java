package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 4:
 *
 *      Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 *      working as expected
 */


import java.io.*;
import java.util.Random;
import java.util.Scanner;
public class Exercise_04{
     public static void main(String[] args){
          FileWriting write = new FileWriting();
          Synchronization sync = new Synchronization("Quotes", write);
          System.out.println("This is the main thread");
          sync.start();
          try{
               Thread.sleep(5000);
          }catch(InterruptedException ie){
               System.out.println("Error: " + ie.getMessage());
          }
          System.out.println("Main thread completed");

          RandomCount ran = new RandomCount("Random Counter");
     }
}

class FileWriting{
     public void access(){
          Scanner response = new Scanner(System.in);

          try(BufferedReader input = new BufferedReader(new FileReader("labs_examples/multi_threading/labs/Synchronization.txt")); FileWriter output = new FileWriter("labs_examples/multi_threading/labs/Synchronization output.txt")){
               String x;

               String comment;
               while((x = input.readLine()) != null){
                    output.write(x);
                    System.out.println(x);
                    System.out.println("Your Comment:");
                    comment = response.nextLine();
                    output.write(("\n" + comment));

               }
          }catch(IOException ie){
               System.out.println("Error: " + ie.getMessage());
          }
     }
}

class Synchronization extends Thread{

     FileWriting write;
     public Synchronization(String name, FileWriting wr){
          this.setName(name);
          write = wr;
     }
     @Override
     public void run() {
         synchronized(write){
              write.access();
         }
          System.out.println("Thread " + this.getName() + " is Finished working.");
     }
}

class RandomCount implements Runnable{
     Thread thread;

     public RandomCount(String name){
          thread = new Thread(this,name);
          thread.start();
     }

     @Override
     public synchronized void run() {
          Random ran = new Random();
          System.out.println("Thread " + thread.getName() + " is starting...");
          System.out.println("Lets print out some random numbers");
          try{
               for(int x = 0; x < 10; x++){
                    Thread.sleep(1000);
                    int randomNum = ran.nextInt(1000);
                    System.out.println("Random Number: " + randomNum);
               }
          }catch(InterruptedException ie){
               System.out.println("Error: " + ie.getMessage());
          }
          System.out.println("Thread " + thread.getName() + " is finish running");
     }
}