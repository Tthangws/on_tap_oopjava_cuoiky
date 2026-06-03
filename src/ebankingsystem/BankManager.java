package ebankingsystem;

import java.util.HashMap;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/3/2026
 * TIME: 1:25 AM
 */
public class BankManager {
   private HashMap<String, BankAccount> accountManager = new HashMap<>();

   // thêm tài khoản
    public void addAccount(BankAccount account){
        accountManager.put(account.getAccountNumber(),account);
        System.out.println("✅ Đã mở tài khoản thành công cho: " + account.getAccountName());
    }
    public void processWithdrawal(String accNumber, double amount){
        // 1. Kiểm tra xem số tài khoản có tồn tại trong HashMap không
        if (!accountManager.containsKey(accNumber)) {
            System.out.println("❌ Lỗi: Không tìm thấy số tài khoản " + accNumber);
            return;
        }

        // 2. Lấy ngay tài khoản đó ra mà không cần vòng lặp
        BankAccount targetAccount = accountManager.get(accNumber);

        // 3. Tiến hành rút tiền và bắt lỗi
        try {
            System.out.println("\n--- Đang xử lý giao dịch cho " + targetAccount.getAccountName() + " ---");
            targetAccount.withdraw(amount);
        } catch (InsufficientFundsException e) {
            System.out.println("❌ Giao dịch thất bại: " + e.getMessage());
        }
    }
}
