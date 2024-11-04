package basic;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int n2 = sc.nextInt();
        System.out.print("Enter the operation : ");
        String operation = sc.next();
        int ans = 0;

        switch (operation){
            case "+":
                ans = n1 + n2;
                break;
            case "-":
                if (n1 >= n2)
                ans = n1 - n2;
                else
                    ans = n2 - n1;
                break;
            case "*":
                ans = n1 * n2;
                break;
            case "/":
                ans = n1 / n2;
                break;
            case "%":
                ans = n1 % n2;
                break;

        }
        System.out.println(n1 + " " + operation + " " + n2 + " = " + ans);
    }
}
