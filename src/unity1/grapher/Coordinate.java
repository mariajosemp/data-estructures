/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unity1.grapher;

/**
 *
 * @author MARIAJOSE
 */
public class Coordinate {
    
    protected int x,y;
    protected Coordinate next, back;
    
    public Coordinate(int x, int y){
       this.x = x;
       this.y = y;
       next = back = null;
    }
}
