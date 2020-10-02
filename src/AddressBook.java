import java.util.ArrayList; // import the ArrayList class
public class AddressBook {

    private ArrayList<BuddyInfo> myBuddies;

    //Constructor
    public AddressBook(){
        myBuddies = new ArrayList<BuddyInfo>();
    }

    //adds a BuddyInfo object to the AddressBook
    public void addBuddy(BuddyInfo bud){
        if(bud != null){
            myBuddies.add(bud);
        }
    }

    //removes a BuddyInfo object to the AddressBook
    public BuddyInfo removeBuddy(int index){
        if(index >= 0 && index < myBuddies.size()){
            return myBuddies.remove(index);
        }
        return null;
    }


    public static void main(String[] args) {
        // test comment 1
        BuddyInfo buddy = new BuddyInfo("Tom");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }

}
