import java.util.ArrayList;

/**
 * Saved world object.
 * You can also load it into a game arena but you would have to add the rectangles one by one.
 */
 
public class Level {
	private ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
	
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

}