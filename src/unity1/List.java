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
public class List {

    private Node header;

    public List() {
        header = null;
    }

    public void add(int d) {
        Node n = new Node(d);
        if (header == null) {
            header = n;
        } else {
            Node aux = header;
            while (aux.Next != null) {
                aux = aux.Next;
            }
            aux.Next = n;
        }
    }

    public void print() {
        Node aux = header;
        while (aux != null) {
            System.out.print(" " + aux.data);
            aux = aux.Next;
        }
        System.out.println();

    }

    public int remove(int i) {
        if (header == null) {

        } else if (i == 0) {
            header = header.Next;
        }
        Node aux = header, p = null;
        int counter = 0;
        for (; counter < i && aux != null; counter++) {
            p = aux;
            aux = aux.Next;
        }
        if (aux != null) {
            p.Next = aux.Next;

        }
        return aux.data;
    }

    public void removefirstelement() {
        if (header == null) {
            return;
        } else {
            header = header.Next;
        }

    }

    public void removelastelement() {

        Node aux = header;
        Node p = null;
        while (aux.Next != null) {
            p = aux;
            aux = aux.Next;
        }
        p.Next = null;
    }

    public int count() {
        Node aux = header;
        int counter = 0;
        while (aux != null) {
            counter++;
            aux = aux.Next;
        }
        return counter;

    }

    public void printFirstElement() {
        if (header == null) {
            System.out.println("-1");
        } else {
            System.out.println("The first value is: " + header.data);
        }

    }

    public void printLastElement() {
        if (header == null) {
            System.out.println("-1");
        } else {
            Node aux = header;

            while (aux.Next != null) {
                aux = aux.Next;
            }
            System.out.println("The last value is:" + aux.data);
        }
    }

    public void duplicate() {
        if (header == null) {
            return;
        }
        Node last = header,aux=header;
        while (last.Next != null) {
            last = last.Next;
        }
        int c = count();
        for(int i=0; i<c; i++){
            last.Next=new Node(aux.data);
            aux=aux.Next;
            last=last.Next;
        }
    }
    public void duplicatemirror(){
        
    } 
    
    public void ReversPrint(){
        if (head == null) return;
        Node ok = null, aux;
        do {
            aux = head;
            while (aux.next != ok){
                aux=aux.Next;
            }
            System.out.print(" "+ aux.data);
            ok=aux;
        }while (ok!=head);
         
    }
    
    public void Invert (){
        if (head== null) return;
        
        Node aux= head, head2 = null;
        while (head!=null){
            aux=head;
            head=head.next;
            aux.Next=head2;
            head2=aux;
        }
        head=head2;
    }
}
