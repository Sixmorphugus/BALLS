import java.io.Serializable;

/**
 * Shape class is an extension for Ball and Rectangle class,
 * so that both objects rectangle and ball can be called by 
 * Shape superclass. It also shares same methods and variables
 * where relative. E.g. xPosition with get/set methods
 * 
 * @author Kilanth/Chris
 *
 */
public class Shape implements Serializable{
	
	private static final long serialVersionUID = 13L; // For the levels.dat serialization
	private ShapeType controller;		// Controller of the Shape
	private double xPosition;			// The X coordinate of centre of this Rectangle
	private double yPosition;			// The Y coordinate of centre of this Rectangle
	
	/**
	 * Default constructor for a new shape.
	 * 
	 * @param x initial coordinate 
	 * @param y initial coordinate
	 * @param controller for the Shape
	 * @see
	 * ShapeType
	 */
	public Shape(double x, double y,ShapeType controller){
		xPosition=x;
		yPosition=y;
		this.controller=controller;
	}
	
	/**
	 * Obtains the current position of this Shape.
	 * @return the X coordinate of this Shape within the GameArena.
	 */
	public double getXPosition()
	{
		return xPosition;
	}

	/**
	 * Obtains the current position of this Shape.
	 * @return the Y coordinate of this Shape within the GameArena.
	 */
	public double getYPosition()
	{
		return yPosition;
	}

	/**
	 * Moves the current position of this Shape to the given X co-ordinate
	 * @param x the new x co-ordinate of this Shape
	 */
	public void setXPosition(double x)
	{
		this.xPosition = x;
	}

	/**
	 * Moves the current position of this Shape to the given Y co-ordinate
	 * @param y the new y co-ordinate of this Shape
	 */
	public void setYPosition(double y)
	{
		this.yPosition = y;
	}
	
	/**
	 * Overridable for shapes.<br>
	 * Make your shape do something every frame via an override of this.
	 * 
	 * @param w the World.
	 */
	public void update(World w) {
		
	}
}
