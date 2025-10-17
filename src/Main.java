//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try (java.util.Scanner s = new java.util.Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = s.hasNextLine() ? s.nextLine().trim() : "";
            if (name.isEmpty()) {
                System.out.println("No name provided.");
                return;
            }
            System.out.println(name);
            System.out.println(new StringBuilder(name).reverse());
        } catch (Exception e) {
            // Catch runtime exceptions (e.g., IllegalStateException) and report a short message.
            System.err.println("Error reading input: " + e.getMessage());
            
        }
    }
}