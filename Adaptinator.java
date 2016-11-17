// Jack Roboski

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Adaptinator extends KeyAdapter{
    
    MyUnit u;
    
    public Adaptinator(MyUnit unit){
        u = unit;
    }
    
    public void keyPressed(KeyEvent e){
        u.keyPressed(e);
    }
    public void keyReleased(KeyEvent e){
        u.keyReleased(e);
    }
}
