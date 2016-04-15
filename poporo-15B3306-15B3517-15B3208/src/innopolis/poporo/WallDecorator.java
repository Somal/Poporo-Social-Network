package innopolis.poporo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class WallDecorator extends Decorator
{

    private final HashMap<Long, List<ContentItem>> commentsTable = new HashMap<>();

    public WallDecorator(Page decoratedPage)
    {
        super(decoratedPage);
    }

    public void DrawWall()
    {
        System.out.println("DrawWall in class WallDecorator");
    }

    public void Draw()
    {
        System.out.println("Draw in class WallDecorator");
        super.Draw();
        DrawWall();
    }

    public void comment(ContentItem c1, ContentItem c2)
    {
        if ( decoratedPage.containsContentItem(c1) )
        {
            // decoratedPage.upload(c2);
            if ( commentsTable.containsKey( c1.getID() ) )
            {
            	commentsTable.get(c1.getID()).add(c2);
            }
            else
            {
            	LinkedList<ContentItem> firstComment = new LinkedList<>();
            	firstComment.add(c2);
            	commentsTable.put(c1.getID(), firstComment);
            }
        }
    }

    public void uncomment(ContentItem c1, ContentItem c2)
    {
        if ( has(c1, c2) )
        {
            // decoratedPage.remove(c2);
            commentsTable.get(c1.getID()).remove(c2);
        }
    }

    public boolean isDefinedAt(ContentItem c1)
    {
        return (   ( decoratedPage.containsContentItem(c1) ) && ( commentsTable.containsKey(c1.getID()) ) && ( !commentsTable.get(c1.getID()).isEmpty() )   );
    }

    public boolean has(ContentItem c1, ContentItem c2)
    {
        final long c1ID = c1.getID();
        final List<ContentItem> commentsAboutC1 = commentsTable.get(c1ID);
        return ( decoratedPage.containsContentItem(c1) && commentsTable.containsKey(c1ID) && commentsAboutC1.contains(c2) );
    }

    @Override
    public boolean remove(ContentItem c1)
    {
    	commentsTable.remove(c1.getID());
    	return super.remove(c1);
    }
}
