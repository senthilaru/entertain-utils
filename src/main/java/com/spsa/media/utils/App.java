package com.spsa.media.utils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SongFileReader reader = new SongFileReader();
        reader.readFiles("/Users/sarumu1/Documents/Inter/");
    }
}
