
import java.util.ArrayList;
import java.util.List;

public class ChatServer {

    private static ChatServer instance = null;
    private List<ChatRoom> chatRooms = new ArrayList<>();

    private ChatServer() {
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
