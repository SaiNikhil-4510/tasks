package miniproject_oops;


public class Admin extends User {
    public Admin(String username) {
        super(username);
    }

    @Override
    public void login() {
        System.out.println("Admin " + username + " logged in.");
    }
}
