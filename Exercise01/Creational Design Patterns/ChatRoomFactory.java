
public class ChatRoomFactory {

    public static ChatRoom createChatRoom(String type, String roomID) {
        if (type.equalsIgnoreCase("private")) {
            return new PrivateChatRoom(roomID);
        } else {
            return new ChatRoom(roomID); // Default is public room
        }
    }
}
