import java.util.*;

class ExpenseManager {
    private ArrayList<Expense> expenses = new ArrayList<>();
    public void addExpense(Expense e) {
        expenses.add(e);
    }
    public void viewExpenses() {
        for (Expense e : expenses) {
            System.out.println(e.getAmount() + " | " + e.getCategory() + " | " + e.getDate());
        }
    }
    public double getTotalExpense() {
        double total = 0;
        for (Expense e : expenses) {
            total += e.getAmount();
        }
        return total;
    }
    public void categoryWiseExpense() {
        HashMap<String, Double> map = new HashMap<>();

        for (Expense e : expenses) {
            map.put(e.getCategory(),
                    map.getOrDefault(e.getCategory(), 0.0) + e.getAmount());
        }
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}