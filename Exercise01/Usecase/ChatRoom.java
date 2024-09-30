
import java.util.ArrayList;
import java.util.List;

// Observer pattern for notifying clients
public class ChatRoom {

    private String roomID;
    private List<User> users = new ArrayList<>();
    private List<String> messageHistory = new ArrayList<>();

    public ChatRoom(String roomID) {
        this.roomID = roomID;
    }

    public void addUser(User user) {
        users.add(user);
        notifyUsers(user.getUsername() + " joined the room.");
    }

    public void removeUser(User user) {
        users.remove(user);
        notifyUsers(user.getUsername() + " left the room.");
    }

    public void addMessage(String username, String message) {
        String fullMessage = "[" + username + "]: " + message;
        messageHistory.add(fullMessage);
        notifyUsers(fullMessage);
    }

    public void notifyUsers(String message) {
        for (User user : users) {
            user.receiveMessage(message);
        }
    }

    public List<String> getMessageHistory() {
        return messageHistory;
    }

    public String getRoomID() {
        return roomID;
    }
}
