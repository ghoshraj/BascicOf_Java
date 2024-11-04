package basic;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int n2 = sc.nextInt();
        System.out.print("Enter 3rd number : ");
        int n3 = sc.nextInt();

        int ans = (n1 + n2 + n3)/3;
        System.out.println("The average of three number is : " + ans);
    }
}
