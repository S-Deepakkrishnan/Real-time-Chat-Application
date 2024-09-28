
import java.io.*;
import java.net.Socket;

public class ClientHandler implements Runnable {

    private Socket clientSocket;
    private ChatServer server;
    private PrintWriter output;
    private BufferedReader input;
    private String username;
    private ChatRoom currentRoom;

    public ClientHandler(ChatServer server, Socket socket) {
        this.server = server;
        this.clientSocket = socket;
        try {
            this.output = new PrintWriter(clientSocket.getOutputStream(), true);
            this.input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            // Get username and chat room from the client
            this.username = input.readLine();
            String roomID = input.readLine();
            currentRoom = server.createOrJoinRoom(roomID);

            currentRoom.addUser(this);  // Add this client to the room

            String message;
            while ((message = input.readLine()) != null) {
                if (message.equalsIgnoreCase("exit")) {
                    currentRoom.removeUser(this);
                    break;
                }
                currentRoom.broadcastMessage(username, message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                input.close();
                output.close();
                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void sendMessage(String message) {
        output.println(message);
    }

    public String getUsername() {
        return username;
    }
}
