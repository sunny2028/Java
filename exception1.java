/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;
import java.util.*;
import java.io.*;
/**
 *
 * @author HP
 */
public class exception1 {
    public static void main(String args[])
    {
        check(2);
    }
    public static void check(int a)
    {
        try
        {
        System.out.println(a/0);
        }
        
        catch(ArithmeticException e)
        {
            System.out.println("Not Possible");
        }
    
}
}
