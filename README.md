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
