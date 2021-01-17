package labs_examples.objects_classes_methods.labs.objects.Exercise_3;

public class Book {
    private String bookTitle;
    private String author;
    private int publishYear;

    public Book(){}
    public Book(String title){
        bookTitle = title;
    }
    public Book(String auth,int year){
        author = auth;
        publishYear = year;
    }
    public Book(String title,String auth, int year){
        bookTitle = title;
        author = auth;
        publishYear = year;
    }

    public void setBookTitle(String title){
        bookTitle = title;
    }
    public void setAuthor(String auth){
        author = auth;
    }
    public void setPublishYear(int year){
        publishYear = year;
    }

    public String getBookTitle(){
        return bookTitle;
    }
    public String getAuthor(){
        return author;
    }
    public int getPublishYear(){
        return publishYear;
    }
}
