public class Main {
    public static void main(String[] args) {
        // Set John's birthday to today to test birthday message
        User john = new User("John", 1954, 7, 30);
        john.displayInfo();
        john.displayHappyBirthday(); // ✅ new method call

        // Set Nicolas's birthday to today to test Admin birthday message
        Admin nicolas = new Admin("Nicolas", 1964, 7, 30);
        nicolas.displayInfo();
        nicolas.displayInfo(true);
        nicolas.displayInfo(false);
        nicolas.displayHappyBirthday(); // ✅ new method call
    }
}
