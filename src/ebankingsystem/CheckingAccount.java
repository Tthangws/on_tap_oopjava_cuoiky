package ebankingsystem;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/3/2026
 * TIME: 1:25 AM
 */
public class CheckingAccount extends BankAccount implements ITransactionLogger {
    private double overdraftLimit;
    public CheckingAccount(String accountNumber, String accountName, double balance, double overdraftLimit) {
        super(accountNumber, accountName, balance); // Đã truyền đúng vị trí
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if((amount - getBalance()) > overdraftLimit){
            throw new InsufficientFundsException("❌ Không thể rút do vượt quá ngưỡng cho phép. Bạn chỉ có thể rút nhiều hơn so với số dư là: "+overdraftLimit+" VND");
        }
        setbalance(getBalance() - amount);
        String thongbao = "Rút thành công "+amount+" VND. Số dư còn lại: "+getBalance();
        logTransaction(thongbao);

    }

    @Override
    public void logTransaction(String message) {
        System.out.println("\uD83D\uDCD1 [LỊCH SỬ GIAO DỊCH]: "+message);
    }
}
