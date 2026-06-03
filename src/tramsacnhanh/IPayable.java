package tramsacnhanh;

public interface IPayable {
    double calculateChargingCost(double kwhCharged);
    /*Trạm sạc có giá điện cơ bản là 3.500 VNĐ / 1 kWh.
    Các loại xe khác nhau sẽ có cách tính tiền và chiết khấu khác nhau
     */
}
