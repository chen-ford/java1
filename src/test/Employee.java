package test;

public class Employee {
/*    1.类名见名知意
    2.所有成员变量私有化
    3.构造方法（空参、带参数的构造方法）
    4.get/set方法*/

    private String id;
    private  String name;
    private double salary;


    public Employee() {
    }

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * 设置
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Employee{id = " + id + ", name = " + name + ", salary = " + salary + "}";
    }

    public void work(){
        System.out.println("工作");
    }

    public void eat(){
        System.out.println("吃饭");
    }
}
