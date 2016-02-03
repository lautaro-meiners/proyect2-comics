package com.globant.academy.proyect2_comics;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner input = new Scanner(System.in);
        
        int  i =input.nextInt();
        
        Admin test = new Admin();
        test.adminActivity(i);
        input.close();
    }
}
