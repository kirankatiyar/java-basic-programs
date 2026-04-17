package com.zomind;
import java.util.Scanner;
public class CheckNumberPositive {
    public static void check(int a) {
        if (a > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println(" Nagative number=" );
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        System.out.print("number=");
        int num1 = sc.nextInt();
        check(num1);
    }
}
