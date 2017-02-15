public class Driver {
	public static void main(String[] args) {
		World w = new World(1280, 720);
		
		Rectangle r = new Rectangle(600, 400, 500, 50, "BROWN",ShapeType.ComputerC);
		Ball b = new Ball(600, 50, 20, "#FFFFFF",ShapeType.UserC);
		
		w.addShape(r);
		w.addShape(b);
		
		while(true) {
			w.update();
		}
	}
}
