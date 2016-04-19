/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unity1.SimpleStructures;

/**
 *
 * @author MARIAJOSE
 */
public class List {
    
    private Node head;
    
    public List(){
        head = null;        
    }
    
    public void add(int d){
        Node n = new Node(d);
        if(head == null){
            head = n;
        }else{
            Node aux = head;
            while (aux.next != null){
                aux = aux.next;
            }
            aux.next=n;
        }
    }
    public void print(){
        Node aux = head;
        while(aux != null){
            System.out.print(" "+aux.data);
            aux = aux.next;
        }
        System.out.println();
    }
    public void duplicate(){ 
        if(head == null) return;
        Node last = head;
        Node aux = head;
        while(last.next != null){
            last = last.next;            
        }  
        int c = count();
        for (int i = 0; i < c ; i++) {
            last.next = new Node(aux.data);
            aux = aux.next;
            last = last.next;
        }    
    }
    public void duplicateMirror(){
        if(head == null) return;
        Node last = head;
        Node aux = head;
        while(last.next != null){
            last = last.next;
        }
        int c = count();
        for (int i = 0; i < c; i++) {
            Node n = new Node(aux.data);
            n.next = last.next;
            last.next = n;
            aux=aux.next;
        }        
    }    
    public int remove(int i){
        if(head == null){
            return -1;
        }
        if(i==0){
            head = head.next;
            return 0;
        }
        Node aux = head, p = null;       
        int counter = 0;
        for(;counter < i && aux != null;counter++){
            p = aux;
            aux = aux.next;
        }
        if(aux != null){
            p.next = aux.next;
        }       
        return aux.data;        
    }    
    public void removeFirstElement(){
        if(head == null)return;
        head = head.next;
    }    
    public void removeLastElement(){
        if(head != null){
            Node aux = head;
            Node p = null;
            if(head.next == null){
                head = head.next;
            }else{
                while (aux.next != null){
                    p=aux;
                    aux=aux.next;
                }
                p.next = aux.next;
            } 
        }
    }    
    public int count(){
        Node aux = head;
        int conter=0;
        while(aux != null){
            conter++;
            aux = aux.next;
        }
        return conter;        
    }
    public void printFirstElement(){
        Node aux = head;        
        if(head == null){
            System.out.println("-1");
        }else{
            System.out.println(""+aux.data);
        }        
    }
    public void printLastElement(){
        Node aux = head;  
        while(aux.next != null){
            aux = aux.next;
        }
        System.out.println(""+aux.data);
    }            
    public void removeDuplicated(){
        Node aux = head,p = head;
        for (int i = 0; i < count(); i++) {
            if(i %2 == 0){
                p.next = aux.next;
                p = aux;
                aux = aux.next;
            }else{
                aux = aux.next;
            }
        }    
    }
    public void duplicateIntercalated(){
        if(head == null) return;
        Node aux = head, p = head;
        while(aux != null){
            Node n = new Node(p.data);
            aux = aux.next;
            p.next = n;
            n.next = aux;
            p = aux;
        }  
    }
    public void removeRecurrents(){
        Node aux = head, p = head, back = head;
        while(aux.next != null){
            p = head;
            while(p != null){
                if(p.data == aux.data){
                    back.next = aux.next;                    
                }
                p = p.next;
            }
        }
        back = aux;
        aux = aux.next;
    }
    
    public void insertZeros(){
        if(head == null) return;
        Node aux = head, p = head;
        while(aux.next != null){
            Node n = new Node(0);
            aux = aux.next;
            p.next = n;
            n.next = aux;
            p = aux;
        }  
        
    }    
    public void removeMiddle(){        
        if(head == null)return;
        int cont = 1;
        int c = count()/2;
        Node aux = head;
        while(aux != null){
            cont++;            
            aux = aux.next;            
            if(cont == c){
                aux.next = aux.next.next;
            }            
        }        
    }
       
    public int countOdds(){
        Node aux = head;
        int conter = 0;
        while(aux.next != null){
            if(aux.data %2 ==1){
                conter++;
            }            
            aux = aux.next;
        }
        return conter;        
    }
    
}
