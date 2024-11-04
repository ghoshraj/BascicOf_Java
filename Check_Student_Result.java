package basic;

import java.util.Scanner;

public class Check_Student_Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter result : ");
        int result = sc.nextInt();
       String status = result >= 33 ? "Pass" : "Fail";
        System.out.println("The student is " + status);
    }
}
