package com.zomind;
import java.util.Scanner;
public class FindGreaterNumber {
    public static void check(int a,int b){
        if(a>b){
            System.out.println("greater number="+a);
        }
        else{
            System.out.println("greater number="+b);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two number");
        System.out.print("first number=");
        int num1=sc.nextInt();
        System.out.print("second number=");
        int num2=sc.nextInt();
        check(num1,num2);
    }
}
