package de.gbsschulen.app;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        List<String> myList = Arrays.asList("element1","element2","element3");
        myList.forEach(new Consumer<String>() {
            public void accept(String element) {
                System.out.println(element);
            }
        });      
    }
}
