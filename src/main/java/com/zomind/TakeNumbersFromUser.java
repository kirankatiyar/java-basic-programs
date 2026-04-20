//Take 5 numbers from user and print them
package com.zomind;
import java.util.Scanner;
public class TakeNumbersFromUser {
    static int[] a = new int[5];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("User enter 5 numbers");
        for(int i=0;i<=4;i++){
            a[i]= sc.nextInt();
        }
        for(int i=0;i<=4;i++){
            System.out.print(a[i]+",");
        }

    }
}
