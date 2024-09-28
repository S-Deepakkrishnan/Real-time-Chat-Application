
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {

    private static final int PORT = 12345;  // Port number for the chat server
    private List<ChatRoom> chatRooms;       // List of chat rooms
    private static ChatServer instance;     // Singleton instance of the server

    private ChatServer() {
        chatRooms = new ArrayList<>();
    }

    // Singleton method to get the instance of ChatServer
    public static synchronized ChatServer getInstance() {
        if (instance == null) {
            instance = new ChatServer();
        }
        return instance;
    }

    // Method to start the server and accept client connections
    public static void main(String[] args) {
        ChatServer server = ChatServer.getInstance();
        System.out.println("Chat Server started on port " + PORT);

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("New client connected.");
                new Thread(new ClientHandler(server, clientSocket)).start();  // Pass both server and socket to ClientHandler
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to create or join a chat room by ID
    public synchronized ChatRoom createOrJoinRoom(String roomID) {
        for (ChatRoom room : chatRooms) {
            if (room.getRoomID().equals(roomID)) {
                return room;
            }
        }
        ChatRoom newRoom = new ChatRoom(roomID);
        chatRooms.add(newRoom);
        return newRoom;
    }
}
