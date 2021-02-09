package labs_examples.packages.labs.family;

import labs_examples.packages.labs.friends.Friends;
public class Family extends Friends {
    private String firstName;
    private String lastName;
    protected String[] familyMember;

    public Family(String firstName, String lastName){
        super();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    protected void setFamilyMember(){
        this.familyMember = new String[3];
        this.familyMember[0] = "Soma Imes";
        this.familyMember[1] = "Macha Imes";
        this.familyMember[2] = "Sencha Imes";
    }

    protected void listFamily(){
        System.out.println("Some of my family members are below:");
        for(String name : this.familyMember){
            System.out.println(name);
        }
    }

    public static void main(String[] args){
        Family f1 = new Family("Ian", "Imes");
        f1.setFamilyMember();
        f1.setFriendName();
        f1.listFamily();
        f1.listFriends();
    }
}
