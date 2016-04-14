package innopolis.poporo;
import java.util.List;

public abstract class Page {
	List<ContentItem> content;
	public abstract void upload ( ContentItem c );
	public abstract boolean remove ( ContentItem c );
	public abstract boolean isEmptyPage ();
	public abstract boolean containsContentItem ( ContentItem c );
	public abstract void Draw();
}

