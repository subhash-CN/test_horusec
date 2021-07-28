package com.mycompany.app;
import java.util.Random;

public class App 
{
    public static void main( String[] args )
    {
        String s = "" + 123;                // inefficient
String t = Integer.toString(456);   // preferred approach
        
        Random rand = new Random();
        System.out.println(rand.nextInt(50));
        System.out.println( "Hello World!" );
    }
}
