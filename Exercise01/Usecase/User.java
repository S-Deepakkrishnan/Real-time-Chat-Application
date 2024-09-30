
public class User {

    private String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void receiveMessage(String message) {
        System.out.println("[" + username + "] " + message);
    }

    public boolean hasPassword(String password) {
        return "secret".equals(password);  // Simple password check for demo
    }
}
