package labs_examples.objects_classes_methods.labs.objects.Exercise_2;

public class objectAssociation {
    public static void main(String[] args){
        //Creating instance of Plant and Person class
        Plant plant = new Plant();
        Person person = new Person();

        //Set the variable in each object
        plant.setName("Calathea");
        plant.setColor("Green and Pink");

        person.setName("Ian");
        person.setAge(31);

        //Print out the values of the instance variables for each instance of the class plant and person
        System.out.println("Plant Name: " + plant.getName());
        System.out.println("Plant Color: " + plant.getColor());
        System.out.println();
        System.out.println("Person Name: " + person.getName());
        System.out.println("Person Age: " + person.getAge());
    }
}
