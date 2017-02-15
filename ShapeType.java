/**
 * ShapeType enum is used to determine what kind of controller is supposed to control
 * the particular shape, eg if shape must be controlled by a user, computer or remain 
 * untouched for the whole time.
 * <p><b>Example:</b></p>
 * <p> //Will enable shape to be controlled by the player</p><code>
 * Ball ball = new Ball(100, 5, 2, "#00F0F0",ShapeType.UserC);
 * </code>
 * <p></p>
 * <b>Available types:</b> <ul>
 * <li>UserC - Shape controlled by user</li>
 * <li>ComputerC - Shape controlled by user</li>
 * <li>NeutralCC - Shape will remain idle during it's lifetime</li>
 * </ul>
 * @author Azureus Aeterna
 * 
 */
public enum ShapeType {
UserC(0),ComputerC(1),NeutralCC(2);
	
	private final int type;
	private ShapeType(int code){
		type=code;
	}
	public int getController(){
		return this.type;
	}
	
}
