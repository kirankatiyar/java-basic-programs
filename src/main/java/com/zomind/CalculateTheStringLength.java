package com.zomind;
import java.util.Scanner;
public class CalculateTheStringLength {
    public static int calculate(String st){
        int lenth = st.length();
        return lenth;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your String");
        String str = sc.next();
        System.out.println(" your Sting is..."+str);
        int a = calculate(str);
        System.out.println("Your string length is..."+a);
    }

}
