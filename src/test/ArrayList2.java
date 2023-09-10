package test;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
//        1.创建集合
        ArrayList<Student> list=new ArrayList<>();
//        2.创建学生对象
        Student s1=new Student("zhangsan",14);
        Student s2=new Student("lisi",15);
        Student s3=new Student("wangwu",16);
//        3.添加元素
        list.add(s1);
        list.add(s2);
        list.add(s3);
//        4.遍历元素
        for (int i = 0; i < list.size(); i++) {
            Student temp=list.get(i);
            System.out.println(temp.toString());

        }
        System.out.println(list);


    }
}
