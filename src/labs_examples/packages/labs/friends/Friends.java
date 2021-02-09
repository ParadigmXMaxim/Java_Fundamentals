package labs_examples.packages.labs.friends;

public class Friends {
    private String firstName;
    private String lastName;
    protected String[] friendName;

    public Friends(){

    }

    //Create a method to get the name of friends
    protected void setFriendName(){
        this.friendName = new String[3];
        this.friendName[0] = "Courtney Becketts";
        this.friendName[1] = "Kim Simon";
        this.friendName[2] = "Lauren Parker";
    }

    protected void listFriends(){
        System.out.println("My friends names are:");
        for(String name : this.friendName){
            System.out.println(name);
        }
    }
}
