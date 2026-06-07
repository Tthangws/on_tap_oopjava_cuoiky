package hethongquanlykhacksan;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/7/2026
 * TIME: 7:26 PM
 */
public class SuiteRoom extends Room implements IExtraService{
    public SuiteRoom(String roomId, String roomName, double basePrice) {
        super(roomId, roomName, basePrice);
    }

    @Override
    public double calculateServiceFee(int days) {
        return 500000;
    }

    @Override
    public double calculateTotalCost(int days) {
        return (getBasePrice()*days)+calculateServiceFee(days)*500000;
    }
}
