package Tech_Company_HR_System;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/1/2026
 * TIME: 9:16 PM
 */
public class Main {
    public static void main(String[] args) {
        HRManager hrM = new HRManager();

        try {
            // 1. Thêm nhân viên hợp lệ
            Developer dev1 = new Developer("E01", "Nguyễn Trọng Thắng", 18000000, 30);
            Developer dev2 = new Developer("E04", "Nguyễn Trọng Chiến", 12000000, 5);
            Manager mng1 = new Manager("M02", "Đào Đức Quân", 20000000, 5);

            hrM.addEmployee(dev1);
            hrM.addEmployee(dev2);
            hrM.addEmployee(mng1);

            // 2. Thử thêm một nhân viên bị lỗi (Lương âm)
            System.out.println("Đang thử tuyển dụng Hacker X...");
            Developer hacker = new Developer("E99", "Hacker X", -5000000, 10); // Lương âm!
            hrM.addEmployee(hacker); // Dòng này sẽ không bao giờ chạy tới

        } catch (InvalidSalaryException e) {
            // Bắt chính xác lỗi và in ra bằng System.out để tránh bị lộn xộn dòng
            System.out.println("CẢNH BÁO TỪ HR: " + e.getMessage());
        }

        //sap xep trc khi in
        hrM.sapXepNhanVien();
        // in thông tin tất cả nhân viên
        System.out.println("\n====== THÔNG TIN NHÂN VIÊN ======");
        hrM.displayAllEmployees();

    }
}
