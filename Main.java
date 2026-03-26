import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExpenseManager manager = new ExpenseManager();

        while (true) {
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Total Expense");
            System.out.println("4. Category-wise Expense");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Amount: ");
                    double amt = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Category: ");
                    String cat = sc.nextLine();

                    System.out.print("Date: ");
                    String date = sc.nextLine();

                    manager.addExpense(new Expense(amt, cat, date));
                    break;

                case 2:
                    manager.viewExpenses();
                    break;

                case 3:
                    System.out.println("Total: " + manager.getTotalExpense());
                    break;

                case 4:
                    manager.categoryWiseExpense();
                    break;

                case 5:
                    sc.close();
                    System.exit(0);
            }
        }
    }
}