# **Exercise 1: Design Patterns Implementation in Java**

## **Overview**
This project demonstrates the implementation of six different use cases to showcase Behavioral, Creational, and Structural design patterns in Java. These design patterns are applied in the context of a real-time chat application, allowing users to join chat rooms, send and receive messages in real-time, and view the list of active users.

### **Design Patterns Covered**
1. **Behavioral Design Patterns**:
   - **Observer Pattern**: Notifies users of new messages or activities in the chat room.
   - **Command Pattern**: Encapsulates user actions such as sending a message or joining a chat room.
   
2. **Creational Design Patterns**:
   - **Singleton Pattern**: Ensures that only one instance of the `ChatServer` exists.
   - **Factory Method Pattern**: Creates different types of chat rooms, such as public or private rooms.

3. **Structural Design Patterns**:
   - **Adapter Pattern**: Adapts different client communication protocols, like WebSocket or Socket.
   - **Decorator Pattern**: Adds additional functionalities like logging or encryption to the `ChatRoom` without modifying the original class.

---

## **Project Structure**

```bash
DesignPatternsProject/
├── src/
│   ├── behavioral/
│   │   ├── ChatRoom.java
│   │   ├── User.java
│   │   ├── Command.java
│   │   ├── SendMessageCommand.java
│   ├── creational/
│   │   ├── ChatServer.java
│   │   ├── ChatRoomFactory.java
│   │   ├── PrivateChatRoom.java
│   ├── structural/
│   │   ├── ProtocolAdapter.java
│   │   ├── SocketAdapter.java
│   │   ├── WebSocketAdapter.java
│   │   ├── ChatRoomDecorator.java
│   │   ├── LoggingChatRoomDecorator.java
├── README.md
└── .gitignore
```

- `behavioral/`: Contains files related to the Behavioral Design Patterns (Observer, Command).
- `creational/`: Contains files related to the Creational Design Patterns (Singleton, Factory Method).
- `structural/`: Contains files related to the Structural Design Patterns (Adapter, Decorator).

---

## **Design Patterns Explanation**

### **1. Behavioral Design Patterns**
- **Observer Pattern**: This pattern is used to notify all active users in a chat room of new messages or when a user joins or leaves.
- **Command Pattern**: This pattern encapsulates actions like sending a message, allowing for decoupling between the object invoking the action and the object performing the action.

### **2. Creational Design Patterns**
- **Singleton Pattern**: Used to ensure that only one instance of the `ChatServer` is created throughout the application.
- **Factory Method Pattern**: Used to create different types of chat rooms, such as public or private chat rooms.

### **3. Structural Design Patterns**
- **Adapter Pattern**: This pattern adapts various client communication protocols (e.g., WebSocket, Socket), allowing the chat server to work with different types of clients.
- **Decorator Pattern**: This pattern is used to add extra functionality to `ChatRoom`, such as logging, without modifying the original class.

---

## **How to Run the Project**

### **Prerequisites**
- Java 8 or higher.
- Java IDE (such as IntelliJ IDEA, Eclipse) or terminal for compiling and running the project.

### **Steps to Run the Project**

1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/DesignPatternsProject.git
   ```

2. **Navigate to the project directory**:
   ```bash
   cd DesignPatternsProject/src
   ```

3. **Compile the project**:
   ```bash
   javac behavioral/*.java creational/*.java structural/*.java
   ```

4. **Run the main class**:  
   Create a `Main.java` file for testing each design pattern implementation and execute it.
   ```bash
   java Main
   ```

### **Expected Behavior**

- When testing the Observer Pattern, users should receive real-time updates on messages and user activities.
- Using the Command Pattern, user actions such as sending messages can be encapsulated and executed independently.
- The Singleton Pattern ensures that only one `ChatServer` instance exists, managing all chat rooms centrally.
- The Factory Method Pattern allows creating different types of chat rooms.
- The Adapter Pattern will allow communication using various protocols (like WebSocket, Socket).
- The Decorator Pattern adds additional features like logging and message encryption without altering the core `ChatRoom` functionality.

---

## **Enhancements**
This project can be extended with the following features:
- **Logging Mechanism**: Add more detailed logs for user actions.
- **Private Messaging**: Implement a feature that allows users to send private messages within a room.
- **Message Encryption**: Implement a `MessageEncryptionDecorator` to encrypt messages for secure communication.

---
