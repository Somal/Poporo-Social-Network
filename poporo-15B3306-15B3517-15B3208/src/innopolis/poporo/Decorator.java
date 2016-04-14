package innopolis.poporo;

public abstract class Decorator extends Page{
	
	protected Page decoratedPage;
	
	public Decorator(Page decoratedPage) {
		this.decoratedPage = decoratedPage;
	}

	@Override
	public void upload(ContentItem c) {
		decoratedPage.upload(c);
	}

	@Override
	public boolean remove(ContentItem c) {
		return decoratedPage.remove(c);
	}

	@Override
	public boolean isEmptyPage() {
		return decoratedPage.isEmptyPage();
	}

	@Override
	public boolean containsContentItem(ContentItem c) {
		return decoratedPage.containsContentItem(c);
	}

	@Override
	public void Draw() {
		decoratedPage.Draw();
	}
}
