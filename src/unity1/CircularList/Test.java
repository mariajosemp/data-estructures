/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity1.CircularList;

import java.util.Random;

/**
 *
 * @author AULA1
 */
public class Test {
    public static void main (String args[]){
        
        List cl = new List();
        
        Random r = new Random();
        
        for (int i = 0; i < 15; i++){
            cl.add(r.nextInt(100));
        }
        cl.print();
        
        System.out.println("Lista Original");
        cl.print();
        
        System.out.println("Insertando un 7 al inicio");
        cl.insertFirst(7);
        cl.print();
        
        System.out.println("Moviendo el primero al final");
        cl.moveFirstToLast();
        cl.print();
        
        System.out.println("Moviendo el ultimo al primero");
        cl.moveLastToFirst();
        cl.print();
        
        System.out.println("Moving the first end");
        cl.moveFirstToEnd();
        cl.print();
        
        System.out.println("Moving the last to first...");
        cl.moveLastToBegining();
        cl.print();
        
        System.out.println("Inserting a 37 to start...");
        cl.insertFirst(37);
        cl.print();
    }
}
