package labs_examples.objects_classes_methods.labs.objects.Exercise_2;

public class Plant {
    private String name;
    private String color;

    public Plant(){}

    public void setName(String yourName){
        name = yourName;
    }
    public void setColor(String yourColor){
        color = yourColor;
    }

    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }

}

//Against best practice but it will work
class Person{
    private String name;
    private int age;

    public void setName(String nm){
        name = nm;
    }
    public void setAge(int yourAge){
        age = yourAge;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
