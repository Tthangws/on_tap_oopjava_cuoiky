package hethongdieukhientrungtam_homehub;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/8/2026
 * TIME: 10:27 AM
 */
//Điều hòa thông minh
public class SmartAC extends SmartDevice implements IEnergySaving,IConfigurable{
    private int temperature;
    public SmartAC(String deviceId, String deviceName, double basePower) {
        super(deviceId, deviceName, basePower);
        this.temperature = 24;
    }

    //phuong thuc
    public void changeTemperature(int temp){
        if(temp < 16 || temp > 32){
            throw new InvalidSettingException("⚠️ Nhiệt độ không hợp lệ !");
        } else {
            this.temperature = temp;
            System.out.println("✅ Đã chỉnh nhiệt độ thành: "+temp+"'C");
        }
    }

    @Override
    public double calculatePowerConsumption(int hours) {
        if(this.temperature < 24){
            return ((getBasePower() * hours) * 1.2);
        }
        return getBasePower() * hours;
    }

    @Override
    public String getDeviceStatus() {
        if(isOn()){
            return"\uD83C\uDF1E Thiết bị đang bật !";
        }
        return "\uD83C\uDF1A Thiết bị đang tắt !";
    }

    @Override
    public void adjustSetting(int value) throws InvalidSettingException {
        changeTemperature(value);
    }
}
