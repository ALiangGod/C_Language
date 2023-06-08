import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;

public class Date23_6_8_User {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10000);
        BufferedInputStream bif = new BufferedInputStream(new FileInputStream("E:\\a\\2.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        int b;
        while ((b = bif.read()) != -1){
            bos.write(b);
            bos.flush();
        }
        socket.shutdownOutput();
        bif.close();
        socket.close();
    }
}
