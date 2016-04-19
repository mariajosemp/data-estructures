/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unity1.minedZone;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author MARIAJOSE
 */
public class Mine {
    protected int x;
    protected int y;
    protected boolean state;
    protected Mine next,back;
    protected Zone z;
    
    public Mine(int posx, int posy, Zone zone){
        x = posx;
        y = posy;
        state = false;
        next = null;
        back = null;
        z = zone;
    }
    public void paint (Graphics g, boolean current){
        Image image;
        if(state == false){
            image = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Jose\\Downloads\\images\\mine.png");
        }else{
            image = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Jose\\Downloads\\images\\boom.png");
        }
        g.drawImage(image, x-24, y-24,z);
        if(current == true){
            g.setColor(Color.RED);
        }else{
            g.setColor(Color.WHITE);
        }
        g.drawRect(x-25,y-25,50,50);
    }
}
