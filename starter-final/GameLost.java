// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameLost extends World
{
    private GreenfootSound gameMusic;

    /**
     * Constructor for objects of class GameWon. for displaying the message and play the losing sound
     */
    public GameLost()
    {
        super(600, 400, 1);
        showText("Game Over", 180, 200);
        gameMusic =  new  GreenfootSound("lose.wav");
    }

    /**
     * method to call in another class to start playing the losing sound
     */
    public void started()
    {
        gameMusic.play();
    }

    /**
     * 
     */
    public void stopped()
    {
        gameMusic.stop();
    }

    /**
     * method to display a losing text
     */
    public void showText(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(50);
        bg.setFont(font);
        bg.setColor(Color.WHITE);
        bg.drawString(message, x, y);
    }
}
