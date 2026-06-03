package QUUANLYTHUVIEN;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/1/2026
 * TIME: 3:46 AM
 */
public class Main {
    public static void main(String[] args) {
                // 1. Khởi tạo người quản lý thư viện
                LibraryManager manager = new LibraryManager();

                // 2. Tạo một số tài liệu
                Book book1 = new Book("B01", "Lap trinh Java", "NXB Giao Duc", 2, "James Gosling", 500);
                Book book2 = new Book("B02", "Clean Code", "Prentice Hall", 0, "Robert C. Martin", 464);
                Magazine mag1 = new Magazine("M01", "Tap chi IT", "NXB Thanh Nien", 5, 120, 6);

                // 3. Thêm vào hệ thống
                System.out.println("--- THÊM TÀI LIỆU ---");
                manager.addDocument(book1);
                manager.addDocument(book2);
                manager.addDocument(mag1);

                // 4. Hiển thị toàn bộ
                System.out.println("\n--- DANH SÁCH TÀI LIỆU ---");
                manager.displayALLDocuments();

                // 5. Test tính năng mượn sách (Có Exception)
                System.out.println("\n--- TEST MƯỢN SÁCH ---");
                try {
                    System.out.println("Đang thử mượn cuốn: " + book1.getTitle()); // Đảm bảo đã có getTitle()
                    book1.borrowdoc();

                    System.out.println("Đang thử mượn cuốn: " + book2.getTitle());
                    book2.borrowdoc(); // Cuốn này quantity = 0, sẽ ném ra Exception
                } catch (outOfStockException e) {
                    System.out.println("Lỗi: " + e.getMessage());
                }

                // 6. Tìm kiếm
                System.out.println("\n--- TÌM KIẾM ---");
                manager.searchByTitle("Lap trinh Java");
            }
        }
