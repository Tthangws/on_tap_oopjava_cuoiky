package finalboss;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/9/2026
 * TIME: 12:28 AM
 */
public abstract class Spacecraft {
    private String shipId;
    private String shipName;
    private double currentFuel; // nhien lieu

    //constructor
    public Spacecraft(String shipId, String shipName){
        this.shipId = shipId;
        this.shipName = shipName;
        this.currentFuel = 100;
    }

    //getter setter
    public double getCurrentFuel(){
        return currentFuel;
    }

    protected void setFuel(double amount){
        this.currentFuel = amount;
    }

    public String getShipId(){
        return shipId;
    }

    public String getShipName(){
        return shipName;
    }

    public void travel(double distance){
       //distance tính bằng năm ánh sáng
        if(distance * 5 > getCurrentFuel()){
            throw new InsufficientFuelException("Nhiên liệu không đủ !");
        } else {
            setFuel(getCurrentFuel() - distance * 5);
            System.out.println("✅ Đã bay quãng đường: "+distance+" năm ánh sáng ! Nhiên liệu còn lại: "+getCurrentFuel());
        }
    }

    public abstract String getShipRole();
    //Trả về chuỗi mô tả vai trò của tàu.
}
