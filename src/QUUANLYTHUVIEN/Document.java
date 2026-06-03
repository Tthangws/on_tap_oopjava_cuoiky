package QUUANLYTHUVIEN;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/1/2026
 * TIME: 2:27 AM
 */
public abstract class Document {
    private String id;
    private String title; //names' document
    private String publisher; //nha xuat ban
    private int quantity; //so luong ban sao

    // ham constructor
    Document(String id,String title,String publisher,int quantity){
        this.id = id;
        this.title = title;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    //ham getter setter

    //title
    public String getTitle(){
        return title;
    }
    //quantity
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public void displayInfo() {
        System.out.println("ID: "+id+" || Title: "+title+" || Publisher: "+publisher+" || Quantity: "+quantity);
    }
}
