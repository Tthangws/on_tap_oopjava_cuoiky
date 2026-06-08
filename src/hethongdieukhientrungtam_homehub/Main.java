package hethongdieukhientrungtam_homehub;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/8/2026
 * TIME: 11:27 AM
 */
public class Main {
    public static void main(String[] args) {
        HomeHubManager hhm = new HomeHubManager();

        // 1. Tạo thiết bị
        SmartLight sl1 = new SmartLight("SL01", "Đèn phòng khách", 20);
        SmartLight sl2 = new SmartLight("SL02", "Đèn phòng ngủ", 10);
        SmartAC sa1 = new SmartAC("SA01", "Điều hòa phòng khách", 60);
        SmartAC sa2 = new SmartAC("SA02", "Điều hòa cho cún", 45);

        System.out.println("====== KHỞI ĐỘNG HỆ THỐNG ======");
        hhm.addDevice(sl1);
        hhm.addDevice(sl2);
        hhm.addDevice(sa1);
        hhm.addDevice(sa2);

        System.out.println("\n====== BẬT THIẾT BỊ ======");
        sl1.turnOn();
        sl2.turnOn();
        sa1.turnOn();
        sa2.turnOn();

        System.out.println("\n====== TEST CÀI ĐẶT HỢP LỆ ======");
        // Gọi chung 1 hàm duy nhất từ Manager
        hhm.changeDeviceSetting("SL01", 80); // Đèn tự hiểu là độ sáng 80
        hhm.changeDeviceSetting("SA01", 24); // Điều hòa tự hiểu là 24 độ

        System.out.println("\n====== TEST BẮT LỖI TỰ ĐỘNG ======");
        hhm.changeDeviceSetting("SL02", -50); // Ném lỗi độ sáng nhưng bị Manager chặn lại
        hhm.changeDeviceSetting("SA02", 10);  // Ném lỗi nhiệt độ nhưng bị Manager chặn lại
        hhm.changeDeviceSetting("XYZ99", 50); // Cố tình nhập sai mã thiết bị

        System.out.println("\n====== TẮT THIẾT BỊ ======");
        sl1.turnOff();
        sa2.turnOff();

        hhm.inTT();
        hhm.calculateTotalDailyEnergy(8); // Chạy trọn vẹn 8 tiếng mà không bị lỗi cản trở
    }
}
