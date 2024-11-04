package basic;

import java.util.Scanner;

public class IncomeTax_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int salary = sc.nextInt();
        int tax = 0;
        if (salary < 500000){
            System.out.println("Your tax amount is : "+tax);
        }
        else if (salary >=500000 && salary <= 1000000){
            tax = (salary * 20 ) /100;
            System.out.println("Your tax amount is : "+tax);
        }
        else {
            tax = (salary * 30 ) /100;
            System.out.println("Your tax amount is : "+tax);
        }
    }
}
