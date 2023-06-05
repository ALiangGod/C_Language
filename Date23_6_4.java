import org.apache.commons.io.FileUtils;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Date23_6_4 {
    public static void main(String[] args) throws IOException {
        /*File f1 = new File("E:\\a\\a");
        File f2 = new File("E:\\a\\");
//        toZip(f1, f2);
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(f2, f1.getName() + ".zip")));

        toZipDir(f1,zos, f1.getName());
        zos.close();*/
        /*File f1 = new File("E:\\a\\a.txt");
        File f2 = new File("E:\\a\\g.txt");

        FileUtils.copyFile(f1, f2);*/
        String familyNameHtml = "https://hanyu.baidu.com/s?wd=%E7%99%BE%E5%AE%B6%E5%A7%93&from=poem";
        String boyNameHtml = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameHtml = "http://www.haoming8.cn/baobao/7641.html";
        String familyName = getString(familyNameHtml);
        String boyName = getString(boyNameHtml);
        String grilName = getString(girlNameHtml);
        ArrayList<String> name = getName(familyName, "(.{4})(，|。)", 1);

        ArrayList<String> bName = getName(boyName, "([\\u4E00-\\u9FA5]{2})(、|。)", 1);

        ArrayList<String> giname = getName(grilName, "(.. ){4}..", 0);

        ArrayList<String> nameList = new ArrayList<>();
        for (String s : name) {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                nameList.add(c + "");
            }
        }

        ArrayList<String> boyNameList = new ArrayList<>();
        for (String s : bName) {
            if (!boyNameList.contains(s)){
                boyNameList.add(s);
            }
        }
        ArrayList<String> grilNameList = new ArrayList<>();
        for (String s : giname) {
            Collections.addAll(grilNameList, s.split(" "));
        }
        ArrayList<String> allList = getShufName(nameList, grilNameList, boyNameList, 3, 3);
        Collections.shuffle(allList);
        BufferedWriter fos = new BufferedWriter(new FileWriter("E:\\a\\name.txt"));
        for (String s : allList) {
            fos.write(s);
            fos.newLine();
        }
        fos.close();
    }

    private static ArrayList<String> getShufName(ArrayList<String> nameList, ArrayList<String> grilNameList, ArrayList<String> boyNameList, int i, int i1) {
        HashSet<String> hs = new HashSet<>();
        while (true){
            if (hs.size() == i)
                break;
            Collections.shuffle(nameList);
            Collections.shuffle(boyNameList);
            hs.add(nameList.get(0)+boyNameList.get(0));
        }
        HashSet<String> hs1 = new HashSet<>();
        while (true){
            if (hs1.size() == i1)
                break;
            Collections.shuffle(nameList);
            Collections.shuffle(grilNameList);
            hs1.add(nameList.get(0)+grilNameList.get(0));
        }
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (String h : hs) {
            int temp = r.nextInt(10) + 18;
            list.add(h + "-男-" + temp);
        }
        for (String s : hs1) {
            int temp = r.nextInt(10) + 18;
            list.add(s + "-女-" + temp);
        }
        return list;
    }

    private static ArrayList<String> getName(String str, String regex, int index){
        ArrayList<String> list = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            list.add(matcher.group(index));

        }
        return list;
    }
    private static String getString(String net) throws IOException {
        StringBuilder sb = new StringBuilder();
        URL url = new URL(net);
        URLConnection conn = url.openConnection();
        InputStreamReader isr = new InputStreamReader(conn.getInputStream());
        int ch;
        while ((ch = isr.read()) != -1){
            sb.append((char)ch);
        }
        isr.close();
        return sb.toString();
    }


    private static void toZipDir(File f1,ZipOutputStream zos, String name) throws IOException {
        if (f1.isFile())
            return;

       File[] files = f1.listFiles();
        for (File file : files) {
            if (file.isDirectory()){
                toZipDir(file,zos, name+"\\"+file.getName());
            }else{
                ZipEntry z = new ZipEntry(name+"\\"+file.getName());
                zos.putNextEntry(z);
                FileInputStream fileInputStream = new FileInputStream(file);
                int b;
                while ((b = fileInputStream.read()) != -1){
                    zos.write(b);
                }
                fileInputStream.close();
                zos.closeEntry();
            }
        }
    }
    private static void toZip(File f1 , File f2) throws IOException {
        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(new File(f2, "b.zip")));
        ZipEntry z = new ZipEntry("b.txt");
        zipOutputStream.putNextEntry(z);
        FileInputStream fileInputStream = new FileInputStream(f1);
        int b;
        while ((b = fileInputStream.read()) != -1){
            zipOutputStream.write(b);
        }
        fileInputStream.close();
        zipOutputStream.closeEntry();
        zipOutputStream.close();
    }
}
