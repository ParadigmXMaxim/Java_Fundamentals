package labs_examples.objects_classes_methods.labs.objects.Exercise_1;

public class Airplane {
    private double fuelCapacity;
    private double currentFuelCapacity;
    Engine engine;
    FuelTank fuelTank;
    Frame body;
    Wings wings;

    public Airplane(Engine engine,FuelTank tank,Frame body,Wings wings){
        this.engine = engine;
        this.fuelTank = tank;
        this.body = body;
        this.wings = wings;
        System.out.println(toString());
    }

    public void setFuelCapacity(double fuel){
        fuelCapacity = fuel;
    }
    public void setCurrentFuelCapacity(double level){
        currentFuelCapacity = level;
    }

    public double getFuelCapacity(){
        return fuelCapacity;
    }
    public double getCurrentFuelCapacity(){
        return currentFuelCapacity;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "fuelCapacity=" + fuelCapacity +
                ", currentFuelCapacity=" + currentFuelCapacity +
                ", engine=" + engine +
                ", fuelTank=" + fuelTank +
                ", body=" + body +
                ", wings=" + wings +
                '}';
    }
}





