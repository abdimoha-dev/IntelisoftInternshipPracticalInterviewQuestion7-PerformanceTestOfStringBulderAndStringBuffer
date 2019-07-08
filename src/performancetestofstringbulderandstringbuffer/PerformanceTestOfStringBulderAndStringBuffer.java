/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package performancetestofstringbulderandstringbuffer;

/**
 *
 * @author Abdi Mohammed
 */
public class PerformanceTestOfStringBulderAndStringBuffer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long startTime = System.currentTimeMillis();  
        StringBuffer sbuffer = new StringBuffer("Intelli");  
        for (int i=0; i<10000; i++){  
            sbuffer.append("Soft");  
        }  
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
        startTime = System.currentTimeMillis();  
        StringBuilder sbuilder = new StringBuilder("Intelli");  
        for (int i=0; i<10000; i++){  
            sbuilder.append("Soft");  
        }  
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms"); 
    }
    
}
