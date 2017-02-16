import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
		World w = new World(1280, 720);
		
//		Rectangle r = new Rectangle(600, 400, 500, 50, "BROWN",ShapeType.ComputerC);
//		Ball b = new Ball(600, 50, 20, "#FFFFFF",ShapeType.UserC);
//		
//		w.addShape(r);
//		w.addShape(b);
//		Rectangle finish = new Rectangle(1000, 695, 50, 50, "BROWN",ShapeType.NeutralCC);
//		Rectangle obs1 = new Rectangle(100, 500, 20, 600, "WHITE",ShapeType.NeutralCC);
//		Rectangle obs2 = new Rectangle(450, 400, 20, 300, "WHITE",ShapeType.NeutralCC);
//		Rectangle obs3 = new Rectangle(600, 300, 20, 500, "WHITE",ShapeType.NeutralCC);
//		Rectangle obs4 = new Rectangle(250, 250, 20, 500, "WHITE",ShapeType.NeutralCC);
//		Ball b = new Ball(60, 50, 20, "#FFFFFF",ShapeType.UserC);
		
		ArrayList<Shape> shapes = Level.levelLoad(0);
		for(Shape s : shapes)
			w.addShape(s);
		w.addShape(new Rectangle(750, 650, 50, 50, "BLUE", ShapeType.ComputerC));
//		w.addShape(finish);
//		w.addShape(obs1);
//		w.addShape(obs2);
//		w.addShape(obs3);
//		w.addShape(obs4);
//		w.addShape(b);	
//		for(Shape s : shapes){
//			if(s.getClass().equals(Rectangle.class)) {
//				
//				Rectangle r = (Rectangle) s;
//				w.removeShape(s);
//		w.addShape(new Rectangle(r.getXPosition(), r.getYPosition(), r.getWidth(), r.getHeight(), "BLUE", ShapeType.ComputerC));
//		}
//		}
		while(true) {
			w.update();
		}
	}
}
