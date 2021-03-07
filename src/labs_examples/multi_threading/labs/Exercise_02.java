package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */
class Exercise_02 extends Thread{

    public Exercise_02(){
        super();
        start();
    }
    public static void main(String[] args){
       Exercise_02 thread = new Exercise_02();
    }

    @Override
    public void run(){
        System.out.println("This is a new Thread");
        int count = 0;
        do{
            try{
                Thread.sleep(1000);
                System.out.println("I'm running: " + count);

            }catch(InterruptedException ie){
                System.out.println("Error: " + ie.getMessage());
            }
            count++;
        }while(count < 5);
    }
}