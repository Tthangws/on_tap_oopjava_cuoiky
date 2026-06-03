package ebankingsystem;

/*
 * NGUYỄN TRỌNG THẮNG: ADMIN
 * NGÀY THÁNG: 6/3/2026
 * TIME: 1:24 AM
 */
public abstract class BankAccount {
    private String accountNumber;
    private String accountName;
    private double balance;

    //constructer
    public BankAccount(String accountNumber, String accountName, double balance){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    //getter
    public double getBalance(){
        return balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    //setter balance
    protected void setbalance(double balance){
        this.balance = balance;
    }

    //phuong thuc
    //napj tiền
    protected void deposit(double amount) throws InvalidAmountException{
        if(amount <= 0){
            throw new InvalidAmountException("Oops! Tiền nạp vào không được bé hơn 0.");
        }
        balance = this.balance + amount;
    }
    // rut tien
    public abstract void withdraw(double amount) throws InsufficientFundsException;
}
