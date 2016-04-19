/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unity1.imagebrowser;

import javax.swing.ImageIcon;

/**
 *
 * @author MARIAJOSE
 */
public class ImageStore {
    
    protected ImageFile head, current;
    
    public void ImageStore(){//constructor apuntando a null
        head = null;
        current = null;
    }
    
    public void add(String name){
        ImageFile n = new ImageFile(name);
        if(head == null){
            head = n;
        }else{
            ImageFile aux = head;
            while (aux.next != null){
                aux = aux.next;
            }
            aux.next = n;
            n.back = aux;
        }
        current = n;
    }
    
    public boolean goForward(){//adelante
        if(current.next != null){//si hay nodos adelante
            current = current.next;
            return true;
        }
        return false;        
    }
    
    public boolean goBack(){
        if(current.back != null){
            current = current.back;
            return true;
        }
        return false;        
    }
    
    public ImageIcon getCurrent(){
        if (current == null){
            return new ImageIcon(); //crea una imagen vacia
        }
        return new ImageIcon(current.name);        
    }
}
