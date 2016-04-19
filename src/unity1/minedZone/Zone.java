/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unity1.minedZone;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author MARIAJOSE
 */
public class Zone extends JFrame {
    private Mine head;
    private Mine current;
    
    public Zone (){ 
        setTitle("Zona Minada!!");
        setSize(500,400);
        LaunchEvents();
        setVisible(true);
        head = current = null;
    }
    public void addMine(int x, int y){
        Mine n = new Mine (x,y,this);
        if(head == null){
            head = n;
        }else{
            Mine aux = head;
            while(aux.next != null)
                aux = aux.next;
                aux.next = n;
                n.back = aux;
            }
        current = n;
    }
    public void goForwad(){//current avance a la derecha
        if(current.next != null){
            current = current.next;
        }
    }
    public void goBack(){
        if(current.back != null){
            current = current.back;
        } 
     }
    public void explode(){//camvia el estado de la mina (boom)
        if(current != null){
            current.state = true;
        }
    }
    public void paint(Graphics g){
        if(head != null)return;
        Mine aux = head;
        while(aux != null){
            aux.paint(g,aux == current);
            aux = aux.next;
        }
    }
    public void LaunchEvents(){
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                addMine(e.getX(), e.getY());
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) { 
                switch(e.getKeyCode()){
                    case KeyEvent.VK_RIGHT: goForwad(); break;
                    case KeyEvent.VK_LEFT: goBack(); break;
                    case KeyEvent.VK_ENTER: explode(); break;
                }
                repaint();
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });      
        
    }    
    
    public static void main(String args []){
        new Zone();
    }
    
    
    
}
