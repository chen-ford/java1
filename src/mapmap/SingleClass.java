package mapmap;

import java.io.Serial;
import java.io.Serializable;

public class SingleClass implements Serializable {
    @Serial
    private static final long serialVersionUID = 7699978158083218597L;//版本号
    private static SingleClass instance;
    private String name;
    private int age;

    private SingleClass() {
    }

    public SingleClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public SingleClass(SingleClass instance, String name, int age) {
        this.instance = instance;
        this.name = name;
        this.age = age;
    }

    /**
     * 设置
     * @param instance
     */
    public static void setInstance(SingleClass instance) {
        SingleClass.instance = instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static SingleClass getInstance(String name,int age){
        if (instance==null){
            instance=new SingleClass(name,age);
        }

        return instance;
    }


    public String toString() {
        return "SingleClass{instance = " + ", name = " + name + ", age = " + age + "}";
    }
}
