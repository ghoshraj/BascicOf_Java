package basic;

import java.util.Scanner;

public class Check_Positive_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if (n >= 0)
            System.out.println(n + " is a positive number");
        else
            System.out.println(n + " is not a positive number");
    }
}
