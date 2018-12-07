package com.spsa.media.utils;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class FileNameCleanerTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
	FileNameCleaner cleaner = new FileNameCleaner();
    public FileNameCleanerTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( FileNameCleanerTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	String sampleFileName = "Sowkiyama - Sangamam - TamilWire.com.mp3";
    	String modifiedName = cleaner.getCleanedFileName(sampleFileName);
        assertEquals("Sowkiyama - Sangamam.mp3", modifiedName);
    }
}
