
public class User {

    private String username;
    private ChatRoom currentChatRoom;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void joinRoom(ChatRoom chatRoom) {
        if (currentChatRoom != null) {
            currentChatRoom.removeUser(this);
        }
        this.currentChatRoom = chatRoom;
        chatRoom.addUser(this);
    }

    public void leaveRoom() {
        if (currentChatRoom != null) {
            currentChatRoom.removeUser(this);
            currentChatRoom = null;
        }
    }

    public void sendMessage(String message) {
        if (currentChatRoom != null) {
            currentChatRoom.sendMessage(this, message);
        }
    }

    public void receiveMessage(String message) {
        System.out.println(username + " received: " + message);
    }
}
