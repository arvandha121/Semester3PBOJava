package Praktikum3;

public class PermanentEmployee extends Employee implements Payable{
    private int salary;

    public PermanentEmployee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    @Override
    public int getpaymentAmount() {
        return (int) (salary + 0.05 * salary);
    }
    @Override
    public String getEmployeeInfo(){
        String info = super.getEmployeeInfo();
        info += "\nRegisterd as permanent employee with salary "+salary+"\n";
        return info;
    }
}