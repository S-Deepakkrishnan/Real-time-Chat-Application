
public class WebSocketAdapter implements ProtocolAdapter {

    private WebSocketClient client;

    public WebSocketAdapter(WebSocketClient client) {
        this.client = client;
    }

    @Override
    public void send(String message) {
        client.sendWebSocketMessage(message);
    }

    @Override
    public String receive() {
        return client.receiveWebSocketMessage();
    }
}
