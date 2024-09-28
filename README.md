Sure! Here’s the updated README with the corrected project structure:

---

# Real-time Chat Application

This is a simple real-time chat application where users can join different chat rooms or create their own. Users can send and receive messages in real-time, see the list of active users in each chat room, and optionally use private messaging or message history features. The project demonstrates the use of various design patterns, such as Observer, Singleton, and Adapter, while focusing on object-oriented principles.

## Features

- **Real-time communication:** Users can send and receive messages instantly.
- **Multiple chat rooms:** Users can create or join chat rooms by entering a unique room ID.
- **List of active users:** Displays the list of currently active users in the chat room.
- **Message history (optional):** The message history persists even when users leave and rejoin.
- **Private messaging (optional):** Allows private one-to-one messages between users.

## Design Patterns Implemented

1. **Observer Pattern:** Used to notify clients of new messages or user activities in the chat rooms.
2. **Singleton Pattern:** Manages the state of the chat rooms to ensure a single instance per room.
3. **Adapter Pattern:** Allows the system to work with different types of client communication protocols (e.g., WebSocket, HTTP).

## Technologies Used

- **Java** (JDK 8 or above)
- **Multithreading** for handling multiple clients
- **Sockets** for real-time client-server communication

## Getting Started

### Prerequisites

- Install [Java JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) (version 8 or above)
- Git installed on your system
- Basic understanding of running Java applications in the terminal

### How to Run

#### Server

1. Open a terminal and navigate to the project directory.
2. Compile the server:
   ```bash
   javac ChatServer.java
   ```
3. Start the server:
   ```bash
   java ChatServer
   ```
   The server will start listening for client connections on port 12345 by default.

#### Client

1. Open a second terminal for each client.
2. Compile the client:
   ```bash
   javac ChatClient.java
   ```
3. Run the client:
   ```bash
   java ChatClient
   ```
4. When prompted, enter a username and the room ID you wish to create/join.

#### Example Interaction

1. **Terminal 1 (Server)**
   ```bash
   java ChatServer
   Chat Server started on port 12345
   New client connected.
   New client connected.
   ```

2. **Terminal 2 (Client 1 - Alice)**
   ```bash
   java ChatClient
   Enter your username: Alice
   Enter room ID to create/join: Room123
   Server: Alice joined the room.
   Server: Active users in room Room123: Alice
   Alice, enter your message (or type 'exit' to leave the room): Hello, everyone!
   Server: [Alice]: Hello, everyone!
   ```

3. **Terminal 3 (Client 2 - Bob)**
   ```bash
   java ChatClient
   Enter your username: Bob
   Enter room ID to create/join: Room123
   Server: Bob joined the room.
   Server: Active users in room Room123: Alice, Bob
   Bob, enter your message (or type 'exit' to leave the room): How's it going?
   Server: [Bob]: How's it going?
   ```

### Project Structure

```
ChatApplication
└── Chat
    ├── ChatServer.java           // Manages the chat rooms and clients
    ├── ChatClient.java           // Handles the client-side operations
    ├── ChatRoom.java             // Represents the chat rooms
    ├── ClientHandler.java         // Manages each client's connection and messages
    └── README.md                 // Detailed project documentation
```

### Code Explanation

- **ChatServer.java:** Handles multiple clients by listening for incoming connections. Each client is assigned to a separate thread.
- **ChatClient.java:** Allows users to join a chat room and send/receive messages in real-time.
- **ChatRoom.java:** Manages the chat room, keeps track of active users, and handles broadcasting messages to all users.
- **ClientHandler.java:** Handles the interaction between the client and server, including message forwarding, user join/leave notifications, etc.

### Design Considerations

- **Observer Pattern:** Used to notify all clients in the room about new messages or user activities (joining/leaving).
- **Singleton Pattern:** Ensures that each chat room is created once and only one instance of it exists throughout the application.
- **Adapter Pattern:** Could be extended to support different communication protocols (e.g., WebSockets or HTTP).

### Future Enhancements

- Implement a **private messaging** feature between users.
- Add **message history** so that users can see past conversations when they rejoin a chat room.
- Extend the **Adapter Pattern** to support WebSocket communication.
- Implement user authentication and more robust security.

### Known Issues

- No authentication mechanism is in place, so any user can join any room by simply entering a room ID.
- The current message history is not persistent after restarting the server.

## License

This project is open-source and free to use under the [MIT License](LICENSE).

---

Feel free to further modify the README to fit your preferences or any specific details related to your project!
