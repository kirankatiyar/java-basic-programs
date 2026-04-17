//Write a Java program to print numbers in reverse order using a loop.
package com.zomind;
import java.util.Scanner;
public class PrintNumberInReverseOrder {
     static int[] a = new int[5];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 5 number ");
        for( int i=0;i<5;i++){
        a[i] = sc.nextInt();
        }
        System.out.println(" Number in reverse order");
        for (int i = 4; i >=0; i--) {
            System.out.println(a[i]);
        }

        }
    }
