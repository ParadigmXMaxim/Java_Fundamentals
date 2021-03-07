package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */
public class Exercise_01{
    public static void main(String[] args){
        MyThread firstThread = new MyThread("Greeter Thread");
        MyThread lastThread = new MyThread();
        lastThread.thread.setName("Reply Thread");
        lastThread.thread.start();
    }
}

class MyThread implements Runnable{

    Thread thread;
    public MyThread(){
        thread = new Thread(this);
    }
    public MyThread(String name){
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run(){
        System.out.println("Hello, I am thread called " + thread.getName());
        for(int x = 0; x < 5; x++){
            try{
                Thread.sleep(1500);
                System.out.println("Times " + thread.getName() + " sees you: " + x);
            }catch(InterruptedException ie){
                System.out.println("Error: " + ie.getMessage());
            }
        }
        System.out.println("It has been a pleasure user, Goodbye!!!\nYours Truly " + thread.getName());
    }
}


