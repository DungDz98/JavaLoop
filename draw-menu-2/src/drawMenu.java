import java.util.Scanner;

public class drawMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        while (choice != 4) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print the isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("width: ");
                    int width = input.nextInt();
                    System.out.print("height: ");
                    int height = input.nextInt();
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.print("side: ");
                    int side = input.nextInt();
                    for (int i = 0; i < side; i++) {
                        for (int k = 0; k < i; k++) {
                            System.out.print("  ");
                        }
                        for (int j = 0; j < side - i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.print("side: ");
                    side = input.nextInt();
                    for (int i = 1; i <= side; i++) {
                        for (int j = 0; j < side - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k < i; k++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!");

            }
        }
    }
}
