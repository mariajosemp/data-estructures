/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity0;

/**
 *
 * @author MARIAJOSE
 */
public class Stack {
    private int [] data;
    private int top;
    
    public void add (int d){
        data[top]=d;
        top ++;
    }
    public int remove(){
        top --;
        return data[top];
    }
    public void print(){
        //45 99 8 5
        for (int i=0; i<top; i++){
            System.out.print(" "+ data [i]);
        }
    }
    public Stack (){
        data = new int[100];
        top = 0;
    }
}
