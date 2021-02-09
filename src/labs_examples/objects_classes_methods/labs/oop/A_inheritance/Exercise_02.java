package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Run the class below and study the output. What prints and why?
 *
 * Your answer: The reason that 10 is returned instead of 20 is because when the object is being
 * initialized it is being saved as a A object variable opposed to a B object variable. If you
 * replace A with B then when you print out the instance variable i you would get 20.
 */
class A {
    int i = 10;
}

class B extends A{
    int i = 20;
}

public class Exercise_02 {

    public static void main(String[] args) {
        A a = new B();

        System.out.println(a.i);
    }
}