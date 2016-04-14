package innopolis.poporo;

import java.util.LinkedList;
import java.util.List;

public class StandardPage extends Page {
	
	List<ContentItem> content;
	
	public StandardPage(){
		content = new LinkedList<ContentItem>();
	}

	public StandardPage(ContentItem c) {
		content = new LinkedList<ContentItem>();
		content.add(c);
	}
	
	@Override
	public void upload(ContentItem c) {
		if(!content.contains(c))
			content.add(c);
	}

	@Override
	public boolean remove(ContentItem c) {
		if (content.size() != 1)
			return content.remove(c);
		else
			return content.contains(c);
	}

	@Override
	public boolean isEmptyPage() {
		return content.isEmpty();
	}

	@Override
	public boolean containsContentItem(ContentItem c) {
		return content.contains(c);
	}

}
