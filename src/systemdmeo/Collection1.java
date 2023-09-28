package systemdmeo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection1<S> {
//    String[] list={"你","好","！","hello","world","！"};
public static void main(String[] args) {
    Collection<String> coll=new ArrayList<String>();
    coll.add("你");
    coll.add("好");
    coll.add("！");

    Iterator<String> it= coll.iterator();

    while (it.hasNext()){
        String str=it.next();
        System.out.print(str);
    }
}

}
