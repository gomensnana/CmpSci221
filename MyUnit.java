// Jack Roboski 
//- Parent Class for unit type creations

import javax.swing.ImageIcon;

import java.util.ArrayList;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.Rectangle;
import java.awt.Point;

import javax.swing.JOptionPane;


public class MyUnit {

    public static int attack;
    public static int defense;
    public static int health;
    
    public static int x; // location on grid, for now all units will be 20x10 rects
    public static int y;
    

    
    public MyUnit(int xX, int yY){
        attack = 5;
        defense = 10;
        health = 10;
        
        x = xX;
        y = yY;
    }
    
    public static Image getPlayerImg(){
        ImageIcon ic = new ImageIcon("C:\\Users\\Gomensnana\\Desktop\\Demo.png");
        return ic.getImage();
    }
    

    public void mouseClicked(MouseEvent e) {
        
    }

    

    public int mousePressed(MouseEvent e){
        Point m1 = new Point(e.getX(),e.getY());
        
        if(m1.getX() <= x+40 && m1.getX() >=x && m1.getY() <= y+20 && m1.getY() >= y){
            return 1;
        }
        else{
            return -1;
        }
        
        
    }    


    public void mouseReleased(MouseEvent e){
        Point m1 = new Point(e.getX(),e.getY());
        
        if(m1.getX() <= x+80 && m1.getX() > x+40 && m1.getY() <= y+40 
                && m1.getY() > y+20){
            this.movement(1);
        }
    }

    
    public static void update(){

    }
    
    public static void draw(Graphics2D g2d){
        g2d.drawImage(getPlayerImg(), x, y,null);
        //g2d.draw(getBounds());
    }
    
    public static void movement(int test){
        if(test == 1){
            x +=40; y += 20;
        }
    }
    


}
