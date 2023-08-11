/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package es;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jhons
 */
public class WhiteBoxTestTest {

    
    @Test 
    public void testАMethod1() {
        WhiteBoxTest instance = new WhiteBoxTest();  
        assertEquals(instance.aMethod(true, false, true),2);
    }
    
    /*** Camino 2. a=T, b=F, C=F / ret = 0.*/
    @Test 
    public void testАMethod2() {
        WhiteBoxTest instance = new WhiteBoxTest();  
        assertEquals(instance.aMethod(true, false, false),0);
    }
    
    /** Camino 3. a=T, b=T, C=? / ret = 1.*/
    @Test 
    public void testАMethod3() {
        WhiteBoxTest instance = new WhiteBoxTest(); 
        assertEquals(instance.aMethod(true, true, false),1);
    }
    /** Camino 4. a=F, b=F, c=? / ret = 0. */
    @Test 
    public void testMethod4() {
        WhiteBoxTest instance = new WhiteBoxTest(); 
        assertEquals(instance.aMethod(false, false, false),0);
    }

}
