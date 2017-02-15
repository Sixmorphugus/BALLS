
public class Shape {

	private double xPosition;			// The X coordinate of centre of this Rectangle
	private double yPosition;			// The Y coordinate of centre of this Rectangle
	
	public Shape(double x, double y){
		xPosition=x;
		yPosition=y;
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
	 * Overridable for custom shapes.
	 * Add other shapes that make up your shape to the GameArena via an overload of this.
	 * @param w The world.
	 */
	public void pushShapes(World w) {
		
	}
	
	/**
	 * Overridable for custom shapes.
	 * Remove other shapes that make up your shape from the GameArena via an overload of this.
	 * @param w The world.
	 */
	public void popShapes(World w) {
		
	}
	
	/**
	 * Overridable for shapes.
	 * Make your shape do something every frame via an override of this.
	 * @param w The world.
	 */
	public void update(World w) {
		
	}
}
