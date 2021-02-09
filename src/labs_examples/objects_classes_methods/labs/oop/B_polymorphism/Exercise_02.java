package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;
/*
2) Demonstrate the three forms of polymorphism again - but in a new set of classes. We want to lock this in.
Challenge yourself. Build something you're proud of.

 */
public class Exercise_02 {
    public static void main(String[] args){
        Plant plant = new Plant();
        plant.setGenus("Calathea");
        plant.setPlantName("Macha");
        information(plant);
        plant.photosynthesis();
        plant.grow();
        plant.decay();
    }

    public static void information(Plant plant){
        System.out.println("My is plant of the genus " + plant.getGenus() + " and is named " + plant.getPlantName());
    }

}

interface plantFunction{
    public void photosynthesis();
    public void grow();
    public void decay();
}

class Plant implements plantFunction{
    private String genus;
    private String plantName;

    public Plant(){

    }
    public Plant(String genus){
        this.genus = genus;
    }

    public void photosynthesis(){
        System.out.println("Absorb carbon dioxide, expel oxygen");
    }

    public void grow(){
        System.out.println("Sprouting...");
    }

    public void decay(){
        System.out.println("Die to be reborn");
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    public String getGenus() {
        return genus;
    }

    public String getPlantName() {
        return plantName;
    }
}
