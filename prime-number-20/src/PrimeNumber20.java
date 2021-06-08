import java.util.Scanner;

public class PrimeNumber20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a numbers: ");
        int numbers = input.nextInt();
        int count = 1;
        for (int number = 2; count <= numbers; number++) {
            if (isPrimeNumber(number)) {
                System.out.print(number + " ");
                count++;
            }
        }
    }
    public static boolean isPrimeNumber(int number) {
        boolean check = true;
        if (number < 2) {
            check = false;
        } else {
            int i = 2;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
        }
        return check;
    }
}
