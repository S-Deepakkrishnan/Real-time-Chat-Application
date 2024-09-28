
import java.util.List;
import java.util.ArrayList;

public class ChatServer {

    private static ChatServer instance;
    private List<ChatRoom> chatRooms;

    private ChatServer() {
        chatRooms = new ArrayList<>();
    }

    public static synchronized ChatServer getInstance() {
        if (instance == null) {
            instance = new ChatServer();
        }
        return instance;
    }

    public ChatRoom createOrJoinRoom(String roomID) {
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
