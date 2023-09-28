package abstractTest;

public class Student implements Method2{

    @Override
    public void study() {
        System.out.println("正在学习");
    }

    @Override
    public void work() {
        System.out.println("正在工作");
    }
}
