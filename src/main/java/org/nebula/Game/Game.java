package org.nebula.Game;

import org.lwjgl.Version;

import javax.swing.*;
import java.awt.*;

import static java.lang.Thread.sleep;

public class Game {

    /*
    A 2D Space Game
    - - - - - - - -
    The player will:

    - Move through planets
    - Encounter different aliens - good or neutral or bad. Some may disguise.
    - Find helpful clues and items.
    - Encounter bosses.
    - Be able to invent new items / weapons using material they've gathered from levels.
    *   Such as:
        - New weapons.
        - Anything else I can think of.

    Objectives of levels:
    - Find and collect hidden or guarded items.

    */

    public boolean running;

    public static void main(String[] args) {

    }

    public void startGame() {
        init();
        gameLoop();
        dispose();
    }

    public void init() {
        MainWindow window = new MainWindow();
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.BLACK);
        window.add(mainPanel);

        System.out.println("LWJGL Version " + Version.getVersion() + " is working.");

        window.setVisible(true);
    }

    public void dispose(){}

    public void gameLoop() {
        long sleepTime = 1000L / 60L;// 16ms

        while (running) {
            float delta = timer.getDelta();

            input();
            update();
            render();

            sleep(sleepTime);
        }
    }

    private void render() {
    }

    private void update() {
    }

    private void input() {
    }

    public void sleep(long sT){
        try {
            Thread.sleep(sT);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
