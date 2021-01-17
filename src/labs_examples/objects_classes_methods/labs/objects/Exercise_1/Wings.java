package labs_examples.objects_classes_methods.labs.objects.Exercise_1;

public class Wings {
    String wingHealth;

    public Wings(String health){
        wingHealth = health;
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Wings{" +
                "wingHealth='" + wingHealth + '\'' +
                '}' + "\n";
    }
}
