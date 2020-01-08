

import java.io.IOException;

public class ProxyRunner {
    public static void main(String[] args) throws IOException {
        ProxySocket px = new ProxySocket();
        System.out.println(px.getSocket());
    }
}
