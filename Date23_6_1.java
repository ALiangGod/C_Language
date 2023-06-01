import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Date23_6_1 {
    public static void main(String[] args) throws IOException {
        /*String str = "E:\\a\\aa.txt";
        File f1 = new File(str);
        String str2 = "E:\\a\\a";

        File f2 = new File(str2);
        System.out.println(f2.isDirectory());
        System.out.println(f1.isDirectory());
        System.out.println(f1.length());
        System.out.println(f1.getAbsoluteFile());*/
        /*String str = "E:\\a\\aa.txt";
        File f1 = new File(str);
        long l = f1.lastModified();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:MM:SS");
        System.out.println(sdf.format(l));*/
        /*String str = "E:\\a";
        File f1 = new File(str);
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
        System.out.println();*/
//        File[] files = File.listRoots();
       /* for (File file : files) {
            System.out.println(file);
        }*/
        /*Arrays.stream(files).forEach(s-> System.out.println(s));
        File f = new File("E:\\a");
        String[] list = f.list();
        Arrays.stream(list).forEach(s -> System.out.println(s));
        System.out.println("==================");
        Arrays.stream(f.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".txt");
            }
        })).forEach(s -> System.out.println(s));
        System.out.println("==================");
        Arrays.stream(f.listFiles()).filter(s->s.getName().endsWith(".txt")).forEach(s-> System.out.println(s));
    }
}*/


//        File f1 = new File("E:\\a");
//        System.out.println(f1.createNewFile());
//        System.out.println(isAVI("E:\\a"));
//        System.out.println(isAVI("E:\\a"));
//        Arrays.stream((new File("E:\\a")).listFiles()).forEach(s-> System.out.println(s));
        /*File f = new File("E:\\a");
        File[] files = f.listFiles();
        for (File file : files) {

            System.out.println(file.getPath());
        }*/
//    File f = new File("E:\\a");
//    countFiles(f);

//        System.out.println(countFilesB(f));
//        HashMap<String, Integer> stringIntegerHashMap = countF(f);
//        stringIntegerHashMap.forEach((s, value) -> System.out.println(s + "=" + value));
        FileOutputStream fileInputStream = new FileOutputStream("E:\\a\\a.txt");
        fileInputStream.write(71);
        fileInputStream.close();

    }

    private static HashMap<String, Integer> countF(File f) {
        HashMap<String, Integer> hm = new HashMap<>();
        File[] files = f.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                String[] split = file.getName().split("\\.");
                if (split.length >= 2) {
                    if (hm.containsKey(split[split.length-1])){
                        Integer integer = hm.get(split[split.length - 1]);
                        integer++;
                        hm.put(split[split.length-1], integer);
                    }else {
                        hm.put(split[split.length-1], 1);
                    }
                }
            }
            if (file.isDirectory()){
                HashMap<String, Integer> sonMap = countF(file);
                Set<Map.Entry<String, Integer>> entries = sonMap.entrySet();
                for (Map.Entry<String, Integer> entry : entries) {
                    String key = entry.getKey();
                    int value = entry.getValue();
                    if (hm.containsKey(key)){
                        int count = hm.get(key);
                        count += value;
                        hm.put(key, count);
                    }else{
                        hm.put(key, value);
                    }
                }
            }
        }
        return hm;
    }


    private static void countFiles(File f) {
        int DirectoryCount = 0;
        int docx = 0;
        int txt = 0;
        int avi = 0;
        File[] files = f.listFiles();
        for (File file : files) {
            if (file.isDirectory())
                DirectoryCount++;
            if (file.isFile() && file.getPath().endsWith(".txt"))
                txt++;
            if (file.isFile() && file.getPath().endsWith(".avi"))
                avi++;
            if (file.isFile() && file.getPath().endsWith(".docx"))
                docx++;
        }
        System.out.println("文件有:" + DirectoryCount + "\ntxt文件有:" + txt + "\navi文件有:" + avi + "\ndocx文件有：" + docx);
    }


    private static long countFilesB(File f){
        long byt = 0;
        File[] files = f.listFiles();
        for (File file : files) {
            if (file.isFile())
                byt += file.length();
            if (file.isDirectory()){
                byt += countFilesB(file);
            }
        }
        return byt;
    }








    private static boolean isAVI(String str){
        boolean key = false;
        File f = new File(str);
        File[] filesAll = f.listFiles();
        for (File file : filesAll) {
            if (file.isDirectory())
                key = isAVI(file.getPath());
        }
        File[] files = f.listFiles(pathname -> pathname.isFile() && pathname.getName().endsWith(".avi"));
        if (files.length!=0 || key){
            return true;
        }else
            return false;

    }
}
