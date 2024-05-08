package co.newtonschool.splitwise.model;

import java.time.LocalDateTime;
import java.util.List;

public class Expense {
    public enum SplitType {
        EACH,
        PERCENTAGE,
        SHARE
    }

    private static int idCounter = 1;

    private int expenseId;
    private String expenseTitle;
    private double expenseAmount;
    private SplitType splitType;
    private LocalDateTime expenseDate;
    private List<UserExpense> userExpenseResponseList;

    public Expense(String expenseTitle, double expenseAmount, SplitType splitType, LocalDateTime expenseDate, List<UserExpense> userExpenseResponseList) {
        this.expenseId = idCounter++;
        this.expenseTitle = expenseTitle;
        this.expenseAmount = expenseAmount;
        this.splitType = splitType;
        this.expenseDate = expenseDate;
        this.userExpenseResponseList = userExpenseResponseList;
    }

    public int getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(int expenseId) {
        this.expenseId = expenseId;
    }

    public String getExpenseTitle() {
        return expenseTitle;
    }

    public void setExpenseTitle(String expenseTitle) {
        this.expenseTitle = expenseTitle;
    }

    public double getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(double expenseAmount) {
        this.expenseAmount = expenseAmount;
    }

    public SplitType getSplitType() {
        return splitType;
    }

    public void setSplitType(SplitType splitType) {
        this.splitType = splitType;
    }

    public LocalDateTime getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(LocalDateTime expenseDate) {
        this.expenseDate = expenseDate;
    }

    public List<UserExpense> getUserExpenseResponseList() {
        return userExpenseResponseList;
    }

    public void setUserExpenseResponseList(List<UserExpense> userExpenseResponseList) {
        this.userExpenseResponseList = userExpenseResponseList;
    }
}
