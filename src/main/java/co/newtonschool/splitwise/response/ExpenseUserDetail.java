package co.newtonschool.splitwise.response;

public class ExpenseUserDetail {
    private int userId;
    private String username;
    private double totalAmount;
    private double paidAmount;

    public ExpenseUserDetail(int userId, String username, double totalAmount, double paidAmount) {
        this.userId = userId;
        this.username = username;
        this.totalAmount = totalAmount;
        this.paidAmount = paidAmount;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(double paidAmount) {
        this.paidAmount = paidAmount;
    }
}
