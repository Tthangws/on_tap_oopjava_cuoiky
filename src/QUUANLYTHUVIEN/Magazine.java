package QUUANLYTHUVIEN;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/1/2026
 * TIME: 2:28 AM
 */
public class Magazine extends Document{
    private int issueNumber;  //so phat hanh
    private int releaseMonth; // thang phat hanh

    Magazine(String id, String title, String publisher, int quantity, int issueNumber, int releaseMonth){
        super(id,title,publisher,quantity);
        this.issueNumber = issueNumber;
        this.releaseMonth = releaseMonth;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("issueNumber: "+issueNumber+" || releaseMonth: "+releaseMonth);
    }


}
