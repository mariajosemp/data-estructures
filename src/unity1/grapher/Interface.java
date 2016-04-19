/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unity1.grapher;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

/**
 *
 * @author MARIAJOSE
 */
public class Interface extends JFrame{
    
    private Graph graph;
    
    public Interface(){
        setTitle("Grapher");
        setSize(400,400);
        launchWidgets();
        launchEvents();
        setVisible(true);
    }
    private void launchWidgets(){
        graph = new Graph();//nuevo grafico guarda ptos
        add(graph);
    }
    private void launchEvents(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        graph.addMouseMotionListener(new MouseMotionListener() {

            @Override
            public void mouseDragged(MouseEvent e) {
                graph.addCoordinate(e.getX(),e.getY());
                repaint();
            }
            @Override
            public void mouseMoved(MouseEvent e) {
            }
        });
        
        this.addKeyListener(new KeyListener() {

            public void keyTyped(KeyEvent e) {                
            }

            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE){
                    graph.removeLast();
                    repaint();
                }
            }

            public void keyReleased(KeyEvent e) {
            }
        });
    }
    
    public static void main(String[] args){
        new Interface();
        
    }
}
