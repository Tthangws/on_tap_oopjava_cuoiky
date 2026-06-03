package Tech_Company_HR_System;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/1/2026
 * TIME: 8:33 PM
 */
public abstract class Employee {
    private String empId;
    private String fullName;
    private double baseSalary;

    //constructer
    Employee(String empId, String fullName, double baseSalary) throws InvalidSalaryException{
        this.empId = empId;
        this.fullName = fullName;
        if(baseSalary < 0){
            throw new InvalidSalaryException("\nTiền lương cơ bản không hợp lệ ở nhân viên: " + fullName);
        }
        this.baseSalary = baseSalary; // Vượt qua bài test thì mới gán
    }

    //getter
    public double getBaseSalary(){
        return baseSalary;
    }
    public String getFullName(){
        return fullName;
    }

    // phuong thuc truu tuong
    public abstract double calculateSalary();
    public void displayInfo(){
        System.out.println("ID: "+empId+" || FullName: "+fullName+" || Base Salary: "+baseSalary);

    }

}
