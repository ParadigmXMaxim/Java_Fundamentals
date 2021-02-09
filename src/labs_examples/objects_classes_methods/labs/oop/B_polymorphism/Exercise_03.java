package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;
/*
3) Demonstrate using an interface as an instance variable - have a constructor that takes in the interface as a
parameter. Also have a setter that allows you to update the interface object. Through code, demonstrate that you
understand how we can use Interfaces as dependencies (instance variables) and how useful and flexible they make our
application.
 */
public class Exercise_03 {
    OrganismFunctions organism;

    public Exercise_03(OrganismFunctions organism){
        this.organism = organism;
    }

    public void usingMethods(){
        organism.Eat();
        organism.Waste();
        organism.reproduce();
        organism.Sleep();
    }

    public void setOrganism(OrganismFunctions organism){
        this.organism = organism;
    }
    public static void main(String[] args){
        Person Ian = new Person();
        Cat Soma = new Cat();

        Exercise_03 p1 = new Exercise_03(Ian);
        p1.usingMethods();
        p1.setOrganism(Soma);
        System.out.println("______________________________________________");
        p1.usingMethods();


    }
}

interface OrganismFunctions{
    public void Eat();
    public void Waste();
    public void Sleep();
    public void reproduce();
}

class Person implements OrganismFunctions{
    @Override
    public void Eat() {
        System.out.println("Time to eat breakfast");
    }

    @Override
    public void Waste() {
        System.out.println("I should not hav eaten 2 cups of oatmeal...time to go");
    }

    @Override
    public void Sleep() {
        System.out.println("The ITIS is kicking in, time for a nap");
    }

    @Override
    public void reproduce() {
        System.out.println("I am not ready for kids but so I will protect myself");
    }
}

class Cat implements OrganismFunctions{
    @Override
    public void Eat() {
        System.out.println("Meoow (Human feed me now!)");
    }

    @Override
    public void Waste() {
        System.out.println("Meow (Bathroom time)");
    }

    @Override
    public void Sleep() {
        System.out.println("zzzzzzzzzzz......zzzzzz...zz.zzzzzz...zzzzzz");
    }

    @Override
    public void reproduce() {
        System.out.println("MMMMMEEEEEEOOOOOOOOOOWWWWW (Nature calling)");

    }
}
