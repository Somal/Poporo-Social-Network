package innopolis.poporo;

public class WallDecorator extends Decorator {

	public WallDecorator(Page decoratedPage) {
		super(decoratedPage);
	}

	public void DrawWall() {

	}
	
	public void Draw() {
		System.out.println ("Draw in class WallDecorator");
		super.Draw();
		DrawWall();
	}
	
}
