package hethongquanlykhacksan;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/7/2026
 * TIME: 7:25 PM
 */
public class StandardRoom extends Room{
    public StandardRoom(String roomId, String roomName, double basePrice) {
        super(roomId, roomName, basePrice);
    }

    @Override
    public double calculateTotalCost(int days) {
        return getBasePrice()*days;
    }
}
