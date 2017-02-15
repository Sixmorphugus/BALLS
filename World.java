import java.util.List;

/**
 * A Level, but it has an update function for keeping physics going.
 *
 * Instances of the Ball and Rectangle classes can be added to an instance of this class to
 * draw and animate simple shapes on the screen. 
 *
 * @see Ball
 * @see Rectangle
 *
 * @author Chris Sixsmith
 */

public class World extends Level
{
	protected List<Ball> knownBalls;
	protected List<Rectangle> knownRectangles;
	
	/**
	 * Create a new level.
	 */
	public World(int width, int height)
	{
		//super(width, height);
	}
	
	/**
	 * A method called by the operating system to draw onto the screen - <p><B>YOU DO NOT (AND SHOULD NOT) NEED TO CALL THIS METHOD.</b></p>
	 * Edit it to edit what happens every frame (currently we're just updating ball physics)
	 */
	protected void frameUpdate() {
		//super(); // do the default frameUpdate
		
		
	}
	
	/**
	 * Creates a level object that matches what's in the world.
	 * <B>Balls are not saved in a level.</b>
	 */
	public Level exportLevel() {
		return new Level();
	}
	
	/**
	 * Imports a level object that was loaded from somewhere.
	 */
	public void importLevel(Level in) {
		//import(in, true);
	}
	
	/**
	 * Imports a level object that was loaded from somewhere.
	 */
	public void importLevel(Level in, boolean clearOldLevel) {
		
	}
	
	/**
	 * Returns the number of cached balls.
	 */
//	public int getNumBalls() {
//		return 1;
//	}
	
	/**
	 * Returns the number of cached rectangles.
	 */
//	public int getNumRectangles() {
//		
//	}
	
	/**
	 * Returns a cached ball.
	 * If the ball doesn't exist it returns null.
	 */
//	public Ball getBall(int index) {
//		
//	}
	
	/**
	 * Returns a cached rectangle.
	 * If the rectangle doesn't exist it returns null.
	 */
//	public Rectangle getRectangle(int index) {
//		
//	}
	
	/**
	 * Adds a given Ball to the Level. 
	 * Once a Ball is added, it will automatically appear on the window. 
	 *
	 * @param b the ball to add to the Level.
	 */
	public void addBall(Ball b)
	{
	//	super(b);
	}

	/**
	 * Remove a Ball from the Level. 
	 * Once a Ball is removed, it will no longer appear on the window. 
	 *
	 * @param b the ball to remove from the Level.
	 */
	public void removeBall(Ball b)
	{
	//	super(b);
	}

	/**
	 * Adds a given rectangle to the Level. 
	 * Once a Rectangle is added, it will automatically appear on the window. 
	 *
	 * @param r the rectangle to add to the Level.
	 */
	public void addRectangle(Rectangle r)
	{
	//	super(r);
	}

	/**
	 * Remove a Rectangle from the Level. 
	 * Once a Rectangle is removed, it will no longer appear on the window. 
	 *
	 * @param r the rectangle to remove from the Level.
	 */
	public void removeRectangle(Rectangle r)
	{
	//	super(r);
	}
}