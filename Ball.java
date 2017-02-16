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
	Rectangle r; //for CollisionBoxes

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
	 * Moves the current Velocity of this Ball to the given co-ordinates
	 * 
	 * @param x
	 *            the new x co-ordinate of this Ball
	 */
	public void setXVelocity(double x) {
		this.xVelocity = x;
	}

	/**
	 * Moves the current Velocity of this Ball to the given co-ordinates
	 * 
	 * @param y
	 *            the new y co-ordinate of this Ball
	 */
	public void setYVelocity(double y) {
		this.yVelocity = y;
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
	 * Is the ball in the area given?
	 * 
	 * @return whether or not the ball is in the area given.
	 */
	public boolean isInAreaX(double xBoxStart, double xBoxFinish) {
		return (getXPosition()-getSize() >= xBoxStart && getXPosition()+getSize() <= xBoxFinish);
	}

	/**
	 * Is the ball in the area given?
	 * 
	 * @return whether or not the ball is in the area given.
	 */
	public boolean isInAreaY(double yBoxStart, double yBoxFinish) {
		return (getYPosition()-getSize() >= yBoxStart && getYPosition()+getSize() <= yBoxFinish);
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

		// collide with things
//		boolean outX = !isInAreaX(0, w.getArenaWidth());
//		boolean outY = !isInAreaY(0, w.getArenaHeight());
//		for(Shape s : w.objects){
//			if(s.getClass().equals(Rectangle.class)) {
//				Rectangle r = (Rectangle) s;
//		if (isInAreaX(r.getXPosition()-r.getHeight()/2, r.getXPosition()+r.getHeight()/2))
//			bounceX();
//		if (isInAreaY(r.getYPosition()-r.getWidth()/2, r.getYPosition()+r.getWidth()/2))
//			bounceY();
//		}
//		}
//		if (isInAreaX(700, 800))
//			bounceX();
//		if (isInAreaY(600, 700))
//			bounceY();
		if (!isInAreaX(0, w.getArenaWidth()))
			bounceX();
		if (!isInAreaY(0, w.getArenaHeight()))
			bounceY();
		if (w.upPressed())
			setYVelocity(-5);

		if (w.rightPressed())
			setXVelocity(5);

		if (w.leftPressed())
			setXVelocity(-5);

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
