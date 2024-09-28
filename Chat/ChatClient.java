
import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {

    private Socket socket;
    private BufferedReader input;
    private PrintWriter output;

    public ChatClient(String serverAddress, int serverPort) throws IOException {
        socket = new Socket(serverAddress, serverPort);  // Connect to server
        input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        output = new PrintWriter(socket.getOutputStream(), true);
    }

    public void start() {
        new Thread(new ServerListener()).start();  // Start a thread to listen for messages from server

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your username: ");
            String username = scanner.nextLine();
            output.println(username);

            System.out.println("Enter room ID to create/join: ");
            String roomID = scanner.nextLine();
            output.println(roomID);

            while (true) {
                System.out.println(username + ", enter your message (or type 'exit' to leave the room): ");
                String message = scanner.nextLine();
                if (message.equalsIgnoreCase("exit")) {
                    output.println("exit");
                    break;
                }
                output.println(message);
            }
        } // Removed the unnecessary catch block here
    }

    private class ServerListener implements Runnable {

        @Override
        public void run() {
            try {
                String serverMessage;
                while ((serverMessage = input.readLine()) != null) {
                    System.out.println("Server: " + serverMessage);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        try {
            ChatClient client = new ChatClient("localhost", 12345);  // Connect to localhost server on port 12345
            client.start();
        } catch (IOException e) {
            System.out.println("Unable to connect to the chat server.");
        }
    }
}
