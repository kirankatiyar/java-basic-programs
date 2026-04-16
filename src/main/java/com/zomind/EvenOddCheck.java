package com.zomind;
import java.util.Scanner;
public class EvenOddCheck {
    public static void check(int a){
        if(a%2==0){
           System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num1= sc.nextInt();
        check( num1);
    }
}
