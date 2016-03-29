/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CircularList;

/**
 *
 * @author AULA1
 */
public class List {
    private Node head;
    
    public List(){
    
        head = null;
    
    }
        public void add (int v){
            
            Node n = new Node(v);
            
            if (head == null){
                head = n;
            }else{
                Node aux = head;
                
                while (aux.next != head){
                    aux = aux.next;
                }
                n.next = head;
                aux.next = n;
            }
            
            
        }
        
        public void print(){
            
            if(head == null) return;
            
            Node aux = head;
            
            do {
            System.out.print(" "+aux.value);
            aux = aux.next;
            }while(aux != head);
            System.out.println(); 
            
        }
        
        public void insertFirst(int v){
            
            Node n = new Node(v);
            
            if (head == null){
                head = n;
            }else{
                Node aux = head;
                
                while (aux.next != head){
                    aux = aux.next;
                }
                n.next = head;
                aux.next = n;
                head = n;
            }
        }
        
        public void moveFirstToLast(){
            
            if(head == null) return;
            
            if(head != null){
                head = head.next;
            }
        }
        
        public void moveLastToFirst(){
            
            if (head == null) return;
            
            Node aux = head;
            
            while (aux.next != head){
                aux = aux.next;
            }
            head = aux;
        }
        
        public void moveFirstToEnd() {

        if (head == null) {
            return;
        }
        if (head != null) {
            head = head.next;
        }
        
    }

    public void moveLastToBegining() {

        if (head == null) {
            return;
        }
        Node aux = head;
        while (aux.next != head) {
            aux = aux.next;
        }
        head = aux;
        
    }
        
}
