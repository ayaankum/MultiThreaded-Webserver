import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
public class Server{

    public void run(){
        int port = 8010;
        try {
            ServerSocket socket = new ServerSocket(port);
            socket.setSoTimeout(10000);
            while(true){
                System.out.println("Waiting for client on port " + port);
                Socket acceptedConn = socket.accept();
                System.out.println("connected to " + acceptedConn.getRemoteSocketAddress());
                PrintWriter toClient = new PrintWriter(acceptedConn.getOutputStream());
                BufferedReader fromClient = new BufferedReader(new InputStreamReader(acceptedConn.getInputStream()));
                toClient.println("Hello From the Server");
                toClient.close();
                fromClient.close();
                acceptedConn.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//43,368.051/minute
    public static void main(String[] args) {
       Server server = new Server();
       try{
        server.run();
       }catch(Exception e){
           e.printStackTrace();
       }
    }
}