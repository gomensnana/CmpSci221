// Jack Roboski

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;


public class MouseEventsDemo1 extends JFrame implements MouseListener
{
    private int x;              // x coordinate of mouse event
    private int y;              // y coordinate of mouse event
    private int[][] square = new int[3][3];	  // tic tac toe square row 1 column 1
    private int playerTurn;     // player turn - 1 if X, -1 if O


    public MouseEventsDemo1()         
    {
        addMouseListener(this);            // listen for mouse events
        playerTurn = 3;

    }


    @Override
    public void paint(Graphics g)                       
    {
       super.paint(g);
       g.setColor(Color.ORANGE);
       g.fillRect(0,0,500,400);


       
       for(int i=0;i<3;i++){
           for(int j=0;j<3;j++){
       if(square[i][j]==1){
           g.setColor(Color.BLACK);
           g.fillRect(x, y, 30, 40);
       }
       
       else if(square[i][j]==0){
           g.setColor(Color.BLUE);
           g.fillRect(x, y, 30, 40);
       }
    }
       }
    }


    public void mouseClicked(MouseEvent e)          // save coordinates of clicks
    {
    }
    
    public void mousePressed(MouseEvent e)
    {
    }    


    public void mouseReleased(MouseEvent e)
    {
               x = e.getX();
       y = e.getY();
       
       for(int i=0;i<3;i++){
           for(int j=0;j<3;j++){
       if(playerTurn%2==1){
           square[i][j]=playerTurn%2;
       }
       
       if(playerTurn%2==0){
           square[i][j]=playerTurn%2;
       }
       
       playerTurn= playerTurn+1;
       repaint();
       }
       }
    }


    public void mouseEntered(MouseEvent e)
    {
    }


    public void mouseExited(MouseEvent e)
    {
    }
    
    public static void main(String[] args)
    {
       MouseEventsDemo1 prog = new MouseEventsDemo1();
       prog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       prog.setSize(500, 400);
       prog.setVisible(true);
    }   
}




