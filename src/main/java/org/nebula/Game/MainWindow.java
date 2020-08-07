package org.nebula.Game;

import org.nebula.Game.FrameListeners.WKeyListener;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MainWindow {

    /*
    mode
    0 = MENU
    1 = GAME Used by WKeyListener

    selectedMenuOption
    0 = First option
     */
    public int mode = 0;
    public int MODEMENU = 0;
    public int MODEGAME = 1;
    public int selectedMenuOption = 0;
    public int maximumMenuOptions = 3;

    public JFrame frame;
    public WKeyListener keyListener = new WKeyListener(this);
    private final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    public int width = screenSize.width * 2/3, height = screenSize.height * 2/3;
    public List<Component> componentList = new ArrayList<Component>();

    public MainWindow(){
        frame = new JFrame();
        frame.setPreferredSize(new Dimension( width , height ));
        frame.addKeyListener( keyListener );
    }
    public void updateComponents()
    {
        frame.removeAll();
    }
    public void loadComponents()
    {
        for(Component c : componentList){  frame.add(c);  }
    }

    public void setVisible(boolean v)
    {
        frame.setVisible(v);
    }

    public void add(Component component)
    {
        frame.add(component);
    }

    public void remove(Component component)
    {
        frame.remove(component);
    }

    // MENU METHODS
    /*
    Methods called by up/down key listeners
    menuOpUp(),
    MenuOpDown(),
    menuSelectOption
     */
    public void menuOpUp(){
        selectedMenuOption--;
        if(selectedMenuOption<0){ selectedMenuOption = maximumMenuOptions; }
    }
    public void menuOpDown(){
        selectedMenuOption++;
        if(selectedMenuOption>maximumMenuOptions){ selectedMenuOption = 0; }
    }
    public void menuSelectOption(){
        //
    }

}
