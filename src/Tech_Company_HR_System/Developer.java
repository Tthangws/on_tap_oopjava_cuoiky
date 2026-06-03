package Tech_Company_HR_System;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/1/2026
 * TIME: 8:34 PM
 */
public class Developer extends Employee implements ITaxable{
    private int overtimeHours;
    public Developer(String empId, String fullName, double baseSalary, int overtimeHours){
        super(empId, fullName, baseSalary);
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (overtimeHours * 200000) ;
    }

    @Override
    public double calculateTax() {
        if(calculateSalary() > 15000000){
            return (calculateSalary() - 15000000) * 0.1;
        }
        return 0;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("OverTimeHours: "+overtimeHours+" || salary: "+calculateSalary()+"|| Tax: "+calculateTax());
    }
}
