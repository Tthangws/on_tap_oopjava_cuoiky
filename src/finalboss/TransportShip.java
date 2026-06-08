package finalboss;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/9/2026
 * TIME: 12:28 AM
 */
public class TransportShip extends Spacecraft{
    public TransportShip(String shipId, String shipName) {
        super(shipId, shipName);
    }

    @Override
    public String getShipRole() {
        return "Tàu vận tải - Chuyên chở nhu yếu phẩm";
    }
}
