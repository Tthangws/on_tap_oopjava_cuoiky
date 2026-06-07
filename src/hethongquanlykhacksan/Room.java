package hethongquanlykhacksan;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/7/2026
 * TIME: 7:25 PM
 */
public abstract class Room {
    private String roomId;
    private String roomName;
    private double basePrice;
    private boolean isAvailable; //boolean, mặc định khi tạo mới là true tức là phòng trống).

    //constructer
    public Room(String roomId, String roomName, double basePrice){
        this.roomId = roomId;
        this.roomName = roomName;
        this.basePrice = basePrice;
        this.isAvailable = true; // Mặc định phòng mới luôn trống
    }

    public double getBasePrice(){
        return basePrice;
    }
    public String getRoomId(){
        return roomId;
    }

    public boolean getAvailable(){
        return isAvailable;
    }

    protected void setAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }

    public void bookRoom(int days) throws InvalidBookingException{
        if(days <= 0){
            throw new InvalidBookingException(" Số ngày đặt phòng không hợp lệ !");
        }
        else {
            isAvailable = false;
            System.out.println("✅ Đã đặt phòng thành công ! Phòng: "+roomName);
        }
    }

    public abstract double calculateTotalCost(int days);
    //Mỗi loại phòng sẽ có công thức tính tổng tiền khác nhau.
}
