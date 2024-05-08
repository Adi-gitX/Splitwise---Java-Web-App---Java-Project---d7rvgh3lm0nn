package co.newtonschool.splitwise.response;

import java.util.List;

public class ExpenseResponseList {
    private List<ExpenseResponse> expenses;

    public ExpenseResponseList(List<ExpenseResponse> expenses) {
        this.expenses = expenses;
    }

    public List<ExpenseResponse> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<ExpenseResponse> expenses) {
        this.expenses = expenses;
    }
}
