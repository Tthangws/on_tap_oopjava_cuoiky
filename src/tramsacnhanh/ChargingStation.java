package tramsacnhanh;

import java.util.HashMap;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/3/2026
 * TIME: 4:00 PM
 */
public class ChargingStation {
    private HashMap<String,ElectricVehicle> vehicleManager = new HashMap<>();

    //ham them phuong tien
    public void addVehicle(ElectricVehicle vehicle){
        if(vehicleManager.size() < 5){
            System.out.println("✅ Đã cắm sạc thành công ! Xe có biển: "+vehicle.getPlateNumber());
            vehicleManager.put(vehicle.getPlateNumber(),vehicle);
            return;
        }
        System.out.println("\uD83D\uDE45 không thể cắm sạc xe: "+vehicle.getPlateNumber()+" => đã đạt giới hạn số xe cắm sạc (5 xe) !");
    }

    // BỔ SUNG: Hàm ngắt sạc để giải phóng chỗ cho trạm
    public void removeVehicle(String plateNumber) {
        if (vehicleManager.containsKey(plateNumber)) {
            vehicleManager.remove(plateNumber);
            System.out.println("👋 Đã ngắt sạc và giải phóng chỗ trống cho xe: " + plateNumber);
        }
    }

    public void processChargeBattery(String plateNumber, double kwh){
        // truong hop k co xe nay trong map
        if(!vehicleManager.containsKey(plateNumber)){
            System.out.println("❌ Lỗi: Không tìm thấy xe nào có bien số: " + plateNumber);
            return;
        }
        //lấy xe ra
        ElectricVehicle targetVehicle = vehicleManager.get(plateNumber);
        //tiến hành sạc
        try{
            System.out.println("___Đang tiến hành sạc xe cho: "+targetVehicle.getPlateNumber());
            targetVehicle.chargeBattery(kwh);
            // Ép kiểu an toàn (Safe Casting) với instanceof
            if (targetVehicle instanceof IPayable) {
                double cost = ((IPayable) targetVehicle).calculateChargingCost(kwh);
                System.out.println("💵 Số tiền hóa đơn: " + cost + " VNĐ");
            }
            // Tự động ngắt sạc sau khi thanh toán xong để đón khách khác
            removeVehicle(plateNumber);
        } catch (OverchargeException e){
            System.out.println("⚠\uFE0F Oops! Sạc xe thất bại do: "+e.getMessage());
        }
    }

}
