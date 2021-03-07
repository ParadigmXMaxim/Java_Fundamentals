package labs_examples.enumerations.labs;

public class MarriageStatus {
    public static void main(String[] args){
        System.out.println("Hello, can you tell us your marital status");
        MaritalStatus ms = MaritalStatus.SINGLE;
        
        System.out.println("I see you entered " + ms.getAbbreviation() + " which means you are " + ms);
    }
}
