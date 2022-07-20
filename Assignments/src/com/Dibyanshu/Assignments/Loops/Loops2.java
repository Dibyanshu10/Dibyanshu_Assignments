package com.Dibyanshu.Assignments.Loops;

import java.util.Scanner;

public class Loops2 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Reverse order of natural number from " + n +" is");
        while(n>0)
        {
            System.out.println(n);
            n--;
        }

    }
}


