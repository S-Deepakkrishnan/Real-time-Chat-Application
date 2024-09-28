
import java.util.List;
import java.util.ArrayList;

public class ChatRoom {

    private String roomID;
    private List<User> users;
    private List<String> messageHistory;

    public ChatRoom(String roomID) {
        this.roomID = roomID;
        this.users = new ArrayList<>();
        this.messageHistory = new ArrayList<>();
    }

    public String getRoomID() {
        return roomID;
    }

    public void addUser(User user) {
        users.add(user);
        notifyUsers(user.getUsername() + " joined the room.");
    }

    public void removeUser(User user) {
        users.remove(user);
        notifyUsers(user.getUsername() + " left the room.");
    }

    public void sendMessage(User user, String message) {
        String formattedMessage = "[" + user.getUsername() + "]: " + message;
        messageHistory.add(formattedMessage);
        notifyUsers(formattedMessage);
    }

    public List<String> getMessageHistory() {
        return messageHistory;
    }

    private void notifyUsers(String message) {
        for (User user : users) {
            user.receiveMessage(message);
        }
    }
}
