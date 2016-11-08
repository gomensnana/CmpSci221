//Jack Roboski
//

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

import java.awt.Point;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.awt.Image;

public class StratGame extends JPanel implements MouseListener,ActionListener{
    
    Timer mainTimer;
    MyUnit unit;
    
    int enemyCount = 5;
    int level = 1;

    static ArrayList<EnemyUnits> enemies = new ArrayList<EnemyUnits>();
    static ArrayList<MyUnit> myUnits = new ArrayList<MyUnit>();
    
    public void StratGame(){
        setFocusable(true);
        

        unit = new MyUnit(150,150);
        addMouseListener(new MouseAdaptation(unit));
        
        mainTimer = new Timer(10, this);
        mainTimer.start();

    }
    
    @Override
    public void actionPerformed(ActionEvent e){}
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        
        unit.draw(g2d);
    }
    

    
    @Override
    public void mousePressed(MouseEvent e){
        unit.movement(1);
        
        repaint();
        
        
    }
    @Override
    public void mouseClicked(MouseEvent e){
        Point m1 = new Point(e.getX(),e.getY());
        
        
            MyUnit.x += 40;
        
        repaint();
    }
    @Override
    public void mouseReleased(MouseEvent e){
        unit.movement(1);
        
        repaint();
        
        
    }
    @Override
    public void mouseEntered(MouseEvent e){
        unit.movement(1);
        
        repaint();
        
        
    }
    @Override
    public void mouseExited(MouseEvent e){
        unit.movement(1);
        
        repaint();
        
        
    }
    
    
}
