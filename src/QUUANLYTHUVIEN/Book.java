package QUUANLYTHUVIEN;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/1/2026
 * TIME: 2:28 AM
 */
public class Book extends Document implements IBorrowable {
    private String author;
    private int pageNumber;

    Book(String id, String title, String publisher, int quantity, String author , int pageNumber) {
        super(id, title, publisher, quantity);
        this.author = author;
        this.pageNumber = pageNumber;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Author: "+author+"|| PageNumber: "+pageNumber);
    }

    @Override
    public void borrowdoc() throws outOfStockException{
        if(getQuantity() == 0){
            throw new outOfStockException("Oop! Sách này không còn trong kho.");
        }
        else {
            setQuantity(getQuantity()-1);
            System.out.println("Đã mượn thành công !");
        }
    }

    @Override
    public void returnDoc() {
        setQuantity(getQuantity()+1);
        System.out.println("Đã trả sách thành công !");
    }
}
