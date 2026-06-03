package tramsacnhanh;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/3/2026
 * TIME: 3:59 PM
 */
public class PersonalEV extends ElectricVehicle implements IPayable{

    PersonalEV(String plateNumber, double batteryCapacity, double currentBattery) {
        super(plateNumber, batteryCapacity, currentBattery);
    }

    @Override
    public double calculateChargingCost(double kwhCharged) {
        if(kwhCharged > 50){
            return kwhCharged*3500+(kwhCharged*3500)*0.1;
        }
        return kwhCharged*3500;
    }
}
