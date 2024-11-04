package basic;

import java.util.Scanner;

public class Check_Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int n = sc.nextInt();
        if (n % 2 == 0)
            System.out.println(n + " is a even number");
        else
            System.out.println(n + " is not a even number");
    }
}
