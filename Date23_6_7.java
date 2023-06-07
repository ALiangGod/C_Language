import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Date23_6_7 {
    public static void main(String[] args) throws IOException, InterruptedException {
        /*InetAddress byName = InetAddress.getByName("192.168.1.100");
        System.out.println(byName);
        InetAddress allByName = InetAddress.getByName("DESKTOP-LQL8JGB");
        String address = allByName.getHostAddress();
        System.out.println(address+allByName.getHostName());*/
        /*DatagramSocket ds = new DatagramSocket();
        String str = "你好啊";
        byte[] b = str.getBytes();
        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port = 10086;
        DatagramPacket dp = new DatagramPacket(b, b.length, address, port);
        ds.send(dp);
        ds.close();*/
        /*DatagramSocket ds = new DatagramSocket();

        while (true){
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            byte[] b = str.getBytes();
            InetAddress ip = InetAddress.getByName("127.0.0.1");
            int port = 10086;
            DatagramPacket dp = new DatagramPacket(b, b.length, ip, port);
            ds.send(dp);
            if (str.equals("886"))
                break;
        }
        ds.close();*/
       /* ServerSocket serverSocket = new ServerSocket(10000);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        int s;
        while ((s = inputStreamReader.read()) != -1){
            System.out.print((char)s);
        }
        socket.close();
        serverSocket.close();*/
        /*ServerSocket ss = new ServerSocket(10000);
        Socket accept = ss.accept();
        InputStreamReader isr = new InputStreamReader(accept.getInputStream());
        int b;
        while ((b = isr.read()) != -1){
            System.out.print((char)b);
        }
        OutputStream os = accept.getOutputStream();
        os.write("你好啊".getBytes());

        accept.close();
        ss.close();*/
        ServerSocket ss = new ServerSocket(10000);
        Socket accept = ss.accept();
        InputStream inputStream = accept.getInputStream();
        InputStreamReader isr = new InputStreamReader(inputStream);
        FileOutputStream fos = new FileOutputStream("E:\\a\\TCP.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        int b;
        while ((b = isr.read()) != -1){
            System.out.print((char)b);
            osw.write(b);
        }
        osw.close();
        accept.close();
        ss.close();

    }
}
