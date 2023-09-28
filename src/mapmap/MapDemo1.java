package mapmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {
    public static void main(String[] args) {
//        1.创建map对象
        Map<String,String> map=new HashMap<>();
//        2.添加元素
        map.put("firsr","me");
        map.put("second","you");
        map.put("third","them");
//        3.通过键找值
        Set<String> keys = map.keySet();
//        增强for
//        for (String key : keys) {
//            String value = map.get(key);
//            System.out.println(key+"="+value);
//        }
//        lambda表达式
/*        keys.forEach((String key)->{String value = map.get(key);
            System.out.println(key+"="+value);});*/
//        迭代器方式
/*        Iterator<String> it = keys.iterator();
        while (it.hasNext()){
            String next = it.next();
            String s = map.get(next);
            System.out.println(next+"="+s);
        }*/

        Set<Map.Entry<String, String>> entries = map.entrySet();


    }
}
