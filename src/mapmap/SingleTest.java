package mapmap;

public class SingleTest {
    public static void main(String[] args) {
        SingleClass s1 = SingleClass.getInstance("zhangshan",14);
        SingleClass s2 = SingleClass.getInstance("lisi",15);
        System.out.println(s1);
        System.out.println(s2);
    }
}
