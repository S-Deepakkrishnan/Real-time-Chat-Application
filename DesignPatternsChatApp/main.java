
public class main {

    public static void main(String[] args) {
        // ChatServer Singleton creation
        ChatServer server = ChatServer.getInstance();

        // Create or join room
        ChatRoom room = server.createOrJoinRoom("Room123");

        // Create users
        User alice = new User("Alice");
        User bob = new User("Bob");

        // Users join the chat room
        room.addUser(alice);
        room.addUser(bob);

        // Using Command Pattern to send messages
        SendMessageCommand sendMessageCommandAlice = new SendMessageCommand(room, alice, "Hello, everyone!");
        sendMessageCommandAlice.execute();

        SendMessageCommand sendMessageCommandBob = new SendMessageCommand(room, bob, "How's it going?");
        sendMessageCommandBob.execute();

        // Use Decorator Pattern for logging
        LoggingChatRoomDecorator loggingRoom = new LoggingChatRoomDecorator(room);
        loggingRoom.sendMessage(alice, "This is Alice's logged message.");
    }
}
