package co.newtonschool.splitwise.model;

public class UserExpense {
    private String username;
    private double share;

    public UserExpense(String username, double share) {
        this.username = username;
        this.share = share;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getShare() {
        return share;
    }

    public void setShare(double share) {
        this.share = share;
    }
}
