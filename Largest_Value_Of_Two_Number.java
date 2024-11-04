package basic;

import java.util.Scanner;

public class Largest_Value_Of_Two_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter 2nd number :");
        int n2 = sc.nextInt();
        if (n1 > n2)
            System.out.println(n1 + " is the largest");
        else
            System.out.println(n2 + " is the largest");
    }
}
