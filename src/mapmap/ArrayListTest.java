package mapmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class ArrayListTest {
    public static void main(String[] args) {
        //创建集合
        ArrayList<Integer> list=new ArrayList<>();
        //添加整数
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);
        System.out.println(list);
        //过滤奇数，返回偶数
        List<Integer> list1 = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        System.out.println(list1);

    }
}
