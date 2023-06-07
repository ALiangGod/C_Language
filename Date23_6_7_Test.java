import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Date23_6_7_Test {
    public static void main(String[] args) throws IOException {
        /*DatagramSocket rds = new DatagramSocket(10086);
        byte[] rb = new byte[10];
        DatagramPacket rdp = new DatagramPacket(rb, rb.length);
        System.out.println(1);
        rds.receive(rdp);
        byte[] data = rdp.getData();
        InetAddress address1 = rdp.getAddress();
        int length = rdp.getLength();
        String s = new String(data, 0, length);
        System.out.println(s + address1);
        rds.close();*/
        /*DatagramSocket ds = new DatagramSocket(10086);
        while (true){
            byte[] bytes = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
            ds.receive(dp);
            String s = new String(dp.getData(), 0, dp.getLength());
            System.out.println(s);
            if (s.equals("886")){
                break;
            }

        }
        ds.close();*/
        /*Socket socket = new Socket("127.0.0.1", 10000);
        OutputStream outputStream = socket.getOutputStream();
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        Scanner sc = new Scanner(System.in);
        while (true){
            String str = sc.nextLine();
            if ("886".equals(str)){
                break;
            }
            outputStreamWriter.write(str);
            outputStreamWriter.flush();
        }
        socket.close();*/
        /*Socket socket = new Socket("127.0.0.1", 10000);
        OutputStream os = socket.getOutputStream();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        os.write(str.getBytes());
        socket.shutdownOutput();
        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        int b;
        while ((b = isr.read()) != -1){
            System.out.print((char)b);
        }
        socket.close();*/
        Socket socket = new Socket("127.0.0.1", 10000);
        FileInputStream fis = new FileInputStream("E:\\a\\a.txt");
        BufferedInputStream isr = new BufferedInputStream(fis);
        OutputStream os = socket.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(os);
        int b;
        while ((b = isr.read()) != -1){
            bos.write(b);
        }
        isr.close();
        socket.close();


    }
}
