/**
 * Models a simple solid sphere. This class represents a Ball object. When
 * combined with the GameArena class, instances of the Ball class can be
 * displayed on the screen.
 */
public class Ball extends Shape {
	// The following instance variables define the
	// information needed to represent a Ball
	// Feel free to more instance variables if you think it will
	// support your work...

	/**
	 * Generated serialVersionUID
	 */
	private static final long serialVersionUID = 2607394866216452671L;
	private double xVelocity; // The X velocity of this Ball
	private double yVelocity; // The Y velocity of this Ball
	private double size; // The diameter of this Ball
	private double drag; // The diameter of this Ball
	private String colour; // The colour of this Ball
							// Permissable colours are
							// "BLACK", "BLUE", "CYAN", "DARKGREY", "GREY",
							// "GREEN", "LIGHTGREY", "MAGENTA", "ORANGE",
							// "PINK", "RED", "WHITE", "YELLOW".
							// Alternatively, 8 bit hexadecimal RGB values can
							// be given, in the format "#RRGGBB". e.g.
							// Pure red is "FF0000"
							// Pure red is "00FF00"
							// Pure red is "0000FF"
	private double xStart; // Starting X coordinate of the ball.
	private double yStart; // Starting Y coordinate of the ball.

	public Bounds getBoundsRepresentation() {
		return new Bounds(getXPosition(), getYPosition(), getSize() * 2, getSize() * 2);
	}
	
	/**
	 * Obtains the current Velocity of this Ball.
	 * 
	 * @return the X coordinate of this Ball within the GameArena.
	 */
	public double getXVelocity() {
		return xVelocity;
	}

	/**
	 * Obtains the current Velocity of this Ball.
	 * 
	 * @return the Y coordinate of this Ball within the GameArena.
	 */
	public double getYVelocity() {
		return yVelocity;
	}

	/**
	 * Sets the current x Velocity of this Ball to the given
	 * 
	 * @param x
	 *            the new x co-ordinate of this Ball
	 */
	public void setXVelocity(double x) {
		this.xVelocity = x;
	}

	/**
	 * Sets the current y Velocity of this Ball to the given
	 * 
	 * @param y
	 *            the new y co-ordinate of this Ball
	 */
	public void setYVelocity(double y) {
		this.yVelocity = y;
	}
	
	/**
	 * Adds the current x Velocity of this Ball to the given
	 * 
	 * @param x
	 *            the new x co-ordinate of this Ball
	 */
	public void incXVelocity(double x) {
		this.xVelocity += x;
	}

	/**
	 * Adds the current y Velocity of this Ball to the given
	 * 
	 * @param y
	 *            the new y co-ordinate of this Ball
	 */
	public void incYVelocity(double y) {
		this.yVelocity += y;
	}

	/**
	 * Moves the current position of this Ball x to the right.
	 * 
	 * @param x
	 *            the x offset
	 */
	public void moveX(double x) {
		setXPosition(getXPosition() + x);
	}

	/**
	 * Moves the current position of this Ball x to the right.
	 * 
	 * @param x
	 *            the x offset
	 */
	public void moveY(double y) {
		setYPosition(getYPosition() + y);
	}

	/**
	 * Obtains the size of this Ball.
	 * 
	 * @return the diameter of this Ball,in pixels.
	 */
	public double getSize() {
		return size;
	}

	/**
	 * Obtains the colour of this Ball.
	 * 
	 * @return a textual description of the colour of this Ball.
	 */
	public String getColour() {
		return colour;
	}

	/**
	 * Move the ball back to where it was created.
	 */
	public void returnToStartingPosition() {
		setXPosition(xStart);
		setYPosition(yStart);
		
		setXVelocity(0);
		setYVelocity(0);
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
	
	public void bounce() {
		//double bX = Math.abs(getXVelocity());
		//double bY = Math.abs(getYVelocity());
		
		//if(bX > bY) {
			bounceX();
		//}
		//else {
			bounceY();
		//}
	}

	/**
	 * Keep moving.
	 */
	@Override
	public void update(World w) {
		// slow down over time and move
		moveX(xVelocity);
		moveY(yVelocity);

		yVelocity += 0.5f;

		if (xVelocity > 0)
			xVelocity -= drag / 100;
		else if (xVelocity < 0)
			xVelocity += drag / 100;

		if (yVelocity > 0)
			yVelocity -= drag;
		else if (yVelocity < 0)
			yVelocity += drag;

		// collide with the arena edges
		Bounds arenaBounds = w.getBoundsRepresentation();
		Bounds ballBounds = getBoundsRepresentation();
		
		if(!ballBounds.isInsideX(arenaBounds))
			bounceX();
		
		if(!ballBounds.isInsideY(arenaBounds))
			bounceY();
		
		// collide with other shapes
		for(int i = 0; i < w.getNumShapes(); i++) {
			Shape s = w.getShape(i);
			// don't collide with yourself
			if(s == this)
				continue;
			
			Bounds sb = s.getBoundsRepresentation();
			
			if(ballBounds.collides(sb)) {
				bounce();
			}
		}
		
		// ball can be influenced by keyboard for debug purposes
		// comment out later
		if (w.upPressed())
			incYVelocity(-1);

		if (w.rightPressed())
			incXVelocity(1);

		if (w.leftPressed())
			incXVelocity(-1);
		
		if (w.downPressed())
			returnToStartingPosition();
	}

	/**
	 * Constructor. Creates an instance of Ball with the given characteristics.
	 *
	 * @param x
	 *            The initial location of the centre of the Ball on the screen,
	 *            in the X dimension.
	 * @param y
	 *            The initial location of the centre of the Ball on the screen,
	 *            in the Y dimension.
	 * @param diameter
	 *            The diameter of the Ball, in pixels.
	 * @param col
	 * 			  The colour of the Ball. Colour can be expressed as either a
	 *            friendly name, including: "BLACK", "BLUE", "CYAN", "DARKGREY",
	 *            "GREY", "GREEN", "LIGHTGREY", "MAGENTA", "ORANGE", "PINK",
	 *            "RED", "WHITE", "YELLOW". Alternatively, 8 bit hexadecimal RGB
	 *            values can be given, in the format "#RRGGBB". e.g. "#FF0000"
	 *            is a pure read, "#0000FF" is pure blue, etc.
	 */
	public Ball(double x, double y, double diameter, String col, ShapeType controller) {
		super(x, y, controller);
		xStart = x;
		yStart = y;
		size = diameter;
		drag = diameter / 100;
		colour = col;
	}
}
