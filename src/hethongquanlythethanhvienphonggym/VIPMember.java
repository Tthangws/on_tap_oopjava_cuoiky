package hethongquanlythethanhvienphonggym;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/8/2026
 * TIME: 8:41 AM
 */
public class VIPMember extends GymMember implements IPromotion{
    public VIPMember(String memberId, String memberName, double baseFee) {
        super(memberId, memberName, baseFee);
    }

    @Override
    public double calculateDiscount(int months, double totalCost) {
        if(months >= 6){
            return totalCost * 0.15;
        }
        return 0;
    }

    @Override
    public double calculateTotalFee(int months) {
        return (getBaseFee() * months) - calculateDiscount(months,getBaseFee()*months);
    }

}
