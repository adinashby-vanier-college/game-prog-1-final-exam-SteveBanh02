// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameWon extends World
{
    private GreenfootSound gameMusic;

    /**
     * Constructor for objects of class GameWon. for displaying the message and play the winning sound
     */
    public GameWon()
    {
        super(600, 400, 1);
        showText("Congratulations, You Win!", 140, 200);
        gameMusic =  new  GreenfootSound("win.wav");
    }

    /**
     * method to call in another class to start playing the winning sound
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
     * method to display a winning text
     */
    public void showText(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(30);
        bg.setFont(font);
        bg.setColor(Color.WHITE);
        bg.drawString(message, x, y);
    }
}
