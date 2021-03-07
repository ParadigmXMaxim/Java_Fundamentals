package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 3:
 *
 *      In one of the previous exercises, demonstrate changing the priority of a thread
 */
public class Exercise_03{
    public static void main(String[] args){
        MyThread firstThread = new MyThread("Greeter Thread");
        MyThread lastThread = new MyThread();
        lastThread.thread.setName("Reply Thread");
        lastThread.thread.setPriority(1);
        lastThread.thread.start();
    }
}

class MyPriority implements Runnable{

    Thread thread;
    public MyPriority(){
        thread = new Thread(this);
    }
    public MyPriority(String name){
        thread = new Thread(this, name);
        thread.setPriority(10);
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