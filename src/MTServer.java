import java.net.*;
import java.io.*;

public class MTServer {

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(9090);
            boolean stop = false;
            while (!stop) {
                System.out.println("Waiting for client...");
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client is connected");
                ClientThread clientThread = new ClientThread(clientSocket);
                clientThread.start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
