import java.io.*;
import java.util.ArrayList;
class FileHandler {

    public static void saveToFile(ArrayList<Expense> expenses) {
        try (PrintWriter writer = new PrintWriter("expenses.txt")) {
            for (Expense e : expenses) {
                writer.println(e.getAmount() + "," + e.getCategory() + "," + e.getDate());
            }
        } catch (Exception e) {
            System.out.println("Error saving file");
        }
    }
}