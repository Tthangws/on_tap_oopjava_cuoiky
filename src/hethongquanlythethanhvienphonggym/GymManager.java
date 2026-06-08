package hethongquanlythethanhvienphonggym;

import java.util.HashMap;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/8/2026
 * TIME: 8:42 AM
 */
public class GymManager {
    private HashMap<String,GymMember> memberManager = new HashMap<>();

    //them thanh vien
    public void addMember(GymMember member){
        memberManager.put(member.getMemberId(),member);
        System.out.println("✅ Thêm thành công thành viên: "+member.getMemberName());
    }

    // Xóa thành viên bằng cách nhập Tên
    public void deleteMemberByName(String name) {
        String targetId = null; // Biến tạm để lưu ID của người cần xóa
        GymMember targetMember = null;

        // 1. Duyệt qua toàn bộ danh sách hội viên (dùng vòng lặp cho values)
        for (GymMember member : memberManager.values()) {
            // So sánh tên (dùng equalsIgnoreCase để không phân biệt hoa thường)
            if (member.getMemberName().equalsIgnoreCase(name)) {
                targetId = member.getMemberId();
                targetMember = member;
                break; // Tìm thấy người đầu tiên là dừng vòng lặp ngay
            }
        }

        // 2. Kiểm tra xem có tìm thấy ai không và tiến hành xóa
        if (targetId != null) {
            memberManager.remove(targetId); // Xóa khỏi HashMap bằng ID đã tìm được
            targetMember.deactivateMembership(); // Gọi hàm hủy thẻ
            System.out.println("✅ Đã xóa thành công hội viên tên: " + targetMember.getMemberName());
        } else {
            System.out.println("\n❌ Không tìm thấy hội viên nào có tên là: " + name+" _ để xóa !");
        }
    }

    public void processSubscription(String memberId, int months){
        if(!memberManager.containsKey(memberId)){
            System.out.println("\n❌ Không tồn tại mã thành viên có ID: "+memberId);
        } else {
            GymMember memberTarget = memberManager.get(memberId);
            try{
                System.out.println("\n...Đang xử lý đăng ký cho thành viên có NAME: "+memberTarget.getMemberName());
                memberTarget.activateMembership(months);
                System.out.println("💵 Tổng chi phí: "+memberTarget.calculateTotalFee(months)+" VND");
            } catch(InvalidSubscriptionException e){
                System.out.println("❌ Không thể đăng ký do: "+e.getMessage());
            }
        }
    }
}
