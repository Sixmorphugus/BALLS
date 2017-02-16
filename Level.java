import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * Saved world object.
 * You can also load it into a game arena but you would have to add the rectangles one by one.
 */
 
public class Level {
	private ArrayList<Shape> LevelObstacles = new ArrayList<Shape>();
	/**
	 * Creates a new level.
	 */
	public Level(ArrayList<Shape> levelShapes)
	{
		for(Shape shapes : levelShapes){
			LevelObstacles.add(shapes);
		}
	}
	public Level(){
		
	}
	
	public static ArrayList<Shape> levelLoad(int levelNo){
		ArrayList<ArrayList<Shape>>	levels = null;
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("levels.dat"))){
			
		levels = (ArrayList<ArrayList<Shape>>) ois.readObject();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return levels.get(levelNo);
	}

}