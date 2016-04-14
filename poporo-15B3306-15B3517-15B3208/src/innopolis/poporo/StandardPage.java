package innopolis.poporo;

import java.util.LinkedList;
import java.util.List;

public class StandardPage extends Page {
	
	List<ContentItem> content;
	
	public StandardPage(){
		
	}

	public StandardPage(ContentItem c) {
		content = new LinkedList<ContentItem>();
		content.add(c);
	}
	
	@Override
	public void upload(ContentItem c) {
		content.add(c);
	}

	@Override
	public boolean remove(ContentItem c) {
		return content.remove(c);
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
