package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;
/*
1) Demonstrate the three forms of Polymorphism:
    - Overloading
    - Overriding
    - Interfaces
 */
public class Exercise_01 {
    public static void main(String[] args){
        favoriteBook b1 = new favoriteBook();
        b1.bookInfo("Kyablion", "Three Initiates", 1913);
        System.out.println(b1.toString());
    }

}

interface Book{
    public void bookInfo(String bookName, String author, int publishYear);
}

class favoriteBook implements Book{
    private String bookName;
    private String author;
    private int publishYear;

    public favoriteBook(){
        this.bookName = "";
        this.author = "";
        this.publishYear = 0;
    }

    public void bookInfo(String name, String auth, int year){
        this.bookName = name;
        this.author = auth;
        this.publishYear = year;
    }

    @Override
    public String toString() {
        return "favoriteBook{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", publishYear='" + publishYear + '\'' +
                '}';
    }
}
