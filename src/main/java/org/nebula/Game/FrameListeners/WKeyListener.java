package org.nebula.Game.FrameListeners;

import org.nebula.Game.MainWindow;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

// TODO: Add Controls
public class WKeyListener implements KeyListener {

    private final MainWindow window;

    public WKeyListener(MainWindow w)
    {
        window = w;
    }

    public void keyTyped(KeyEvent e)
    {
        int code = e.getKeyCode();
    }

    public void keyPressed(KeyEvent e)
    {
        int code = e.getKeyCode();
    }

    public void keyReleased(KeyEvent e)
    {
        int code = e.getKeyCode();

        switch(code){
            case KeyEvent.VK_UP:
                up();
            case KeyEvent.VK_DOWN:
                down();
            case KeyEvent.VK_ENTER:
                enter();
        }
    }

    public void up()
    {
        if(window.mode == window.MODEMENU)
        {
            window.menuOpUp();
        }
    }
    public void down()
    {
        if(window.mode == window.MODEMENU)
        {
            window.menuOpDown();
        }
    }
    public void enter()
    {
        if(window.mode == window.MODEMENU)
        {
            window.menuSelectOption();
        }
    }

}
