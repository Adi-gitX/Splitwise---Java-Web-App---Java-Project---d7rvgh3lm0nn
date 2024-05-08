package co.newtonschool.splitwise.response;

import co.newtonschool.splitwise.model.UserExpense;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class ExpenseResponse {
    private int expenseId;
    private String expenseTitle;
    private double expenseAmount;
    private String splitType;
    private LocalDate expenseDate;
    private LocalTime expenseTime;
    private List<UserExpense> userExpenseResponseList;

    public ExpenseResponse(int expenseId, String expenseTitle, double expenseAmount, String splitType, LocalDate expenseDate, LocalTime expenseTime, List<UserExpense> userExpenseResponseList) {
        this.expenseId = expenseId;
        this.expenseTitle = expenseTitle;
        this.expenseAmount = expenseAmount;
        this.splitType = splitType;
        this.expenseDate = expenseDate;
        this.expenseTime = expenseTime;
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

    public String getSplitType() {
        return splitType;
    }

    public void setSplitType(String splitType) {
        this.splitType = splitType;
    }

    public LocalDate getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(LocalDate expenseDate) {
        this.expenseDate = expenseDate;
    }

    public LocalTime getExpenseTime() {
        return expenseTime;
    }

    public void setExpenseTime(LocalTime expenseTime) {
        this.expenseTime = expenseTime;
    }

    public List<UserExpense> getUserExpenseResponseList() {
        return userExpenseResponseList;
    }

    public void setUserExpenseResponseList(List<UserExpense> userExpenseResponseList) {
        this.userExpenseResponseList = userExpenseResponseList;
    }
}
