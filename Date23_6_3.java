import javax.lang.model.element.NestingKind;
import java.io.*;
import java.nio.charset.Charset;
import java.util.*;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Date23_6_3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        File f1 = new File("E:\\a\\c.txt");
//        File f2 = new File("E:\\a\\d.txt");
//        File f3 = new File("E:\\a\\e.txt");
       /* encryption(f1,f2);
        decrypt(f2, f3);*/
//       File f4 = new File("E:\\a\\a.txt");
//       sort2(f4, f3);
        /*int[] a = {1,2,3};
        for (int i = 0; i < a.length; i++) {
            a[i]++;
        }
        System.out.println(Arrays.toString(a));*/
       /* String[] str = {"aaa","bbb","ccc"};
        for (String s : str) {
            if (s.equals("aaa"))
                s = "ddd";
        }
        System.out.println(Arrays.toString(str));*/
        /*Integer[] num = {1,2,3};
        for (Integer integer : num) {
            integer = integer+1;
        }
        System.out.println(Arrays.toString(num));*/
        /*Stu[] s = new Stu[3];
        for (int i = 0; i < s.length; i++) {
            s[i] = new Stu("zhang", i);
        }
        for (Stu stu : s) {
            if (stu.age == 0)
                stu.name = "wang";
        }
        System.out.println(Arrays.toString(s));

*/
        /*BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\a\\a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\a\\b.txt"));
        int b;
        byte[] b1 = new byte[1024];
        while ((b = bis.read(b1)) != -1){
            bos.write(b1, 0, b);
        }
        bos.close();
        bis.close();
*/
        /*BufferedReader br = new BufferedReader(new FileReader("E:\\a\\a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\a\\e.txt"));
//        String s = br.readLine();
//        System.out.println(s);
        String s;
        while ((s = br.readLine()) != null){
            System.out.println(s);
        }
        br.close();

        bw.close();*/
   /*     File f1 = new File("E:\\a\\a.txt");
        File f2 = new File("E:\\a\\g.txt");
*/
//        onlyByteBufferedInput(f1, f2);
//        arrByteBufferedInput(f1, f2);
//
//        onlyByteFileInputStream(f1, f2);
//        arrByteFileInputStream(f1, f2);
//        sortTxt2(f1, f2);
//        useNumber(f1);
        /*File f1 = new File("f.txt");
        InputStreamReader isr = new InputStreamReader(new FileInputStream(f1),"GBK");
        int b;
        while ((b = isr.read()) != -1){
            System.out.print((char)b);
        }
        isr.close();*/
        /*FileReader fr = new FileReader("f.txt", Charset.forName("GBK"));
        int b;
        while ((b = fr.read()) != -1) {
            System.out.print((char)b);
        }
        fr.close();*/
       /* OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("g.txt"), "GBK");
        osw.write("你好你好");
        osw.close();
*/
        /*Stu stu = new Stu("王六",12, "a");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("E:\\a\\a.txt"));
        objectOutputStream.writeObject(stu);
        objectOutputStream.close();*/
      /*  ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\a\\a.txt"));
        Stu b = (Stu)ois.readObject();
        System.out.println(b);
        ois.close();*/
        /*Stu stu1 = new Stu("张三",11,"家1");
        Stu stu2 = new Stu("里斯",12,"家2");
        Stu stu3 = new Stu("王五",13,"家3");
        ArrayList<Stu> list = new ArrayList<>();*/
//        list.add(stu1);
//        list.add(stu2);
//        list.add(stu3);
      /*Collections.addAll(list, stu1, stu2, stu3);
        System.out.println(list);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("E:\\a\\a.txt"));
        objectOutputStream.writeObject(list);
        objectOutputStream.close();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("E:\\a\\a.txt"));
        ArrayList<Stu> l = (ArrayList<Stu>)objectInputStream.readObject();
        System.out.println(l);
      */
        /*PrintStream ps = new PrintStream(new FileOutputStream("E:\\a\\h.txt"), true, Charset.forName("GBK"));
        ps.println(123);
        ps.close();*/
        File f1 = new File("E:\\a\\all.zip");
        File f2 = new File("E:\\a\\");
        unZip(f1, f2);


    }
    private static void unZip(File f1, File f2) throws IOException {
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(f1));
        ZipEntry nextEntry;
        while ((nextEntry = zipInputStream.getNextEntry()) != null){
            System.out.println(nextEntry);
            if (nextEntry.isDirectory()){
                File f3 = new File(f2, nextEntry.toString());
                f3.mkdir();
            }else {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(f2, nextEntry.toString()));
                int b;
                while ((b = zipInputStream.read()) != -1){
                    fileOutputStream.write(b);
                }
                fileOutputStream.close();
                zipInputStream.closeEntry();
            }
        }
        zipInputStream.close();
    }
    private static void useNumber(File f1) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new FileReader(f1));
        String b;
        b = bufferedReader.readLine();
        bufferedReader.close();
        if (Integer.parseInt(b) <= 3){
            System.out.println("yes");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(f1));
            int i = Integer.parseInt(b);
            i++;
            bufferedWriter.write(i+"");
            bufferedWriter.close();
        }else
            System.out.println("Can't using");

    }
    private static void sortTxt2(File f1, File f2) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(f1));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(f2));
        String str;
        ArrayList<String> list = new ArrayList<>();
        while ((str = bufferedReader.readLine()) != null){
            list.add(str);
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o1.split("\\.")[0]) - Integer.parseInt(o2.split("\\.")[0]);
            }
        });
        System.out.println(list);
        bufferedWriter.close();
        bufferedReader.close();


    }
    private static void sortTxt(File f1, File f2) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(f1));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(f2));
        String str;
        ArrayList<String> list = new ArrayList<>();
        while ((str = bufferedReader.readLine()) != null){
            list.add(str);
        }
        for (int i = 1; i <= list.size(); i++) {
            for (String s : list) {
                if (s.startsWith(i+"")){
                    bufferedWriter.write(s);
                    bufferedWriter.newLine();
                    break;
                }
            }
        }
        bufferedWriter.close();
        bufferedReader.close();


    }
    private static void onlyByteFileInputStream(File f1, File f2) throws IOException {
        long start = System.currentTimeMillis();
        FileInputStream fileInputStream = new FileInputStream(f1);
        FileOutputStream fileOutputStream = new FileOutputStream(f2);
        int b;
        while ((b = fileInputStream.read()) != -1){
            fileOutputStream.write(b);
        }
        fileOutputStream.close();
        fileInputStream.close();
        long end = System.currentTimeMillis();
        System.out.println(start-end);
    }
    private static void arrByteFileInputStream(File f1, File f2) throws IOException {
        long start = System.currentTimeMillis();
        FileInputStream fileInputStream = new FileInputStream(f1);
        FileOutputStream fileOutputStream = new FileOutputStream(f2);
        int len;
        byte[] b = new byte[1024];
        while ((len = fileInputStream.read(b)) != -1){
            fileOutputStream.write(b, 0, len);
        }
        fileOutputStream.close();
        fileInputStream.close();
        long end = System.currentTimeMillis();
        System.out.println(start-end);
    }
    private static void onlyByteBufferedInput(File f1, File f2) throws IOException {
        long start = System.currentTimeMillis();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(f1));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(f2));
        int b;
        while ((b = bufferedInputStream.read()) != -1){
            bufferedOutputStream.write(b);
        }
        bufferedOutputStream.close();
        bufferedInputStream.close();
        long end = System.currentTimeMillis();
        System.out.println(start-end);
    }
    private static void arrByteBufferedInput(File f1, File f2) throws IOException {
        long start = System.currentTimeMillis();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(f1));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(f2));
        int len;
        byte[] b = new byte[1024];
        while ((len = bufferedInputStream.read(b)) != -1){
            bufferedOutputStream.write(b,0, len);
        }
        bufferedOutputStream.close();
        bufferedInputStream.close();
        long end = System.currentTimeMillis();
        System.out.println(start-end);
    }
    private static void sort2(File f1, File f2) throws IOException {
        FileReader fileReader = new FileReader(f1);
        StringBuilder sb = new StringBuilder();
        int b;
        while ((b = fileReader.read()) != -1){
            sb.append((char)b);
        }
        fileReader.close();
        Integer[] integers = Arrays.stream(sb.toString().split("-"))
                .map(new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        Integer i = Integer.parseInt(s);
                        return i;
                    }
                })
                .sorted()
                .toArray(new IntFunction<Integer[]>() {
                    @Override
                    public Integer[] apply(int value) {
                        return new Integer[value];
                    }
                });
        System.out.println(Arrays.toString(integers));
        String s = Arrays.toString(integers).replace(", ","-");
        System.out.println(s);
        String s1 = s.substring(1, s.length()-1);
        System.out.println(s1);
        FileWriter fileWriter = new FileWriter(f2);
        fileWriter.write(s1.toString());
        fileWriter.close();
    }
    private static void sort(File f1, File f2) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(f1);
        FileWriter fileWriter = new FileWriter(f2);
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int b;
        while ((b = fileInputStream.read()) != -1){
            sb.append((char)b);
        }
        fileInputStream.close();
        String[] arrStr = sb.toString().split("-");
        for (String s : arrStr) {
            Integer i = Integer.parseInt(s);
            list.add(i);
        }
        Collections.sort(list);
        StringJoiner sj = new StringJoiner("-", "", "");
        for (Integer integer : list) {
            sj.add(integer.toString());
        }
        fileWriter.write(sj.toString());
        fileWriter.close();
    }
    private static void decrypt(File f1, File f2) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(f1);
        FileOutputStream fileOutputStream = new FileOutputStream(f2);
        byte[] b = new byte[1024];
        int len;
        while ((len = fileInputStream.read(b)) != -1){
            for (int i = 0; i < len; i++) {
                b[i]--;
            }
            fileOutputStream.write(b, 0, len);
        }
        fileOutputStream.close();
        fileInputStream.close();
    }
    private static void encryption(File f1, File f2) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(f1);
        FileOutputStream fileOutputStream = new FileOutputStream(f2);
        byte[] b = new byte[1024];
        int len;
        while ((len = fileInputStream.read(b)) != -1){
            for (int i = 0; i < len; i++) {
                b[i]++;
            }
            fileOutputStream.write(b, 0, len);//112
        }
        fileOutputStream.close();
        fileInputStream.close();
    }
}
class Stu implements Serializable{
    private static final long serialVersionUID = -3528227242933676581L;
    public String name;
    public int age;
//    public String address;

    public Stu(){}
    public Stu(String name, int age, String address) {
        this.name = name;
        this.age = age;
//        this.address = address;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
