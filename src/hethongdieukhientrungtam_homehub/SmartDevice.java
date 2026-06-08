package hethongdieukhientrungtam_homehub;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/8/2026
 * TIME: 10:27 AM
 */
public abstract class SmartDevice {
    private String deviceId;
    private String deviceName;
    private double basePower;
    private boolean isOn;

    //constructor
    public SmartDevice(String deviceId, String deviceName,double basePower){
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.basePower = basePower;
        this.isOn = false;
    }

    //setter getter
    public double getBasePower(){
        return basePower;
    }

    public String getDeviceId(){
        return deviceId;
    }

    public String getDeviceName(){
        return deviceName;
    }

    protected void setPowerState(boolean state){
        this.isOn = state;
    }

    public boolean isOn() {
        return isOn;
    }

    //phuong thuc thuc thi
    public void turnOn(){
        setPowerState(true);
        System.out.println("\n✅ Đã bật thiết bị: "+getDeviceName());
    }

    public void turnOff(){
        setPowerState(false);
        System.out.println("\n✅ Đã tắt thiết bị: "+getDeviceName());
    }

    public abstract String getDeviceStatus();
    //Trả về một chuỗi miêu tả trạng thái hiện tại của thiết bị.
}
