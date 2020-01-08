

import java.io.*;
import java.net.ServerSocket;

public class ProxySocket extends ServerSocket {

    File config = new File("file.txt");
    int port;
    public ProxySocket() throws IOException {
        FileReader conifgurator = new FileReader(config);
        port = 8080;
        BufferedReader configuration = new BufferedReader(new InputStreamReader(new FileInputStream(config)));
        String line;
        while((line = configuration.readLine())!= null)
        {
            if(line.contains("PROXY_PORT"))
            {
                line = line.replace("PROXY_PORT=","");
                String pattern = ("(\\d\\d\\d\\d)");
                if(line.matches(pattern))
                {
                    port = Integer.parseInt(line);
                    System.out.println("Proxy is connected on socket:" + port);
                }
            }
        }

    }

    public ProxySocket(int port) throws IOException {
        super(port);
    }

    public int getSocket()
    {
        return port;
    }
}
