//Jack Roboski

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



public class MouseAdaptation extends MouseAdapter {
    MyUnit u;
    
    public MouseAdaptation(MyUnit unit){
        u = unit;
    }
    
    public void mousePressed(MouseEvent e){
        u.mousePressed(e);
    }
    public void mouseReleased(MouseEvent e){
        u.mouseReleased(e);
    }
    public void mouseClicked(MouseEvent e){
        u.mouseClicked(e);
    }
    
}
