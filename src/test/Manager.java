package test;

public class Manager extends Employee{

    private  double bouns;


    public Manager() {
    }

    public Manager(String id, String name, double salary, double bouns) {
        super(id, name, salary);
        this.bouns = bouns;
    }

    /**
     * 获取
     * @return bouns
     */
    public double getBouns() {
        return bouns;
    }

    /**
     * 设置
     * @param bouns
     */
    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    public String toString() {
        return "Manager{bouns = " + bouns + "}";
    }

    @Override
    public void work() {
        System.out.println("管理员工");
    }
}
