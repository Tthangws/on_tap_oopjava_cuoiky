package Tech_Company_HR_System;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/1/2026
 * TIME: 8:34 PM
 */
public class Manager extends Employee implements ITaxable{
    private int teamSize;
    public Manager(String empId, String fullName, double baseSalary, int teamSize){
        super(empId, fullName, baseSalary);
        this.teamSize = teamSize;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (teamSize * 500000);
    }

    @Override
    public double calculateTax() {
        if(calculateSalary() > 15000000){
            return (calculateSalary() - 15000000) * 0.1;
        }
        return 0;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Team Size: "+teamSize+"|| Salary: "+calculateSalary()+"|| Tax: "+calculateTax());
    }
}
