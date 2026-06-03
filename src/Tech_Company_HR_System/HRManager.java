package Tech_Company_HR_System;

import java.util.ArrayList;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/1/2026
 * TIME: 8:34 PM
 */
public class HRManager {
    private ArrayList <Employee> employeeManager = new ArrayList<>();
     //chuc nang
    public void addEmployee(Employee emp){
        employeeManager.add(emp);
        System.out.println("Đã thêm thành công nhân viên: "+emp.getFullName());
    }
    public void displayAllEmployees(){
        for(Employee i : employeeManager){
            i.displayInfo();
        }
    }
    //thuat toan sap xep
    public void sapXepNhanVien() {
        int n = employeeManager.size();

        for (int i = 0; i < n - 1; i++) {
            // SỬA LỖI VÀ TỐI ƯU Ở ĐÂY: j < n - 1 - i
            for (int j = 0; j < n - 1 - i; j++) {

                // So sánh lương (Tách biến ra cho dễ đọc - Clean Code)
                double salaryCurrent = employeeManager.get(j).calculateSalary();
                double salaryNext = employeeManager.get(j + 1).calculateSalary();

                if (salaryCurrent < salaryNext) { // Nhỏ hơn thì đổi chỗ (Sắp xếp giảm dần)
                    // Logic Swap chuẩn xác của em
                    Employee temp = employeeManager.get(j);
                    employeeManager.set(j, employeeManager.get(j + 1));
                    employeeManager.set(j + 1, temp);
                }
            }
        }
        System.out.println("Đã sắp xếp danh sách nhân viên theo lương giảm dần (Dùng Bubble Sort)!");
    }
}
