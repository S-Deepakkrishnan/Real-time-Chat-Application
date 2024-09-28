
public class LoggingChatRoomDecorator extends ChatRoom {

    private ChatRoom decoratedChatRoom;

    public LoggingChatRoomDecorator(ChatRoom chatRoom) {
        super(chatRoom.getRoomID());
        this.decoratedChatRoom = chatRoom;
    }

    @Override
    public void sendMessage(User user, String message) {
        System.out.println("Logging: User " + user.getUsername() + " sent message: " + message);
        decoratedChatRoom.sendMessage(user, message);
    }

    @Override
    public void addUser(User user) {
        System.out.println("Logging: User " + user.getUsername() + " joined the room.");
        decoratedChatRoom.addUser(user);
    }

    @Override
    public void removeUser(User user) {
        System.out.println("Logging: User " + user.getUsername() + " left the room.");
        decoratedChatRoom.removeUser(user);
    }
}
