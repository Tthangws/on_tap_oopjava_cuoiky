package ebankingsystem;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/3/2026
 * TIME: 1:25 AM
 */
public class SavingsAccount extends BankAccount implements ITransactionLogger{
    private double interesRate;
    public SavingsAccount(String accountNumber, String accountName, double balance, double interesRate){
        super(accountNumber,accountName,balance);
        this.interesRate = interesRate;
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException{
        if((getBalance() - amount) < 50000){
            throw new InsufficientFundsException("Lỗi! Số dư trong tk của bạn phải còn ít nhất 50k sau khi rút.");
        }
        else {
            setbalance(getBalance() - amount);
            String thongbao = "Rút thành công "+amount+" VND. Số dư còn lại: "+getBalance();
            logTransaction(thongbao);
        }

    }

    @Override
    public void logTransaction(String message) {
        System.out.println("\uD83D\uDCD1 [LỊCH SỬ GIAO DỊCH]: "+message);
    }
}
