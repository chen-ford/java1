package test;

public class Cook extends Employee{

    public Cook() {
    }

    public Cook(String id, String name, double salary) {
        super(id, name, salary);
    }

   @Override
    public  void work() {
        System.out.println("厨师正在炒菜");
    }

    public  static String chat(){
        String string="厨师正在聊天";
        return string;
    }
}
