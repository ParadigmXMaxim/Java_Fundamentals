package labs_examples.generics.labs;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */
class GenericExample<T>{
    private T total;
    private T num;

    public T getTotal() {
        return total;
    }

    public void setTotal(T total) {
        this.total = total;
    }

    public T getNum() {
        return num;
    }

    public void setNum(T num) {
        this.num = num;
    }

    public static void main(String[] args){
        GenericExample ex1 = new GenericExample();
        GenericExample ex2 = new GenericExample();
        ex1.setNum(9);
        ex1.setTotal(9 * 9);
        System.out.println("Ex1 num = " + ex1.getNum());
        System.out.println("Ex1 total = " + ex1.getTotal());

        ex2.setNum(29.65);
        ex2.setTotal(29.65 * 9);
        System.out.println("Ex2 num = " + ex2.getNum());
        System.out.println("Ex2 total = " + ex2.getTotal());
    }
}

