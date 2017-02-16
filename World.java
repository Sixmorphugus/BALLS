import java.util.ArrayList;

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

public class World extends GameArena
{
	protected ArrayList<Shape> objects = new ArrayList<Shape>();
	
	
	/**
	 * Create a new level.
	 */
	public World(int width, int height)
	{
		super(width, height);
	}
	
	public void update() {
		for(int i = 0; i < getNumShapes(); i++) {
			getShape(i).update(this); // call shape's update function
		}
		
		pause();
	}
	
	/**
	 * Creates a level object that matches what's in the world.
	 * <B>Balls are not saved in a level.</b>
	 */
//	public Level exportLevel() {
//		
//	}
	
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
	 * Returns the number of cached shapes.
	 */
	public int getNumShapes() {
		return objects.size();
	}
	
	/**
	 * Returns a cached shape.
	 * If the shape doesn't exist it returns null.
	 */
	public Shape getShape(int index) {
		if(index >= objects.size() || index < 0)
			return null;
		
		return objects.get(index);
	}
	
	/**
	 * Adds a given Shape to the Level. 
	 * Once a Shape is added, it will automatically appear on the window. 
	 *
	 * @param b the Shape to add to the Level.
	 */
	public void addShape(Shape s)
	{
		objects.add(s);
		
		if(s.getClass().equals(Ball.class)) {
			Ball b = (Ball)s;
			addBall(b);
		}
		else if(s.getClass().equals(Rectangle.class)) {
			Rectangle r = (Rectangle)s;
			addRectangle(r);
		}
		else {
			//s.pushShapes(this);
			
		}
	}

	/**
	 * Remove a Shape from the Level. 
	 * Once a Shape is removed, it will no longer appear on the window. 
	 *
	 * @param Shape s to be removed from the Level.
	 */
	public void removeShape(Shape s)
	{
		objects.remove(s);
		
		if(s.getClass().equals(Ball.class)) {
			Ball b = (Ball)s;
			removeBall(b);
		}
		else if(s.getClass().equals(Rectangle.class)) {
			Rectangle r = (Rectangle)s;
			removeRectangle(r);
		}
	}
	
	/**
	 * Find a shape's ID in the world.
	 * @param Shape s to get the index of.
	 * @return the shape's ID.
	 */
	public int indexOf(Shape s) {
		for(int i = 0; i < objects.size(); i++) {
			if(objects.get(i) == s)
				return i;
		}
		
		return -1;
	}
	

}