package systemdmeo;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class SystemDemo1 {
    public static void main(String[] args) throws IOException {
/*        long i = System.currentTimeMillis();
        System.out.println(i);
        int year;
        year=(int)i/1000/60/24;

        System.out.println(year);*/
//        程序退出

//        Runtime r=Runtime.getRuntime();
////        r.exit(0);
//        System.out.println(r.maxMemory()/1024/1024/8);
//        Runtime.getRuntime().exec("cmd");

        Date d=new Date();
        System.out.println(d.getTime());//获取电脑时间的毫秒值
//        System.out.println(System.currentTimeMillis());
        SimpleDateFormat sdr=new SimpleDateFormat("yyyy年MM月dd HH:mm:ss");
        String s=sdr.format(d);
        System.out.println(s);

        Calendar ca= Calendar.getInstance();
//        ca.setTime(d);
//        ca.setTimeInMillis(d.getTime());
        System.out.println(ca.get(Calendar.YEAR));
        System.out.println(ca.get(Calendar.MONTH)+1);
        System.out.println(ca.get(Calendar.DAY_OF_MONTH));
//        1.获取所有时区
        Set<String> z=ZoneId.getAvailableZoneIds();
        System.out.println(z);
//        2.获取当前系统时区
        ZoneId zid=ZoneId.systemDefault();
        System.out.println(zid);
//        3.获取指定时区
        ZoneId zid1 = ZoneId.of("America/Cuiaba");
        System.out.println(zid1);

        Instant hs = Instant.ofEpochMilli(d.getTime());
        System.out.println(hs);
    }
}
