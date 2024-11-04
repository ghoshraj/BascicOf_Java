package basic;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int number = sc.nextInt();
        boolean flag = true;
        for (int i = 2 ; i <= number/2; i++) {
            if (number % i == 0){
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println(number + " is a prime number");
        else
        System.out.println(number + " is not a prime number");
    }
}
