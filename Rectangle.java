/**
 * Models a simple, solid rectangle. 
 * This class represents a Rectabgle object. When combined with the GameArena class,
 * instances of the Rectangle class can be displayed on the screen.
 */
public class Rectangle extends Shape
{
	// The following instance variables define the
	// information needed to represent a Rectangle
	// Feel free to more instance variables if you think it will 
	// support your work... 
	
	/**
	 * Generated serialVersionUID
	 */
	private static final long serialVersionUID = 3626057187823375951L;
	private double width;				// The width of this Rectangle
	private double height;				// The height of this Rectangle
	private String colour;	            // The colour of this Rectangle
										// Permissable colours are 
                                        // "BLACK", "BLUE", "CYAN", "DARKGREY", "GREY", "GREEN", "LIGHTGREY", "MAGENTA", "ORANGE", "PINK", "RED", "WHITE", "YELLOW".
                                        // Alternatively, 8 bit hexadecimal RGB values can be given, in the format "#RRGGBB".  e.g.
                                        // Pure red is "FF0000"
                                        // Pure red is "00FF00"
                                        // Pure red is "0000FF"

	

	/**
	 * Obtains the width of this Rectangle.
	 * @return the width of this Rectangle,in pixels.
	 */
	public double getWidth()
	{
		return width;
	}

	/**
	 * Obtains the height of this Rectangle.
	 * @return the height of this Rectangle,in pixels.
	 */
	public double getHeight()
	{
		return height;
	}

	/**
	 * Obtains the colour of this Rectangle.
	 * @return a textual description of the colour of this Rectangle.
	 */
	public String getColour()
	{
		return colour;
	}
	

    /**
     * Constructor. Creates an instance of Rectangle with the given chatacteristics.
     *
     * @param x The initial location of the centre of the Rectangle on the screen, in the X dimension.
     * @param y The initial location of the centre of the Rectangle on the screen, in the Y dimension.
     * @param w The width of the Rectangle, in pixels.
     * @param h The height of the Rectangle, in pixels.
     * @param col The colour of the Rectangle. Colour can be expressed as either a friendly name, including:
     * "BLACK", "BLUE", "CYAN", "DARKGREY", "GREY", "GREEN", "LIGHTGREY", "MAGENTA", "ORANGE", "PINK", "RED", "WHITE", "YELLOW".
     * Alternatively, 8 bit hexadecimal RGB values can be given, in the format "#RRGGBB". e.g. "#FF0000" is a pure read, "#0000FF" is pure blue, etc.
     */
	public Rectangle(double x, double y, double w, double h, String col,ShapeType controller)
	{
		super(x,y,controller);
		width = w;
		height = h;
		colour = col;
	}	
}
