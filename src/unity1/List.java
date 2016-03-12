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

    private Node head;
    private Node aux;
    private int c;
    private Node p;

    public List() {
        head = null;
    }

    public void add(int d) {
        Node n = new Node(d);
        if (head == null) {
            head = n;
        } else {
            Node aux = head;
            while (aux.Next != null) {
                aux = aux.Next;
            }
            aux.Next = n;
        }
    }

    public void print() {
        Node aux = head;
        while (aux != null) {
            System.out.print(" " + aux.data);
            aux = aux.Next;
        }
        System.out.println();

    }

    public int remove(int i) {
        if (head == null) {

        } else if (i == 0) {
            head = head.Next;
        }
        Node aux = head, p = null;
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
        if (head == null) {
            return;
        } else {
            head = head.Next;
        }
    }

    public void removelastelement() {

        Node aux = head;
        Node p = null;
        while (aux.Next != null) {
            p = aux;
            aux = aux.Next;
        }
        p.Next = null;
    }

    public int count() {
        Node aux = head;
        int counter = 0;
        while (aux != null) {
            counter++;
            aux = aux.Next;
        }
        return counter;
    }

    
    public void printFirstElement() {
        if (head == null) {
            System.out.println("-1");
        } else {
            System.out.println("The first value is: " + head.data);
        }
    }

    
    public void printLastElement() {
        if (head == null) {
            System.out.println("-1");
        } else {
            Node aux = head;
            while (aux.Next != null) {
                aux = aux.Next;
            }
            System.out.println("The last value is:" + aux.data);
        }
    }

    
    public void duplicate() {
        if (head == null) {
            return;
        }
        Node last = head,aux=head;
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
            head=head.Next;
            aux.Next=head2;
            head2=aux;
        }
        head=head2;
    }
    
    
    public void eliminarintercalado(){
        for (int i=0; i<c; i++){
            if(i%2==1){
                p.Next=aux.Next;
            }
            p=aux;
            aux=aux.Next;
        }
    }
    
    
    public void Duplicarintercalado(){
        for(int i=0; i<c; i++){
            Node n=new Node(aux.data);
            n.Next=aux.Next;
            aux.Next=n;
            aux=n.Next;
        }
    }
    
    public void BorrarDuplicados(){
        Node p,aux = null,back=head;
        
        while(aux.Next!=null){
            p=head;
            while(p!=aux){
                if(p.data==aux.data){
                    back.Next=aux.Next;
                }
                p=p.Next;
            }
            back=aux;
            aux=aux.Next;
        }
    }
    
    
   
    
            
}
