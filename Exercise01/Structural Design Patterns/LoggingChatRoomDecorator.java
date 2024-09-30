
public class LoggingChatRoomDecorator extends ChatRoomDecorator {

    public LoggingChatRoomDecorator(ChatRoom decoratedChatRoom) {
        super(decoratedChatRoom);
    }

    @Override
    public void addMessage(String username, String message) {
        super.addMessage(username, message);
        System.out.println("Logging: " + username + " sent a message: " + message);
    }
}
