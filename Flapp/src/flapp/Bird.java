
package flapp;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Image;

public class Bird {
	//global variables
	private Image flappyBird;
	private int xLoc = 0, yLoc = 0;
	
	/**
	 * Default constructor
	 */
	public Bird(int initialWidth, int initialHeight) {
		flappyBird = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("blue_bird.png"));
		scaleBird(initialWidth, initialHeight);
	}
	
	/**
	 * Method to scale the bird sprite into the desired dimensions
	 * @param width The desired width of the flappy bird
	 * @param height The desired height of the flappy bird
	 */
	public void scaleBird(int width, int height) {
		flappyBird = flappyBird.getScaledInstance(width, height, Image.SCALE_SMOOTH);		
	}
	
	/**
	 * Getter method for the flappyBird object.
	 * @return Image
	 */
	public Image getBird() {
		return flappyBird;
	}
	
	/**
	 * Method to obtain the width of the Bird object
	 * @return int
	 */
	public int getWidth() {
	      return flappyBird.getWidth(null); //return -1 if the width not yet known
	}
	
	/**
	 * Method to obtain the height of the Bird object
	 * @return int
	 */
	public int getHeight() {
              return flappyBird.getHeight(null);
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
		return (new Rectangle(xLoc, yLoc, getWidth()-20, getHeight()-22));
	}


}
