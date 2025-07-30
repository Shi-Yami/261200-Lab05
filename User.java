import java.time.LocalDate;

public class User {
    protected String name;
    protected LocalDate dob;

    public User() {
        name = null;
        dob = LocalDate.now();
    }

    public User(String name, int year, int month, int day) {
        this.name = name;
        this.dob = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void displayInfo() {
        System.out.println(this.name);
        System.out.println(this.dob);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(int year, int month, int day) {
        this.dob = LocalDate.of(year, month, day);
    }

    public boolean isBirthday() {
        LocalDate today = LocalDate.now();
        return (today.getMonth() == dob.getMonth() && today.getDayOfMonth() == dob.getDayOfMonth());
    }

    public void displayHappyBirthday() {
        if (isBirthday()) {
            System.out.println("Happy birthday " + this.name + "!");
        }
    }
}

