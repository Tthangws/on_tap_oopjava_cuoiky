package tramsacnhanh;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/3/2026
 * TIME: 3:59 PM
 */
public abstract class ElectricVehicle {
    private String plateNumber; //bien so
    private double batteryCapacity;
    private double currentBattery;

    // constructer
    ElectricVehicle(String plateNumber, double batteryCapacity, double currentBattery){
        this.plateNumber = plateNumber;
        this.batteryCapacity = batteryCapacity;
        this.currentBattery = currentBattery;
    }

    //getter
    public String getPlateNumber(){
        return plateNumber;
    }
    public void chargeBattery(double kwh) throws OverchargeException{
        if((kwh + currentBattery) > batteryCapacity){
            throw new OverchargeException("❌ Lượng pin yêu cầu sạc vượt quá sức chưa của pin !");
        }
        currentBattery += kwh;
        System.out.println("✅ Đã sạc thành công !");
    }
}
