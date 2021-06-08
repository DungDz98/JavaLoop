

public class CheckPrime100 {
    public static void main(String[] args) {
        for (int number = 2; number <= 100; number++) {
            if (isPrimeNumber(number)) {
                System.out.print(number + " ");
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
