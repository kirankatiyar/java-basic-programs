package com.zomind;
import java.util.Scanner;
public class CountNumberOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("User enter number");
        int num = sc.nextInt();
        int sum =0;
        while (num !=0){
            int digit = num%10;
            sum =sum+digit;
            num = num/10;
        }
        System.out.print("Sum of digits = "+sum);
    }
}
