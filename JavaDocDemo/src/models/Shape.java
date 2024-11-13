/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * An abstract class representing various kinds of shapes.
 * @author tapaswi
 * @version 6.0
 * @since version 1.0
 */
public abstract class Shape {
    
    /** 
     * The x-coordinate of this shape. 
     */
    private int x;

    /**
     * Returns the value of x-coordinate
     * @return int - the x value
     */
    public int getX() {
        return x;
    }

    /**
     * setting the x coordinate
     * @param x the <code>x</code> coordinate to set
     * @param y the <code>Y</code> coordinate to set
     * 
     */
    public void setX(int x, int y) {
        this.x = x;
    }
    
    
}
