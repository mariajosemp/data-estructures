/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DoubleList;

/**
 *
 * @author MARIA JOSE
 */
public class List {
    private Node head;
    private Node aux;
    private int c;

    public List() {
        head=null;
    }
    
    public void add(int d){
        Node n=new Node(d);
        if(head==null){
            head=n;
        }
        else{
            Node aux=head;
            while(aux.next!=null){
                aux=aux.next;
            }
            aux.next=n;
            n.back=aux;
        }
    }
    
    public void Print(){
        Node aux = head;
        while (aux != null) {
            System.out.print(" " + aux.data);
            aux = aux.next;
        }
        System.out.println();
    }
    
    public void ReversePrint(){
        if(head==null)return;
        Node aux=head;
        while(aux.next!=null){
            aux=aux.next;
        }
        while(aux!=null){
            System.out.println(" "+aux.data);
            aux=aux.back;
        }
    }
    
    public void Push(int d){
         Node n=new Node(d);
         if(head==null){
            head=n;
    }
         else{
             n.next=head;
             head.back=n;
             head=n;
         }
  }
}


