/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity1.CircularList;

/**
 *
 * @author AULA1
 */
public class Node {
     protected int value;
    protected Node next;
    
    public Node(int v){
        
        value = v;
        next = this;
        
    }
    
}
