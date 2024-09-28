
import java.util.ArrayList;
import java.util.List;

public class ChatRoom {

    private String roomID;
    private List<ClientHandler> users;

    public ChatRoom(String roomID) {
        this.roomID = roomID;
        users = new ArrayList<>();
    }

    public String getRoomID() {
        return roomID;
    }

    public void addUser(ClientHandler user) {
        users.add(user);
        broadcastMessage("Server", user.getUsername() + " joined the room.");
        broadcastActiveUsers();
    }

    public void removeUser(ClientHandler user) {
        users.remove(user);
        broadcastMessage("Server", user.getUsername() + " left the room.");
        broadcastActiveUsers();
    }

    public void broadcastMessage(String username, String message) {
        for (ClientHandler user : users) {
            user.sendMessage("[" + username + "]: " + message);
        }
    }

    public void broadcastActiveUsers() {
        StringBuilder activeUsers = new StringBuilder("Active users in room " + roomID + ": ");
        for (ClientHandler user : users) {
            activeUsers.append(user.getUsername()).append(" ");
        }
        broadcastMessage("Server", activeUsers.toString());
    }
}
