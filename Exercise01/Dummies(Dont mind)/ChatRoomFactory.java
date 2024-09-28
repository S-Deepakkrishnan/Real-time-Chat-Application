
import java.util.ArrayList;
import java.util.List;

public class ChatRoomFactory {

    public static ChatRoom createChatRoom(String type, String roomID) {
        if (type.equalsIgnoreCase("private")) {
            return new PrivateChatRoom(roomID);
        } else {
            return new ChatRoom(roomID); // Default to public room
        }
    }
}
