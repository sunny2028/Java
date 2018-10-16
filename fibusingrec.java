/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class fibusingrec {
    static int fib(int n)
    {
        if(n<=1)
            return n;
        else
            return fib(n-1)+fib(n-2);
    }
    public static void main(String args[])
    {
        int a=0;
        int b=1;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i;
        for(i=2;i<n;i++)
        {
            System.out.println(fib(i));
        }
    }
}
