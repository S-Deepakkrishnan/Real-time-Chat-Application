
public class Main {

    public static void main(String[] args) {
        ChatServer server = ChatServer.getInstance();
        ChatRoom room = server.createOrJoinRoom("Room123");

        User alice = new User("Alice");
        User bob = new User("Bob");

        room.addUser(alice);
        room.addUser(bob);

        Command sendMessage = new SendMessageCommand(room, alice, "Hello everyone!");
        sendMessage.execute();

        sendMessage = new SendMessageCommand(room, bob, "How's it going?");
        sendMessage.execute();
    }
}
