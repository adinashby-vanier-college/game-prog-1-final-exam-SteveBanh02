// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Ladybug extends Actor
{

    /**
     * Act - do whatever the Hero wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        transitionToGameWon();
        transitionToGameLost();
    }

    /**
     * method for making the lady bug move
     */
    public void move()
    {
        if (Greenfoot.isKeyDown("left")) {
            move(2);
        }
        if (Greenfoot.isKeyDown("right")) {
            move(-2);
        }
        if (Greenfoot.isKeyDown("up")) {
            turn(2);
        }
        if (Greenfoot.isKeyDown("down")) {
            turn(-2);
        }
    }

    /**
     * transition to GameWon when the ladybug intersects with the finishLocation and start playing the winning sound
     */
    public void transitionToGameWon()
    {
        Actor target = getOneIntersectingObject(FinishLocation.class);
        if (target != null) {
            World gameWon =  new  GameWon();
            gameWon.started();
            Greenfoot.setWorld(gameWon);
        }
    }

    /**
     * transition to GameLost when the ladybug intersects with a cannonBall and start playing the losing sound
     */
    public void transitionToGameLost()
    {
        Actor cannonBall = getOneIntersectingObject(CannonBall.class);
        if (cannonBall != null) {
            World gameLost =  new  GameLost();
            gameLost.started();
            Greenfoot.setWorld(gameLost);
        }
    }
}
