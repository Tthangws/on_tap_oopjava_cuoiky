package QUUANLYTHUVIEN;

import java.util.ArrayList;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/1/2026
 * TIME: 2:29 AM
 */
public class LibraryManager {
   private ArrayList <Document> documentManager = new ArrayList<>();

    //phuong thuc
    public void addDocument(Document doc){
        documentManager.add(doc);
        System.out.println("Đã thêm tài liệu: "+doc.getTitle());
    }
    public void searchByTitle(String keyword){
        for(Document i : documentManager){
            if(keyword.equals(i.getTitle())){
                System.out.println("Đã tìm thấy tài liệu !");
                i.displayInfo();
            }
        }
    }
    public void displayALLDocuments(){
        for (Document i : documentManager){
            i.displayInfo();
        }
    }
}
