import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.io.*;

public class Client {
    public void run() throws Exception {
        int port = 8010;
        InetAddress address = InetAddress.getByName("localhost");
        Socket client = new Socket(address, port);
        PrintWriter toServer = new PrintWriter(client.getOutputStream());
        BufferedReader fromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
        toServer.println("Hello From the Client");
        String line = fromServer.readLine();
        System.out.println("Server says: " + line);
        toServer.close();
        fromServer.close();
        client.close();
    }

    public static void main(String[] args) {
        Client client = new Client();
        try {
            client.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
