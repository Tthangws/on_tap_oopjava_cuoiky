package hethongquanlythethanhvienphonggym;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/8/2026
 * TIME: 8:41 AM
 */
public class BasicMember extends GymMember{
    public BasicMember(String memberId, String memberName, double baseFee) {
        super(memberId, memberName, baseFee);
    }

    @Override
    public double calculateTotalFee(int months){
        return getBaseFee() * months;
    }
}
