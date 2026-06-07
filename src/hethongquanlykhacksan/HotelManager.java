package hethongquanlykhacksan;

import java.util.HashMap;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/7/2026
 * TIME: 7:26 PM
 */
public class HotelManager {
    // ĐÃ SỬA: Thêm private bảo mật dữ liệu
    private HashMap<String, Room> roomManager = new HashMap<>();

    public void addRoom(Room room){
        roomManager.put(room.getRoomId(), room);
        System.out.println("✅ Thêm thành công phòng: " + room.getRoomId());
    }

    // Nghiệp vụ 1: Chỉ xử lý đặt phòng
    public void processBooking(String roomId, int days){
        if(!roomManager.containsKey(roomId)){
            System.out.println("\n❌ Không tìm thấy phòng nào có mã: " + roomId);
            return;
        }

        Room roomTarget = roomManager.get(roomId);
        try {
            System.out.println("\n⏳ Đang tiến hành đặt phòng có mã: " + roomTarget.getRoomId());
            if (roomTarget.getAvailable()) {
                roomTarget.bookRoom(days);
                System.out.println("💵 Tổng tiền phải trả: " + roomTarget.calculateTotalCost(days) + " VNĐ _ Cho: " + days + " Đêm.");
            } else {
                System.out.println("❌ Lỗi: Phòng đã có người ở!");
            }
        } catch (InvalidBookingException e) {
            System.out.println("❌ Không thể đặt phòng do: " + e.getMessage());
        }
    }

    // BỔ SUNG Nghiệp vụ 2: Hàm Trả phòng riêng biệt
    public void checkoutRoom(String roomId) {
        if(roomManager.containsKey(roomId)) {
            Room target = roomManager.get(roomId);
            if (!target.getAvailable()) {
                target.setAvailable(true);
                System.out.println("⏱️ Khách đã trả phòng. Mã phòng " + roomId + " hiện đã trống!");
            } else {
                System.out.println("⚠️ Phòng này vốn dĩ chưa có ai đặt mà!");
            }
        }
    }
}