package miniproject_oops;


public abstract class User {
    protected String username;

    public User(String username) {
        this.username = username;
    }

    public abstract void login();
}

