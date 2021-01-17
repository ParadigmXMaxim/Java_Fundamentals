package labs_examples.objects_classes_methods.labs.objects.Exercise_1;

public class myPlane {


    public static void main(String[] args){
        Engine eng = new Engine();
        FuelTank tank = new FuelTank();
        Frame body = new Frame();
        Wings wings = new Wings("Perfect");
        Airplane plane = new Airplane(eng,tank,body,wings);

        eng.engineMode = "ON";
        eng.engineStatus = "GREEN";
        tank.tankSize = "Jumbo";
        body.setLogoName("Paradigm");
        plane.setFuelCapacity(1000.00);
        plane.setCurrentFuelCapacity(1000.00);


        information(plane);
    }

    public static void information(Airplane plane){
        System.out.println("Logo Name: " + plane.body.getLogoName());
        System.out.println("Engine Mode: " + plane.engine.engineMode);
        System.out.println("Engine Status: " + plane.engine.engineStatus);
        System.out.println("Fuel Tank size: " + plane.fuelTank.tankSize);
        System.out.println("Fuel Capacity: " + plane.getFuelCapacity());
        System.out.println("Current Fuel Level: " + plane.getCurrentFuelCapacity());
        System.out.println("Wing Health: " + plane.wings.wingHealth);
    }
}
