import java.io.*;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Arrays;

public class Date23_6_2 {
    public static void main(String[] args) throws IOException {
        /*File f1 = new File("E:\\a\\mp.mp4");
        File f2 = new File("E:\\a\\m1.mp4");
        FileOutputStream fileOutputStream1 = new FileOutputStream("E:\\a\\m1.mp4");
        FileInputStream fileInputStream1 = new FileInputStream("E:\\a\\mp.mp4");
        int b;
        while ((b = fileInputStream1.read()) != -1){
            fileOutputStream1.write(b);
        }
        fileOutputStream1.close();
        fileInputStream1.close();*/
      /*  FileInputStream fin1 = new FileInputStream("E:\\a\\mp.mp4");
        FileOutputStream fou2 = new FileOutputStream("E:\\a\\m.mp4");
        byte[] by = new byte[1024*1024];
        int len;*/
        /*while ((len = fin1.read(by)) != -1){
            fou2.write(by, 0, len);
        }
        fou2.close();
        fin1.close();*/

       /* String str  = "ai你哟";
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));
        byte[] gbks = str.getBytes("GBK");
        System.out.println(Arrays.toString(gbks));
        System.out.println(new String(bytes, "GBK"));
        System.out.println(new String(bytes));*/
    /*    long l = System.currentTimeMillis();
        FileReader f = new FileReader("E:\\a\\a.txt");*/
       /* int a;
       while ((a = f.read()) != -1){
           System.out.print((char)a);
       }
        f.close();*/
       /* char[] chars = new char[100];
        int len;
        while ((len = f.read(chars)) != -1){
            System.out.print(new String(chars, 0, len));
        }
        f.close();
        long l1 = System.currentTimeMillis();
        System.out.println();
        System.out.println(l1 + "===" + l + "===" + (l1-l));*/
       /*FileWriter f = new FileWriter("E:\\a\\a.txt", true);
       f.write("我是你爹\r\n哈哈");
       f.close();*/
      /* int a = 1;
        a++;
        a++;
        a++;
        a++;
        a++;
        a++;
        a++;
        a++;
        a++;
        a++;
        a++;
        a++;
        a++;*/
//      FileInputStream fileInputStream = new FileInputStream("E:\\a");
        copyFile("E:\\a\\a", "E:\\a\\b");


    }
    private static void copyFile(String oldStr, String newStr) throws IOException {
        if (newStr.contains(oldStr))
            throw new IOException();
        File oldFile = new File(oldStr);
        File newFile = new File(newStr);
        newFile.mkdir();
        File[] files = oldFile.listFiles();
        for (File file : files) {
            if (file.isFile()){
                FileInputStream fileInputStream = new FileInputStream(file);
                FileOutputStream fileOutputStream = new FileOutputStream(new File(newFile, file.getName()));
                byte[] b = new byte[1024];
                int len;
                while ((len = fileInputStream.read(b)) != -1){
                    fileOutputStream.write(b);
                }
                fileOutputStream.close();
                fileInputStream.close();
            }else {
                copyFile(file.getPath(), new File(newFile, file.getName()).getPath());
            }
        }
    }
}
