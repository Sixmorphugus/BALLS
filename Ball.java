/**
 * Models a simple solid sphere. 
 * This class represents a Ball object. When combined with the GameArena class,
 * instances of the Ball class can be displayed on the screen.
 */
public class Ball 
{
	// The following instance variables define the
	// information needed to represent a Ball
	// Feel free to more instance variables if you think it will 
	// support your work... 
	
	private double xPosition;			// The X coordinate of this Ball
	private double yPosition;			// The Y coordinate of this Ball
	private double xVelocity;			// The X velocity of this Ball
	private double yVelocity;			// The Y velocity of this Ball
	private double size;				// The diameter of this Ball
	private double drag;				// The diameter of this Ball
	private String colour;	            // The colour of this Ball
										// Permissable colours are 
                                        // "BLACK", "BLUE", "CYAN", "DARKGREY", "GREY", "GREEN", "LIGHTGREY", "MAGENTA", "ORANGE", "PINK", "RED", "WHITE", "YELLOW".
                                        // Alternatively, 8 bit hexadecimal RGB values can be given, in the format "#RRGGBB".  e.g.
                                        // Pure red is "FF0000"
                                        // Pure red is "00FF00"
                                        // Pure red is "0000FF"
	private double xStart;				// Starting X coordinate of the ball.
	private double yStart;				// Starting Y coordinate of the ball.

	/**
	 * Obtains the current position of this Ball.
	 * @return the X coordinate of this Ball within the GameArena.
	 */
	public double getXPosition()
	{
		return xPosition;
	}

	/**
	 * Obtains the current position of this Ball.
	 * @return the Y coordinate of this Ball within the GameArena.
	 */
	public double getYPosition()
	{
		return yPosition;
	}

	/**
	 * Moves the current position of this Ball to the given co-ordinates
	 * @param x the new x co-ordinate of this Ball
	 */
	public void setXPosition(double x)
	{
		this.xPosition = x;
	}

	/**
	 * Moves the current position of this Ball to the given co-ordinates
	 * @param y the new y co-ordinate of this Ball
	 */
	public void setYPosition(double y)
	{
		this.yPosition = y;
	}
	
	/**
	 * Obtains the current Velocity of this Ball.
	 * @return the X coordinate of this Ball within the GameArena.
	 */
	public double getXVelocity()
	{
		return xVelocity;
	}

	/**
	 * Obtains the current Velocity of this Ball.
	 * @return the Y coordinate of this Ball within the GameArena.
	 */
	public double getYVelocity()
	{
		return yVelocity;
	}

	/**
	 * Moves the current Velocity of this Ball to the given co-ordinates
	 * @param x the new x co-ordinate of this Ball
	 */
	public void setXVelocity(double x)
	{
		this.xVelocity = x;
	}

	/**
	 * Moves the current Velocity of this Ball to the given co-ordinates
	 * @param y the new y co-ordinate of this Ball
	 */
	public void setYVelocity(double y)
	{
		this.yVelocity = y;
	}
	
	/**
	 * Moves the current position of this Ball x to the right.
	 * @param x the x offset
	 */
	public void moveX(double x) {
		this.xPosition += x;
	}
	
	/**
	 * Moves the current position of this Ball x to the right.
	 * @param x the x offset
	 */
	public void moveY(double y) {
		this.yPosition += y;
	}

	/**
	 * Obtains the size of this Ball.
	 * @return the diameter of this Ball,in pixels.
	 */
	public double getSize()
	{
		return size;
	}

	/**
	 * Obtains the colour of this Ball.
	 * @return a textual description of the colour of this Ball.
	 */
	public String getColour()
	{
		return colour;
	}
	
	/**
	 * Is the ball in the area given?
	 * @return whether or not the ball is in the area given.
	 */
	public boolean isInAreaX(float xBoxStart, float xBoxFinish) {
		return (xPosition >= xBoxStart && xPosition <= xBoxFinish);
	}
	
	/**
	 * Is the ball in the area given?
	 * @return whether or not the ball is in the area given.
	 */
	public boolean isInAreaY(float yBoxStart, float yBoxFinish) {
		return (yPosition >= yBoxStart && yPosition <= yBoxFinish);
	}
	
	/**
	 * Move the ball back to where it was created.
	 */
	public void returnToStartingPosition() {
		setXPosition(xStart);
		setYPosition(yStart);
	}
	
	/**
	 * Reverse X velocity.
	 */
	public void bounceX() {
		setXVelocity(-xVelocity);
	}
	
	/**
	 * Reverse Y velocity.
	 */
	public void bounceY() {
		setYVelocity(-yVelocity);
	}
	
	/**
	 * Keep moving.
	 */
	public void update() {
		moveX(xVelocity);
		moveY(yVelocity);
		
		yVelocity += 0.5f;
		
		if(xVelocity > 0)
			xVelocity -= drag / 100;
		else if(xVelocity < 0)
			xVelocity += drag / 100;
		
		if(yVelocity > 0)
			yVelocity -= drag;
		else if(yVelocity < 0)
			yVelocity += drag;
	}
	
	public void addToGameArena(GameArena ga) {
		ga.addBall(this);
	}

    /**
     * Constructor. Creates an instance of Ball with the given chatacteristics.
     *
     * @param x The initial location of the centre of the Ball on the screen, in the X dimension.
     * @param y The initial location of the centre of the Ball on the screen, in the Y dimension.
     * @param diameter The diameter of the Ball, in pixels.
     * @param col The colour of the Ball. Colour can be expressed as either a friendly name, including:
     * "BLACK", "BLUE", "CYAN", "DARKGREY", "GREY", "GREEN", "LIGHTGREY", "MAGENTA", "ORANGE", "PINK", "RED", "WHITE", "YELLOW".
     * Alternatively, 8 bit hexadecimal RGB values can be given, in the format "#RRGGBB". e.g. "#FF0000" is a pure read, "#0000FF" is pure blue, etc.
     */
	public Ball(double x, double y, double diameter, String col)
	{
		xPosition = x;
		yPosition = y;
		xStart = x;
		yStart = y;
		size = diameter;
		drag = diameter / 100;
		colour = col;
	}	
}
