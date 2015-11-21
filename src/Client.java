import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;


public class Client {
    public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException{
        Socket socket = new Socket ("localhost", Server.PORT);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
        Message message = new Message(5,7);
        objectOutputStream.writeObject(message);
        Message returnMessage = (Message)objectInputStream.readObject();
        System.out.println(returnMessage.getResult());
        socket.close();
    }
    
}
