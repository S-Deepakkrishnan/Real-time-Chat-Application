
public class SendMessageCommand implements Command {

    private ChatRoom chatRoom;
    private User user;
    private String message;

    public SendMessageCommand(ChatRoom chatRoom, User user, String message) {
        this.chatRoom = chatRoom;
        this.user = user;
        this.message = message;
    }

    @Override
    public void execute() {
        user.sendMessage(message);
    }
}
