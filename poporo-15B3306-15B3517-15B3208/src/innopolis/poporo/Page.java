package innopolis.poporo;

public abstract class Page {
	public abstract void upload ( ContentItem c );
	public abstract boolean remove ( ContentItem c );
	public abstract boolean isEmptyPage ();
	public abstract boolean containsContentItem ( ContentItem c );
}

