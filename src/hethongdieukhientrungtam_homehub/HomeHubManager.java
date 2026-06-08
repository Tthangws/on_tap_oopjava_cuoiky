package hethongdieukhientrungtam_homehub;

import java.util.HashMap;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/8/2026
 * TIME: 10:28 AM
 */
public class HomeHubManager {
    private HashMap<String,SmartDevice> deviceList = new HashMap<>();

    public void addDevice(SmartDevice device){
        deviceList.put(device.getDeviceId(),device);
        System.out.println("✅ Đã thêm thành công thiết bị: "+device.getDeviceName());
    }

    public void calculateTotalDailyEnergy(int hours) {
            double totalPower = 0;
            for (SmartDevice device : deviceList.values()) {
                if (device.isOn() && device instanceof IEnergySaving) {
                    double power = ((IEnergySaving) device).calculatePowerConsumption(hours);
                    totalPower += power;
                }
            }
            System.out.println("\n⚡\uFE0F Tổng lượng điện đã tiêu thụ: " + totalPower + " Wh");
        }

    public void changeDeviceSetting(String deviceId, int newValue) {
        if (!deviceList.containsKey(deviceId)) {
            System.out.println("❌ Khoong có thiết bị nào có mã: " + deviceId + " trong nhà !");
        } else {
            SmartDevice device = deviceList.get(deviceId);

            // Nếu thiết bị này hỗ trợ cài đặt thông số
            if (device instanceof IConfigurable) {
                try {
                    // ĐA HÌNH: Cùng 1 dòng lệnh, nhưng Đèn hiểu là chỉnh sáng, Điều hòa hiểu là chỉnh nhiệt!
                    ((IConfigurable) device).adjustSetting(newValue);
                } catch (InvalidSettingException e) {
                    System.out.println("⚠️ Hệ thống từ chối: " + e.getMessage());
                }
            } else {
                System.out.println("❌ Thiết bị này không hỗ trợ điều chỉnh thông số.");
            }
        }
    }
    //in ra tình trạng các thiết bị
    public void inTT(){
        System.out.println("\n===== ✨Tình trạng tất cả thiết bị =====");
        for(SmartDevice device : deviceList.values()){
            System.out.println(device.getDeviceName()+" : "+device.getDeviceStatus());
        }
    }
}

