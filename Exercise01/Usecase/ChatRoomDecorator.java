
public abstract class ChatRoomDecorator extends ChatRoom {

    protected ChatRoom decoratedChatRoom;

    public ChatRoomDecorator(ChatRoom decoratedChatRoom) {
        super(decoratedChatRoom.getRoomID());
        this.decoratedChatRoom = decoratedChatRoom;
    }

    @Override
    public void addUser(User user) {
        decoratedChatRoom.addUser(user);
    }

    @Override
    public void addMessage(String username, String message) {
        decoratedChatRoom.addMessage(username, message);
    }

    @Override
    public List<String> getMessageHistory() {
        return decoratedChatRoom.getMessageHistory();
    }
}
