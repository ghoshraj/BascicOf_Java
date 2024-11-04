package basic;

import java.util.Scanner;

public class Sum_Of_Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int n2 = sc.nextInt();
        System.out.print("Enter 3rd number : ");
        int n3 = sc.nextInt();
        System.out.print("Enter 1st number : ");
        int n4 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int n5 = sc.nextInt();
        System.out.print("Enter 3rd number : ");
        int n6 = sc.nextInt();
        int evensum = 0;
        int oddsum = 0;
        if (n1 % 2 == 0)
            evensum+=n1;
        else
            oddsum +=n1;
        if (n2 % 2 == 0)
            evensum+=n2;
        else
            oddsum +=n2;
        if (n3 % 2 == 0)
            evensum+=n3;
        else
            oddsum +=n3;
        if (n4 % 2 == 0)
            evensum+=n4;
        else
            oddsum +=n4;
        if (n5 % 2 == 0)
            evensum+=n5;
        else
            oddsum +=n5;
        if (n6 % 2 == 0)
            evensum+=n6;
        else
            oddsum +=n6;
        System.out.println("Even number sum = " + evensum);
        System.out.println("Odd number sum = " + oddsum);
    }
}
