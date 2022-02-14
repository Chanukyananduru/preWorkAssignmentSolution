import java.util.Scanner;

public class Multifunc {

    public void printFibonacciSeries(int limit) {

        int i = 1;
        int j = 1;

        System.out.println("Printing " + limit + " numbers:");
        System.out.print(i + "," + j + ",");
        for (int count = 2; count < limit; count++) {
            int res = i + j;
            System.out.print(res + ",");
            i = j;
            j = res;
        }
        System.out.println("");
    }

    public void printStar(int rows) {
        for (int i = 0; i <= rows; i++) {
            for (int j = rows; i < j; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void primeCheck(int check) {
        int count = 0;
        for (int i = 2; i < check; i++) {
            if (check % i == 0) {
                count = count + 1;
            }
        }
        if (count > 0) {
            System.out.println(
                    "The number is NOT prime and has " + count + " divisors, excluding 1 & the number itself.\n");
        } else {
            System.out.println("The number is prime due to " + count + " divisors.\n");
        }
    }

    public void palindrome(int num) {
        int original = num;
        int reverse = 0;

        while (num != 0) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }
        if (original == reverse) {
            System.out.println("The number is a palindrome.\n");
        } else {
            System.out.println("The number is NOT a palindrome.\n");
        }
    }

    public static void main(String[] args) {
        Multifunc obj = new Multifunc();
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"
                + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"
                + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");
        choice = sc.nextInt();

        switch (choice) {
            case 0:
                System.out.println("Exiting...\n");
                break;
            case 1:
                System.out.println("Enter the number for which palindrome is to be found:\n");
                int number = sc.nextInt();
                obj.palindrome(number);
                break;
            case 2:
                System.out.println("Enter the rows for which you want the descending star design for:\n");
                int rowlimit = sc.nextInt();
                obj.printStar(rowlimit);
                break;
            case 3:
                System.out.println("Enter the number for which prime check is to be done:\n");
                int prime = sc.nextInt();
                obj.primeCheck(prime);
                break;
            case 4:
                System.out.println("Enter how many fibonacci numbers have to be printed:\n");
                int limit = sc.nextInt();
                obj.printFibonacciSeries(limit);
                break;
            default:
                System.out.println("You did not type a valid option.\n8");
        }
        sc.close();
    }

}
