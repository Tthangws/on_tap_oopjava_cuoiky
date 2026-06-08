package finalboss;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/9/2026
 * TIME: 12:28 AM
 */
public class Warship extends Spacecraft implements ICombatCapable{
    public Warship(String shipId, String shipName) {
        super(shipId, shipName);
    }

    @Override
    public void engageCombat(int enemyPower) {
        if(getCurrentFuel() < enemyPower){
            throw new InsufficientFuelException("Không đủ nhiên liệu để combat ! Tàu: "+getShipName()+" - chỉ còn: "+getCurrentFuel()+" nhiên liệu !");
        } else {
            setFuel(getCurrentFuel() - enemyPower);
            System.out.println("\n\uD83D\uDCA5 Tàu: "+getShipName()+" >đã tiêu diệt kẻ thù sức mạnh: "+enemyPower);
            System.out.println("Nhiên liệu còn lại: "+getCurrentFuel());
        }
    }

    @Override
    public String getShipRole() {
        return "Tàu chiến - Tiên phong bảo vệ hạm đội";
    }
}
