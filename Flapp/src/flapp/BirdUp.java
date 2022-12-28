/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flapp;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

/**
 *
 * @author Dell
 */
public class BirdUp {
	//global variables
	private Image flappyBirdUp;
	private int xLoc = 0, yLoc = 0;
	
	/**
	 * Default constructor
	 */
	public BirdUp(int initialWidth, int initialHeight) {
		flappyBirdUp = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("blue_bird_up.png"));
		scaleBird(initialWidth, initialHeight);
	}
	
	/**
	 * Method to scale the bird sprite into the desired dimensions
	 * @param width The desired width of the flappy bird
	 * @param height The desired height of the flappy bird
	 */
	public void scaleBird(int width, int height) {
		flappyBirdUp = flappyBirdUp.getScaledInstance(width, height, Image.SCALE_SMOOTH);		
	}
	
	/**
	 * Getter method for the flappyBird object.
	 * @return Image
	 */
	public Image getBird() {
		return flappyBirdUp;
	}
	
	/**
	 * Method to obtain the width of the Bird object
	 * @return int
	 */
	public int getWidth() {
	      return flappyBirdUp.getWidth(null); //return -1 if the width not yet known
	}
	
	/**
	 * Method to obtain the height of the Bird object
	 * @return int
	 */
	public int getHeight() {
              return flappyBirdUp.getHeight(null);
	}
	
	/**
	 * Method to set the x location of the Bird object
	 * @param x
	 */
	public void setX(int x) {
		xLoc = x;
	}
	
	/**
	 * Method to get the x location of the Bird object
	 * @return int
	 */
	public int getX() {
		return xLoc;
	}
	
	/**
	 * Method to set the y location of the Bird object
	 * @param y
	 */
	public void setY(int y) {
		yLoc = y;
	}
	
	/**
	 * Method to get the y location of the Bird object
	 * @return int
	 */
	public int getY() {
		return yLoc;
	}
	
	/**
	 * Method used to acquire a Rectangle that outlines the Bird's image
	 * @return Rectangle outlining the bird's position on screen
	 */
	public Rectangle getRectangle() {
		return (new Rectangle(xLoc, yLoc, getWidth(), getHeight()));
	}
	
	/**
	 * Method to acquire a BufferedImage that represents the Bird's image object
	 * @return Bird's BufferedImage object
	 */

}