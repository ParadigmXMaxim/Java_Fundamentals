package labs_examples.objects_classes_methods.labs.objects.Exercise_1;

public class Frame {
    String logoName;

    public Frame(){
        System.out.println(toString());
    }

    public void setLogoName(String name){
        logoName = name;
    }

    public String getLogoName(){
        return logoName;
    }

    @Override
    public String toString() {
        return "Frame{" +
                "logoName='" + logoName + '\'' +
                '}' + "\n";
    }
}
