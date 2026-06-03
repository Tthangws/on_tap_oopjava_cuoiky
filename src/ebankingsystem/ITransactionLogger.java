package ebankingsystem;

public interface ITransactionLogger {
    void logTransaction(String message);
    /*Mọi tài khoản khi giao dịch thành công đều phải gọi hàm này
     để in ra lịch sử (ví dụ: "[LOG] Đã nạp thành công 500k").
     */
}
