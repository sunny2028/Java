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
public class fibonacci {
    public static void main(String args[])
    {
        int a=0;
        int b=1;
        int c=a+b;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i;
        System.out.println(a+"\n"+b+"\n"+c);
        for(i=2;i<n;i++)
        {
            a=b;
            b=c;
            c=a+b;
            System.out.println(c);
        }
    }
}
