package com.mycompany.app;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private static final boolean False = false;
	/**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        System.out.println("Should Answer With True");
    }
    @Test
    public void shouldAnswerWithfalse()
    {
        assertFalse( false );
        System.out.println("Should Answer With False");
    }
}
