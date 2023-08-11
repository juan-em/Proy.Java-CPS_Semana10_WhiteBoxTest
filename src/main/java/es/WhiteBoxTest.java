/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es;

/**
 *
 * @author jhons
 */
public class WhiteBoxTest {
    
    public int aMethod(boolean a, boolean b, boolean c){
        int ret = 0;  // --> I
        if (a&&b) {   // --> 1 y 2
            ret = 1;  // --> 3
        }else if (c){ // --> 4
            ret =2;   // --> 5
        }
        return ret;   // --> F
    }
    
}
