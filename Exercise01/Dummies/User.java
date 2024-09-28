
public class User {

    private String username;
    private String password; // Optional: Store password if necessary

    public User(String username, String password) {
        this.username = username;
        this.password = password; // Set password for authentication
    }

    public String getUsername() {
        return username;
    }

    public void receiveMessage(String message) {
        System.out.println(message);
    }

    // Method to check if the user has the correct password
    public boolean hasPassword(String password) {
        return this.password.equals(password);
    }
}
