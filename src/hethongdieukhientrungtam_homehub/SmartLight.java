package hethongdieukhientrungtam_homehub;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/8/2026
 * TIME: 10:27 AM
 */
public class SmartLight extends SmartDevice implements IEnergySaving,IConfigurable {
    private int brightness; //Độ sáng
    public SmartLight(String deviceId, String deviceName, double basePower) {
        super(deviceId, deviceName, basePower);
        this.brightness = 100;
    }

    //phuong thuc
    public void changeBrightness(int level){
        if(level < 0 || level > 100){
            throw new InvalidSettingException("⚠️ Độ sáng quá thấp hoặc quá cao với ngưỡng cho phép ở thiết bị: "+getDeviceName());
        } else {
            this.brightness = level;
            System.out.println("✅ Điều chỉnh độ sáng thành công ở mức: "+level);
        }
    }

    @Override
    public double calculatePowerConsumption(int hours) {
        return getBasePower() * hours * (brightness / 100.0);
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
        changeBrightness(value);
    }
}
