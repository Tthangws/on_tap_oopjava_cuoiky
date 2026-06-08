package hethongquanlythethanhvienphonggym;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/8/2026
 * TIME: 8:41 AM
 */
public abstract class GymMember {
    private String memberId;
    private String memberName;
    private double baseFee;
    private boolean isActive;

    //constructor
    public GymMember(String memberId, String memberName, double baseFee){
        this.memberId = memberId;
        this.memberName = memberName;
        this.baseFee = baseFee;
        this.isActive = false;
    }
    //getter setter
    public double getBaseFee(){
        return baseFee;
    }

    public String getMemberId(){
        return memberId;
    }

    public String getMemberName(){
        return memberName;
    }

    protected void setActive(boolean status){
        this.isActive = status;
    }

    public void activateMembership(int months){// Không cần throws nữa vì là RuntimeException
        if(months <= 0){
            throw new InvalidSubscriptionException("Số tháng không hợp lệ !");
        }
        else {
            setActive(true);
            System.out.println("✅ Đăng ký thành công !");//- Tính tổng tiền hội viên phải trả.
        }
    }

    // BỔ SUNG: Viết riêng một hàm công khai để hủy thẻ, bảo mật tuyệt đối biến isActive
    public void deactivateMembership() {
        setActive(false);
        System.out.println("\n⚠️ Thẻ của " + this.memberName + " đã bị vô hiệu hóa.");
    }

    public abstract double calculateTotalFee(int months);
}
