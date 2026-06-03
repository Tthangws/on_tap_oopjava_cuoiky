package tramsacnhanh;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/3/2026
 * TIME: 3:59 PM
 */
public class TaxiEV extends ElectricVehicle implements IPayable{
    TaxiEV(String plateNumber, double batterCapacity, double currentBattery){
        super(plateNumber, batterCapacity, currentBattery);
    }

    @Override
    public double calculateChargingCost(double kwhCharged) {
        return (kwhCharged*3500)*0.15;
    }
}
