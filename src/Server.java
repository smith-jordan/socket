import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {

    public static final int PORT = 4444;
    public static void main(String[] args) throws IOException, ClassNotFoundException{
           new Server().runServer();
    }
    public void runServer() throws IOException, ClassNotFoundException {
        ServerSocket serverSocket = new ServerSocket(PORT);
        System.out.println("Server up & ready for connections...");
        Socket socket = serverSocket.accept();
        ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
        Message message = (Message)objectInputStream.readObject();
        doSomething(message);
        objectOutputStream.writeObject(message);
        socket.close();
    }
    private void doSomething(Message message){
    message.setResult(message.getFirstNumber().intValue()* message.getSecondNumber().intValue());
    }
}
