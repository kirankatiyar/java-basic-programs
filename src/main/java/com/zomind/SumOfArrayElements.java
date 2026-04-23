package com.zomind;
import java.util.Scanner;
public class SumOfArrayElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int sum =0;
        System.out.println("User enter element");
        for(int i=0;i<5;i++){
            a[i]= sc.nextInt();
        }
        for(int j=0;j<5;j++){
            sum = sum + a[j];
        }
        System.out.print("Sum of element = "+sum);
    }
}
