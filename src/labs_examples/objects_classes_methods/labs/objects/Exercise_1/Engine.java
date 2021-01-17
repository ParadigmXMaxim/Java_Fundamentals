package labs_examples.objects_classes_methods.labs.objects.Exercise_1;

public class Engine {
    public String engineMode;
    public String engineStatus;

    public Engine(){
        this.engineMode = "OFF";
        this.engineStatus = "GREEN";
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engineMode='" + engineMode + '\'' +
                ", engineStatus='" + engineStatus + '\'' +
                '}' + "\n";
    }
}
