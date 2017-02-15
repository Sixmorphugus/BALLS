import java.util.ArrayList;

/**
 * Saved world object.
 * You can also load it into a game arena but you would have to add the rectangles one by one.
 */
 
public class Level {
	private ArrayList<Rectangle> obstacles = new ArrayList<Rectangle>();
	private ArrayList<Shape> charctaer = new ArrayList<Shape>();
	
	//private ArrayList<Rectangle> obstacles = new ArrayList<Rectangle>();
	
	/**
	 * Creates a new, empty level.
	 */
	public Level()
	{
	}
	
	/**
	 * Creates the level from a saved one.
	 */
	public Level(String fileToLoadFrom)
	{
	}
	
	/**
	 * Saves a level file that can be used to create the level.
	 */
	void exportFile(String fileToSaveTo)
	{
	}
	
	/**
	 * Returns the number of cached rectangles.
	 */
//	public int getNumRectangles() {
//		
//	}
	
	/**
	 * Returns a cached rectangle.
	 * If the rectangle doesn't exist it returns null.
	 */
//	public Rectangle getRectangle(int index) {
//		
//	}
}