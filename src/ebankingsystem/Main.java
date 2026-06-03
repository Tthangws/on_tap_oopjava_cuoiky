package ebankingsystem;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/3/2026
 * TIME: 2:54 AM
 */
public class Main {
        public static void main(String[] args) {
            BankManager manager = new BankManager();

            // 1. Tạo tài khoản
            SavingsAccount tkTietKiem = new SavingsAccount("TK01", "Nguyễn Trọng Thắng", 500000, 0.06);
            CheckingAccount tkThanhToan = new CheckingAccount("TK02", "Công ty Tech", 1000000, 5000000);

            System.out.println("====== HỆ THỐNG NGÂN HÀNG ======");
            manager.addAccount(tkTietKiem);
            manager.addAccount(tkThanhToan);

            // 2. Test các kịch bản với HashMap
            // Kịch bản 1: Rút hợp lệ từ thẻ tiết kiệm
            manager.processWithdrawal("TK01", 100000);

            // Kịch bản 2: Rút vi phạm số dư tối thiểu (Còn 400k, rút 360k -> còn 40k -> LỖI)
            manager.processWithdrawal("TK01", 360000);

            // Kịch bản 3: Rút âm tiền từ thẻ thanh toán (Còn 1 củ, rút 4 củ -> Âm 3 củ -> HỢP LỆ vì hạn mức thấu chi là 5 củ)
            manager.processWithdrawal("TK02", 4000000);

            // Kịch bản 4: Rút âm tiền vượt hạn mức (Đang âm 3 củ, rút thêm 3 củ -> Âm 6 củ -> LỖI)
            manager.processWithdrawal("TK02", 3000000);
        }
    }
