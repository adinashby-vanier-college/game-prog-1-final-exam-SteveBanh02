// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * Write a description of class Point2D here.
 */
public class Point2D
{
    /* Instance variables - replace the example below with your own*/
    private double x;
    private double y;

    /**
     * Constructor for objects of class Point2D
     */
    public Point2D(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    /**
     * 
     */
    public double getX()
    {
        return x;
    }

    /**
     * 
     */
    public double getY()
    {
        return y;
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public void add(Vector2D v)
    {
        x = x + v.getX();
        y = y + v.getY();
    }
}
