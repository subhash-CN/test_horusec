package com.mycompany.app;
import java.util.Random;

public class App 
{
    public static void main( String[] args )
    {
        String s = "" + 123;                // inefficient
String t = Integer.toString(456);   // preferred approach
        
      
        Boolean x =true;
        Boolean y =true;
        if (((x != !y)) || !(x)) {
            System.out.println( "Hello World!" );
        } else {
            System.out.println( "Hello World!" );
        }
        
        if (((x != !y)) && !(x)) {
            System.out.println( "Hello World!" );
        } else {
            System.out.println( "Hello World!" );
        }
        
        if (x || !y){
            System.out.println( "Hello World!" );
        }
        
        if (x) {            // original implementation
            if (y) {
                System.out.println( "Hello World!" );
            }
        }


        if (x) 
            if (y) {
                System.out.println( "Hello World!" );
         }

        
        Random rand = new Random();
        System.out.println(rand.nextInt(50));
        System.out.println( "Hello World!" );
    }
}
