import java.awt.*;
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static <E> void printArray(E[] inputArray){
        for(E element : inputArray){
            System.out.printf("%s", element);
        }

        System.out.println();
    }

    public static <T extends Comparable<T>> T maximum(T x, T y, T z){
        T max = x;
        if(y.compareTo(max) > 0){
            max = y;
        }
        if(z.compareTo(max) > 0){
            max = z;
        }

        return max;
    }
    public static void main(String[] args) {
        // printArray
        //Integer[] intArray = {1,2,3,4,5};
        //Double[] doubleArray = {1.1,1.2,1.3,1.4};
        //Character[] charArray = {'H', 'E','L','L','O'};
        //System.out.println("整形数组元素为：");
        //printArray(intArray);
        //System.out.println("\n双精数组元素为：");
        //printArray(doubleArray);
        //System.out.println("\n字符型组元素为：");
        //printArray(charArray);

        //System.out.printf("%d, %d, 和 %d, 中最大的数为 %d, \n\n", 3,4,5,maximum(3,4,5));
        //System.out.printf("%.1f, %.1f, 和 %.1f, 中最大的数为 %.1f, \n\n", 3.1,4.1,5.1,maximum(3.1,4.2,5.3));
        //System.out.printf("%s, %s, 和 %s, 中最大的数为 %s, \n\n", "pear","apple","orange",maximum("pear","apple","orange"));
        //long nd = 1000 * 24 * 60 * 60;
        //long nh = 1000 * 60 * 60;
        //long nm = 1000 * 60;
        //Date startTime = StrToDate("2018-10-21 10:41:43");
        //Date endTime = StrToDate("2018-10-21 19:42:44");
        //long diff = endTime.getTime() - startTime.getTime();
        //long day = diff / nd;
        //// 计算差多少小时
        //long hour = diff % nd / nh;
        //// 计算差多少分钟
        //long min = diff % nd % nh / nm;
        //// 计算差多少秒//输出结果
        //// long sec = diff % nd % nh % nm / ns;
        //System.out.printf(day + "天" + hour + "小时" + min + "分钟");
        //List<String> list = Arrays.asList("aaa","bbb","ccc","ddd","eee","fff","ggg","xxx","yyy","zzz");
        //List<String> temp = list.stream().skip(8).limit(10).collect(Collectors.toList());
        //temp.forEach(item -> {
        //    System.out.println(item);
        //});
        //String str = "12a";
        //String str1 = "12";
        //System.out.println(str.matches("^\\d+$"));
        //System.out.println(str1.matches("^\\d+$"));
        //List<User> list = new ArrayList<>();
        //for (int i = 0; i< 10; i++){
        //    User item = new User();
        //    item.setId(i);
        //    item.setName("name" + i);
        //    list.add(item);
        //}
        //
        //List<User> uList = new ArrayList<>();
        //for (int i = 15; i< 20; i++){
        //    User item = new User();
        //    item.setId(i);
        //    item.setName("name" + i);
        //    uList.add(item);
        //}
        //
        //list.addAll(uList);

        //DesktopThread desktopThread = new DesktopThread("www.autohome.com.cn");
        //Thread t1 = new Thread(desktopThread);
        //t1.start();
        //System.out.println(1);

        //System.out.println(ByteTest((byte)1));
        //System.out.println(ByteTest((byte)2));

        //// cartlist.stream().filter(item -> item.getProductId().equals(1L)).findFirst();
        //Optional<User> user = list.stream().filter(u -> u.getId() == 3).findFirst();
        //if (user.isPresent()) {
        //    // 存在
        //    User cart =  user.get();
        //    List<User> temp = list.subList(list.indexOf(cart) + 1, list.size());
        //    System.out.println(1);
        //} else {
        //    // 不存在
        //}

        //try { // 防止文件建立或读取失败，用catch捕捉错误并打印，也可以throw
        //
        //    /* 读入TXT文件 */
        //    String pathname = "F:\\版本迭代\\small_video_version\\1月\\uid.txt"; // 绝对路径或相对路径都可以，这里是绝对路径，写入文件时演示相对路径
        //    File filename = new File(pathname); // 要读取以上路径的input。txt文件
        //    InputStreamReader reader = new InputStreamReader(
        //            new FileInputStream(filename)); // 建立一个输入流对象reader
        //    BufferedReader br = new BufferedReader(reader); // 建立一个对象，它把文件内容转成计算机能读懂的语言
        //    String line = "";
        //    String sql = "";
        //    while (br.readLine() != null) {
        //        line = "INSERT INTO [dbo].[user_robot] values(" +  br.readLine() + ",GETDATE(),GETDATE());"+"\r\n"; // 一次读入一行数据
        //        Write2(line);
        //        sql += line;
        //    }
        //    Write(sql);
        //} catch (Exception e) {
        //    e.printStackTrace();
        //}
        //
        //System.out.println("1");

        //for(Short i = 1; i < 3; i++ ) {
        //    System.out.println(i);
        //}

        // System.out.println(TimeReduceHour());

        //Integer id = 243235100;
        //String idString = String.valueOf(id);
        //Integer count = Integer.parseInt(idString.substring(idString.length() - 2));
        //System.out.println(count);

        //for(int i=0; i<2000; i++){
        //    System.out.println(getRandom(0,2));
        //}

        //double asd=3.15151;
        //int d = (int)asd;
        //System.out.println(d);
        //Date date = new Date();
        //Calendar calendar = Calendar.getInstance();
        //calendar.setTime(date);
        //calendar.add(Calendar.HOUR, 24);
        //Date dateTemp = calendar.getTime();
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //String dsawq = sdf.format(dateTemp);
        //System.out.println(dsawq);
        //try {
        //    Date dateD = sdf.parse(dsawq);
        //    Date dateB = new Date();
        //    System.out.println(dateD);
        //}
        //catch(ParseException e){
        //
        //}

        //int count = 134;
        //int totalCount = 2323152;
        //String result = "returncode:0, 请求成功。";
        //String result1 = "returncode:0, 请求成功。";
        //User user = new User();
        //user.setId(1);
        //user.setName("das大叔大婶大所");
        //String format = String.format("总共[%d]条数据[%d]条数据,处理结果%s,时间为%tc     %s",count, totalCount, result, new Date(), user.toString());
        //if(count == 134 && result.equals(result1)) {
        //    System.out.println(format);
        //}
        //
        //long startTime = System.currentTimeMillis();
        //try {
        //    Thread.sleep(1000);
        //}catch(InterruptedException e){}
        //long endTime = System.currentTimeMillis();
        //float seconds = (endTime - startTime) / 1000F;
        //System.out.println("Cost seconds" + Float.toString(seconds));

        //Integer dasdas = 10;
        //if(dasdas > 9){
        //    System.out.println("1");
        //}
        //
        //if(dasdas < 12){
        //    System.out.println("2");
        //}

        int das= 13 / 3;
        Integer count= null;
        if(count  == null ){
            System.out.println(count);
        }
        count = 123;

        System.out.println(count);

        System.out.println("OK");
    }

    public static Integer getRandom(int min, int max){
        Random random = new Random();
        Integer s = random.nextInt(max) % (max - min + 1) + min;
        return s;
    }

    public static String TimeReduceHour(){
        Date date = new Date();//获取当前时间    
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR, -24);
        calendar.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(calendar.getTime());
    }

    public static Date StrToDate(String str) {

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = format.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date;
    }

    public static void Write(String line){
        try { // 防止文件建立或读取失败，用catch捕捉错误并打印，也可以throw
            /* 写入Txt文件 */
            File writename = new File("F:\\版本迭代\\small_video_version\\1月\\output.txt"); // 相对路径，如果没有则要建立一个新的output。txt文件
            writename.createNewFile(); // 创建新文件
            BufferedWriter out = new BufferedWriter(new FileWriter(writename));
            out.write(line); // \r\n即为换行
            out.flush(); // 把缓存区内容压入文件
            out.close(); // 最后记得关闭文件
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Write2(String line){
        String file = "F:\\版本迭代\\small_video_version\\1月\\output2.txt";
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(file, true)));
            out.write(line);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static byte ByteTest(byte type) {

        if(type == 1) {
            return type;
        }else{
            return 2;
        }
    }
}

class User{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class DesktopThread implements Runnable {
    private String site;

    public DesktopThread(String site) {
        this.site = site;
    }

    public void run() {
        try {
            Thread.sleep(5000);
            Desktop desktop = Desktop.getDesktop();
            if (desktop.isDesktopSupported()
                    && desktop.isSupported(Desktop.Action.BROWSE)) {
                URI uri = new URI(site);
                desktop.browse(uri);
            }
        } catch (IOException ex) {
            System.out.println(ex);
        } catch (URISyntaxException ex) {
            System.out.println(ex);
        }
        catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }
}