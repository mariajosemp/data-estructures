/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author MariaJose
 */
public class MainWindow extends JFrame{
    private JButton left , right;
        private JButton viewer;
        private ImageStore images;
        
        public MainWindow(){
            images = new ImageStore();
            setTitle("set de imagenes");
            setSize(200,100);
            LaunchWidgets();
            LaunchEvents();
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
                      
        }
        private void LaunchWidgets(){
          left = new JButton("<");
          right = new JButton(">");
          viewer = new JButton();
          add( left, BorderLayout.WEST);
          add( right, BorderLayout.EAST);
          add( viewer, BorderLayout.CENTER);
          
        }
        private void LaunchEvents(){
          // cuando la ventana se abra, se cargan las imagen de una vez
            File folder = new File("C:\\Users\\AULA1\\Downloads\\icons");
            for ( File file:folder.listFiles()){
                images.add(file.getAbsolutePath());
            }
            viewer.setIcon(images.getCurrent());
            // cuando se presiona el izquierdo
            left.addActionListener(new ActionListener(){@Override
            public void actionPerformed(ActionEvent e){
                if (images.goBack()){
                    viewer.setIcon(images.getCurrent());
                }
            }
        });
            // 
            right.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            });
        }
        
        public static void main(String arg[]){
            new MainWindow();
        
        }
}
    
