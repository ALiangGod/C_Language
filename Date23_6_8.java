import java.io.*;
import java.lang.reflect.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Date23_6_8 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        /*ServerSocket ss = new ServerSocket(10000);
        Socket socket = ss.accept();
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        UUID uuid = UUID.randomUUID();
        String name = uuid.toString().replace("-", "");
        System.out.println(name);
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\a\\" + name + ".jpg"));
        int b;
        while ((b = bis.read()) != -1){
            bos.write(b);

        }
        bos.close();
        socket.close();
        ss.close();*/
        /*ThreadPoolExecutor pool = new ThreadPoolExecutor(
                2,
                6,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(2),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );
        ServerSocket ss = new ServerSocket(10000);
        while (true){
            Socket socket = ss.accept();
//            new Thread(new MyRunable(socket)).start();
            pool.submit(new MyRunable(socket));
        }*/
        /*Class students = Class.forName("Students");
        System.out.println(students);
        Class studentsClass = Students.class;
        System.out.println(studentsClass);
        Students s = new Students();
        Class aClass = s.getClass();
        System.out.println(aClass);*/
//        Class cs = Class.forName("Students");
//        Constructor[] constructors1 = cs.getConstructors();
//        for (Constructor constructor : constructors1) {
//            System.out.println(constructor);
//        }
//        Constructor[] declaredConstructors = cs.getDeclaredConstructors();
//        for (Constructor declaredConstructor : declaredConstructors) {
//            System.out.println(declaredConstructor);
//        }
       /* Constructor c = cs.getConstructor();
        System.out.println(c);
        Constructor c2 = cs.getDeclaredConstructor(String.class);
        System.out.println(c2);
        //获得权限
        int modifiers = c.getModifiers();
        System.out.println(modifiers);
        //获得方法参数
        Parameter[] parameters = c2.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }
        //临时修改方法权限
        c2.setAccessible(true);
        Students zhang = (Students) c2.newInstance("zhang");
        System.out.println(zhang);*/
//        Class clazz = Class.forName("Students");
        /*Field[] fields = clazz.getFields();
        Arrays.stream(fields).forEach(s-> System.out.println(s));
        Field[] declaredFields = clazz.getDeclaredFields();
        Arrays.stream(declaredFields).forEach(s-> System.out.println(s));*/
        /*Field age = clazz.getDeclaredField("age");
        int modifiers = age.getModifiers();
        System.out.println(modifiers);
        String name = age.getName();
        System.out.println(name);
        Class type = age.getType();
        System.out.println(type);
        Students zhang = new Students("zhang", 11);
        age.setAccessible(true);
        Object o = age.get(zhang);
        System.out.println(o);
        age.set(zhang, 111);
        System.out.println(zhang);*/

//        Class clazz = Class.forName("Students");
        //获取方法 包括父类
       /* Method[] methods = clazz.getMethods();
        Arrays.stream(methods).forEach(s-> System.out.println(s));
        //课获取私有 不能获取父类
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Arrays.stream(declaredMethods).forEach(s-> System.out.println(s));*/

       /* Method method = clazz.getDeclaredMethod("eat", String.class);
        System.out.println(method);
        int modifiers = method.getModifiers();
        String name = method.getName();
        int parameterCount = method.getParameterCount();
        Class<?>[] parameterTypes = method.getParameterTypes();
        Parameter[] parameters = method.getParameters();
        Arrays.stream(parameters).forEach(s-> System.out.println(s));

        method.setAccessible(true);
        Students zhang = new Students("zhang", 11);
        String str = (String) method.invoke(zhang, "汉堡包");
        System.out.println(str);*/
        /*Students s1 = new Students("ZhangSan", 11);
        Students s2 = new Students("王五", 11);
//        getClasstoFile(s2);
        Teacher 李老 = new Teacher("李老", 11);
        getClasstoFile(李老);*/
        /*Properties prp = new Properties();
        FileInputStream fis = new FileInputStream("E:\\a\\config.properties");
        prp.load(fis);
        String name = (String) prp.get("classname");
        String method = (String)prp.get("method");
        fis.close();
        Class clazz = Class.forName(name);
        Constructor con = clazz.getDeclaredConstructor();
        Object o = con.newInstance();*/
//        Method method1 = clazz.getDeclaredMethod(method);
//        method1.setAccessible(true);
//        method1.invoke(o);
        BigStar jiGe = new BigStar("鸡哥");
        Star proxy = ProxyUtil.createProxy(jiGe);
        proxy.sing("懒洋洋");
        proxy.dance();
    }
    private static void getClasstoFile(Object obj) throws IOException, IllegalAccessException {
        Class clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\a\\reflex.txt", true));
//        Arrays.stream(declaredFields).forEach(s-> System.out.println(s));
        for (Field filed : fields) {
            filed.setAccessible(true);
            String attribute = filed.getName();
            Object o = filed.get(obj);
            System.out.println(attribute + "=" + o);
            bw.write(attribute + "=" + o);
            bw.newLine();
        }
        bw.close();
    }
}
class MyRunable implements Runnable{
    Socket socket;
    public MyRunable(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
            UUID uuid = UUID.randomUUID();
            String name = uuid.toString().replace("-", "");
            System.out.println(name);
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\a\\" + name + ".jpg"));
            int b;
            while ((b = bis.read()) != -1) {
                bos.write(b);

            }
            bos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
