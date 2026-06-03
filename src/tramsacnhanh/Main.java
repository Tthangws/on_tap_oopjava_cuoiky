package tramsacnhanh;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/3/2026
 * TIME: 4:47 PM
 */
public class Main {
    public static void main(String[] args) {
        ChargingStation cs = new ChargingStation();

        TaxiEV tev1 = new TaxiEV("36k3 - 0044",80,12);
        TaxiEV tev2 = new TaxiEV("36B3 - 56789",110,51);
        TaxiEV tev3 = new TaxiEV("44D2 - 99999",98,2);
        PersonalEV pev1 = new PersonalEV("35A1 - 45230", 123,10);
        PersonalEV pev2 = new PersonalEV("47C5 - 56721", 72, 20);
        PersonalEV pev3 = new PersonalEV("68H68 - 22756", 66, 0);


        System.out.println("===== TRẠM SẠC NHANH VINFAST =====");
        cs.addVehicle(tev1);
        cs.addVehicle(tev2);
        cs.addVehicle(tev3);
        cs.addVehicle(pev1);
        cs.addVehicle(pev2);
        cs.addVehicle(pev3);

        System.out.println("\n===== ĐANG XỬ LÝ... =====");
        cs.processChargeBattery("36k3 - 0044",30);
        cs.processChargeBattery("36H3 - 56789",32);
        cs.processChargeBattery("44D2 - 99999",50);
        cs.processChargeBattery("35A1 - 45230",60);
        cs.processChargeBattery("47C5 - 56721",55);
        cs.processChargeBattery("68H68 - 22756",55);

    }
}
