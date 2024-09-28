
public class SocketAdapter implements ProtocolAdapter {

    private SocketClient client;

    public SocketAdapter(SocketClient client) {
        this.client = client;
    }

    @Override
    public void send(String message) {
        client.sendSocketMessage(message);
    }

    @Override
    public String receive() {
        return client.receiveSocketMessage();
    }
}
