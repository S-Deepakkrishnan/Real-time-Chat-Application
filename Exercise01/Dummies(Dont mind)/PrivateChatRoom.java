
public class PrivateChatRoom extends ChatRoom {

    private String password;

    public PrivateChatRoom(String roomID) {
        super(roomID);
        this.password = "secret"; // hardcoded for simplicity
    }

    @Override
    public void addUser(User user) {
        if (user.hasPassword(password)) {
            super.addUser(user);
        } else {
            user.receiveMessage("Access denied! Incorrect password.");
        }
    }
}
