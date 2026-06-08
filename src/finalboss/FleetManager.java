package finalboss;

import java.util.HashMap;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/9/2026
 * TIME: 12:29 AM
 */
public class FleetManager {
    private HashMap<String,Spacecraft> fleet = new HashMap<>();

    public void addShip(Spacecraft ship){
        fleet.put(ship.getShipId(),ship);
        System.out.println("✅ Đã thêm thành công tàu: "+ship.getShipName());
    }

    public void dispatchMission(String shipId, double distance){
        //Tìm tàu theo ID, lấy tàu ra và cho nó gọi hàm travel
        if(!fleet.containsKey(shipId)){
            System.out.println("❌ Không tìm thấy tàu có ID: "+shipId);
        } else {
            Spacecraft targetShip = fleet.get(shipId);

            try{
                System.out.println("\n...Đang thực hiện bước nhảy ánh sáng với tàu: "+targetShip.getShipName());
                targetShip.travel(distance);
            } catch(InsufficientFuelException e){
                System.out.println("❌ Lỗi: "+e.getMessage());
            }
        }
    }

    public void defendBase(int enemyPower) {
        System.out.println("\n🚨 BÁO ĐỘNG TỔNG LỰC: Căn cứ bị tấn công! Các tàu sẽ chiến đấu đến giọt nhiên liệu cuối cùng!");

        for (Spacecraft ship : fleet.values()) {
            if (ship instanceof ICombatCapable) {
                System.out.println("\n▶️ Tàu [" + ship.getShipName() + "] xuất kích!");

                try {
                    // Vòng lặp tử thủ: Đánh liên tục không ngừng
                    while (true) {
                        ((ICombatCapable) ship).engageCombat(enemyPower);
                    }
                } catch (InsufficientFuelException e){
                    // Khi cạn xăng, lỗi văng ra, vòng lặp while(true) bị phá vỡ!
                    System.out.println("⚠️ Lệnh Rút lui: " + e.getMessage());
                }
            }
        }
        System.out.println("\n🛡️ Hạm đội đã cạn kiệt năng lượng. Kết thúc đợt phòng thủ!");
    }
}
