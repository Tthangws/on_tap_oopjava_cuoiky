package hethongquanlykhacksan;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/7/2026
 * TIME: 8:06 PM
 */
public class Main {
    public static void main(String[] args) {
        HotelManager manager = new HotelManager();

        // 1. Tạo các phòng (Không cần truyền true/false nữa vì mặc định là trống)
        StandardRoom sdr1 = new StandardRoom("NH01", "Hội nghị", 690000);
        StandardRoom sdr2 = new StandardRoom("BH01", "Nghỉ ngơi", 510000);
        SuiteRoom sr1 = new SuiteRoom("KH05", "Tổng thống", 1200000);
        SuiteRoom sr2 = new SuiteRoom("MH07", "Làm đẹp", 900000);

        System.out.println("====== HỆ THỐNG QUẢN LÝ KHÁCH SẠN ======");
        // 2. Thêm phòng vào hệ thống
        manager.addRoom(sdr1);
        manager.addRoom(sdr2);
        manager.addRoom(sr1);
        manager.addRoom(sr2);

        System.out.println("\n====== BẮT ĐẦU XỬ LÝ NGHIỆP VỤ ======");

        // Kịch bản 1: Đặt phòng hợp lệ (Phòng tiêu chuẩn)
        manager.processBooking("NH01", 6);

        // Kịch bản 2: Đặt phòng hợp lệ (Phòng thương gia - Test phí dịch vụ đã được nhân lên theo số ngày)
        // Tiền phòng: 1tr2 * 3 = 3tr6. Phí dịch vụ: 500k * 3 = 1tr5. Tổng: 5tr1
        manager.processBooking("KH05", 3);

        // Kịch bản 3: Cố tình đặt lại phòng NH01 khi đã có người ở
        manager.processBooking("NH01", 2);

        // Kịch bản 4: Nhập số ngày âm để kiểm tra Custom Exception
        manager.processBooking("MH07", -5);

        System.out.println("\n====== XỬ LÝ TRẢ PHÒNG ======");

        // Kịch bản 5: Khách phòng NH01 trả phòng
        manager.checkoutRoom("NH01");

        // Kịch bản 6: Khách mới đến và đặt lại đúng phòng NH01 vừa trống
        manager.processBooking("NH01", 2);
    }
}