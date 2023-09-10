package test;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
//        ArrayList<String> list=new ArrayList<String>();//JDK7
//        1.创建一个集合
        ArrayList<String> list=new ArrayList<>();
//        2.添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
//        3.移除元素
//        list.remove("aaa");
//        System.out.println(list.remove(0));
//        4.改变元素
        list.set(1,"ddd");
//        5.查找元素
       String result= list.get(2);
        System.out.println(result);
//        6.集合大小
        System.out.println("集合长度size");
        System.out.println(list.size());
    }
}
