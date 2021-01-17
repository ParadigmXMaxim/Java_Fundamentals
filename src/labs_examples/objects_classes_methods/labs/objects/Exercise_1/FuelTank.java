package labs_examples.objects_classes_methods.labs.objects.Exercise_1;

public class FuelTank {
    String tankSize;

    public FuelTank(){
        this.tankSize = "JUMBO";
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "FuelTank{" +
                "tankSize='" + tankSize + '\'' +
                '}' + "\n";
    }
}
