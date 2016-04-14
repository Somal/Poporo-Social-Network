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

	public void comment(ContentItem c1, ContentItem c2) {
		// TODO Auto-generated method stub
		
	}

	public boolean isDefinedAt(ContentItem c1) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean has(ContentItem c1, ContentItem c2) {
		// TODO Auto-generated method stub
		return false;
	}

}