import java.util.Random;

public class Driver {
	public static void main(String[] args) {
		Random rGen = new Random();
		
		GameArena arena = new GameArena(1280, 720);
		
		int numBalls = 16000;
		
		Ball[] balls = new Ball[numBalls];
		
		for(int i = 0; i < numBalls; i++) {
			balls[i] = new Ball(740, 560, 10, "#555555");
			balls[i].setXVelocity(rGen.nextDouble() * 50.0);
			balls[i].setYVelocity(rGen.nextDouble() * 50.0);
			
			arena.addBall(balls[i]);
		}
		
		while(true) {
			for(int i = 0; i < numBalls; i++) {
				balls[i].update();
			
				boolean outX = !balls[i].isInAreaX(0, arena.getArenaWidth());
				boolean outY = !balls[i].isInAreaY(0, arena.getArenaHeight());
				
				if(outX)
					balls[i].bounceX();
				
				if(outY)
					balls[i].bounceY();
				
				if(arena.upPressed()) {
					balls[i].setYVelocity(-10);
				}
			}
			
			arena.pause();
		}
	}
}