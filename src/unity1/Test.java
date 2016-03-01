/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity1;

/**
 *
 * @author MARIAJOSE
 */
public class Test {
    public static void main(String[] args){
        
        
        List l = new List();
        l.add(5);
        l.add(10);
        l.add(15);
        System.out.print("initial values:");
        l.print();        
        int c= l.count();
//        System.out.println("Total Nodes:" +c);
//        l.printFirstElement();
//        l.printLastElement();
//        System.out.println("Remove First element");
//        l.removefirstelement();
//        l.print();
//        System.out.println("Remove last element");        
//        l.removelastelement();
//        l.print();
        System.out.println("Duplicating...");
        l.duplicate();
        System.out.println("Vaulues after duplication:");
        l.print();
    }
    
}