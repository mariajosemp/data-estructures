/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity1.doubleCircularList;

/**
 *
 * @author MARIAJOSE
 */
public class List {
    private Node head;
    public List() {
        head = null;
}
    
    public void add(int d) {

        Node n = new Node(d);

        if (head == null) {
            head = n;
        } else {
            n.next = head;
            n.back = head.back;
            head.back.next = n;
            head.back = n;
        }
    }
    
    public void Print (){
        if (head == null){
            return;
        }
        Node aux = head;
        do {
            System.out.print(" " + aux.data);
            aux = aux.next;
        } while (aux != head);
        System.out.println();
    }

    public void moveFirstToEnd() {
        if (head == null) {
            return;
        }
        if (head.next == head) {
            head = null;
        } else {
            head.back.next = head.next;
            head.next.back = head.back;
            head = head.next.back;
        }
    }

    public void moveLastToBeginning() {
        if (head == null) {
            return;
        }
        Node last = head.back;
        Node aux = head;
        do {
            Node n = new Node(aux.data);
            n.next = head;
            n.back = head.back;
            head.back.next = n;
            head.back = n;
            aux = aux.next;
        } while (aux != last.next);
    }

    public void remove() {
        
    }

    public void invert()
        
    
    
}
    
    
