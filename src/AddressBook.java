import java.util.ArrayList; // import the ArrayList class
public class AddressBook {

    private ArrayList<BuddyInfo> Buddies;

    //Constructor
    public AddressBook(){
        Buddies = new ArrayList<BuddyInfo>();
    }

    //adds a BuddyInfo object to the AddressBook
    public void addBuddy(BuddyInfo bud){
        Buddies.add(bud);
    }

    //removes a BuddyInfo object to the AddressBook
    public void removeBuddy(BuddyInfo bud){

        //todo , implement by name??
        Buddies.remove(bud);
    }


    public static void main(String[] args) {
        System.out.println("Address Book1");

        BuddyInfo buddy = new BuddyInfo("Tom");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }

}
