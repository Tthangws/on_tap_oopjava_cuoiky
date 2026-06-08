# 📚 Ôn Tập Lập Trình Hướng Đối Tượng (OOP) Java - Cuối Kỳ

Dự án này được tạo ra để lưu trữ toàn bộ các bài tập, mã nguồn mẫu và kiến thức cốt lõi phục vụ cho việc ôn thi cuối kỳ môn Lập trình Hướng đối tượng với ngôn ngữ Java.

---

## 🛠️ Công nghệ sử dụng
*   **Ngôn ngữ lập trình:** Java (JDK 17 hoặc mới hơn)
*   **Công cụ phát triển (IDE):** IntelliJ IDEA
*   **Quản lý mã nguồn:** Git & GitHub

## 📌 Các kiến thức cốt lõi đã hoàn thành
Trong thư mục `src`, các bài tập được cấu trúc nhằm củng cố các phần kiến thức quan trọng:
*   [x] **Tính Đóng Gói (Encapsulation):** Sử dụng các hàm `Getter/Setter` để kiểm soát và bảo vệ tính đúng đắn của dữ liệu đầu vào.
*   [x] **Tính Kế Thừa (Inheritance):** Kế thừa từ lớp thông thường và lớp trừu tượng bằng từ khóa `extends`, hoặc `implements` với các interfaces.
*   [x] **Xử lý ngoại lệ (Exception Handling):** Sử dụng khối `try-catch` và tự định nghĩa các lỗi nghiệp vụ riêng bằng **Custom Exception** (ví dụ: `HetSachException`).
*   [x] **Cấu trúc dữ liệu động:** Ứng dụng `ArrayList,HashMap` để xây dựng các hàm Thêm, Xóa, Tìm kiếm phần tử một cách linh hoạt.

## 📂 Cấu trúc thư mục dự án ( mẫu )
```text
on_tap_oopjava_cuoiky/
├── .idea/                 # File cấu hình môi trường của phần mềm IntelliJ
├── src/                   # Thư mục chính chứa toàn bộ mã nguồn của dự án
│   ├── Main.java          # File chạy chương trình chính (chứa hàm main)
│   ├── SinhVien.java      # Bài tập minh họa về Class, Encapsulation và Setter
│   └── HetSachException.java # Bài tập thiết kế Custom Exception cho hệ thống mượn sách
└── README.md              # File hướng dẫn hiển thị giao diện này
