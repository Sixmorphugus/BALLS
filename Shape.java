import java.io.Serializable;

public class Shape implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 13L;
	private ShapeType controller;
	private double xPosition;			// The X coordinate of centre of this Rectangle
	private double yPosition;			// The Y coordinate of centre of this Rectangle
	
	public Shape(double x, double y,ShapeType controller){
		xPosition=x;
		yPosition=y;
		this.controller=controller;
	}
	
	/**
	 * Obtains the current position of this Rectangle.
	 * @return the X coordinate of this Rectangle within the GameArena.
	 */
	public double getXPosition()
	{
		return xPosition;
	}

	/**
	 * Obtains the current position of this Rectangle.
	 * @return the Y coordinate of this Rectangle within the GameArena.
	 */
	public double getYPosition()
	{
		return yPosition;
	}

	/**
	 * Moves the current position of this Rectangle to the given X co-ordinate
	 * @param x the new x co-ordinate of this Rectangle
	 */
	public void setXPosition(double x)
	{
		this.xPosition = x;
	}

	/**
	 * Moves the current position of this Rectangle to the given Y co-ordinate
	 * @param y the new y co-ordinate of this Rectangle
	 */
	public void setYPosition(double y)
	{
		this.yPosition = y;
	}
	
	/**
	 * Overridable for shapes.
	 * Make your shape do something every frame via an override of this.
	 * @param w The world.
	 */
	public void update(World w) {
		
	}
}
