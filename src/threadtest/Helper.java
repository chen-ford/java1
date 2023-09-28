package threadtest;

public class Helper {
    public void handle(int count,char c){
        System.out.println("    handle("+","+c+") BEGIN");
        for (int i = 0; i < count; i++) {
            slowly();
        }
        System.out.println("");
        System.out.println("    handle("+","+c+") END");
    }

    public void slowly(){
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
