package finalboss;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/9/2026
 * TIME: 1:15 AM
 */
public class Main {
    public static void main(String[] args) {
        FleetManager fm = new FleetManager();

        TransportShip ts1 = new TransportShip("TS01","Tàu chở hoa quả");
        TransportShip ts2 = new TransportShip("TS05","Tàu chở nhiên liệu");
        Warship ws1 = new Warship("ws12","B52");
        Warship ws2 = new Warship("ws19","Tiêm kích");
        Warship ws3 = new Warship("ws23","Drone");

        System.out.println("===== THÊM TÀU =====");
        fm.addShip(ts1);
        fm.addShip(ts2);
        fm.addShip(ws1);
        fm.addShip(ws2);
        fm.addShip(ws3);

        System.out.println("\n===== THỰC HIỆN TRAVEL VỚI CÁC TÀU =====");
        // cho bay bình thường
        fm.dispatchMission("TS01",7);
        fm.dispatchMission("ws19",10);
        fm.dispatchMission("ws23",15);

        //bay k đủ nhiên liệu
        fm.dispatchMission("ws12",25);
        fm.dispatchMission("TS05",26);

        System.out.println("\n===== ĐƯA TÀU RA KHI CÓ KẺ THÙ =====");
        //có địch tấn công, cho tàu ra đánh
        fm.defendBase(30);
    }
}
