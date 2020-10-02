public class BuddyInfo {
    private String name;

    public BuddyInfo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        // test comment 2
        //create BuddyInfo object
        BuddyInfo myBuddy = new BuddyInfo("Homer");

        System.out.println("Hello " + myBuddy.getName());
    }
}
