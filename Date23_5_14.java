package myPackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Date23_5_14 {
    public static void main(String[] args) throws ParseException {
        String str = "java1awdnanwdadlJava22";
//        Pattern p = Pattern.compile("((?i)Java)\\d+");
//        Pattern p = Pattern.compile("Java\\d+");
//        Pattern p = Pattern.compile("((?i)java)(?=1|22)");
//        Pattern p = Pattern.compile("((?i)java)(?:1|22)");
//        Pattern p = Pattern.compile("((?i)java)(?!22)");
//
//        Matcher m = p.matcher(str);
//        while(m.find()){
//            System.out.println(m.group());
//        }
//        String str2 = "abbbbbbbbbbbbbbaaa";
////        Pattern p1 = Pattern.compile("ab+");
//        Pattern p1 = Pattern.compile("ab+?");
//
//        Matcher m1 = p1.matcher(str2);
//        while(m1.find()){
//            System.out.println(m1.group());
//        }
//        String str4 = "abcawddadaabc";
//        String str3 = "aaawdawdadasfsaaa";
////        System.out.println(str4.matches("(.{3}).+\\1"));
//        System.out.println(str3.matches("((.)\\2+).+\\1"));
//        SimpleDateFormat f1 = new SimpleDateFormat();
//        Date d = new Date();
//        String format = f1.format(d);
//        System.out.println(format);
//        SimpleDateFormat f2 = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss EE");
//        String format1 = f2.format(d);
//        System.out.println(format1);
//        String str1 = "1111-11-11 10:1:1";
//        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date rse = f.parse(str1);
//        System.out.println(rse);
        /*Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(availableZoneIds.size());
        System.out.println(availableZoneIds);
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);
        ZoneId of = ZoneId.of("Asia/Aden");
        System.out.println(of);*/
        Instant now = Instant.now();
        System.out.println(now);
        Instant instant1 = Instant.ofEpochMilli(0L);
        System.out.println(instant1);
        Instant instant2 = Instant.ofEpochSecond(1L);
        System.out.println(instant2);
        Instant instant3 = Instant.ofEpochSecond(1L, 1L);
        System.out.println(instant3 );
    }
}
