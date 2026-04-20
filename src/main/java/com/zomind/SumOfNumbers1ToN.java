package com.zomind;
import java.util.Scanner;
public class SumOfNumbers1ToN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("enter array size=");
        n= sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Sum  of "   +n+   " numbers=  ");
        int sum =0;
        for(int i=0;i<n;i++){
            sum =sum+a[i];
        }
        System.out.print(sum);
    }
}
