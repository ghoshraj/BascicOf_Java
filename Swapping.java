package basic;

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int n2 = sc.nextInt();
        int n3 = n1 + n2 ;
        n1 = n3 - n1;
        n2 = n3 - n1;
        System.out.println(n1 + " " + n2);
    }
}
