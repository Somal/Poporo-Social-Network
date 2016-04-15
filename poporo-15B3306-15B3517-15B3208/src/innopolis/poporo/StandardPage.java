package innopolis.poporo;

import java.util.LinkedList;

public class StandardPage extends Page
{

    public StandardPage()
    {
        content = new LinkedList<ContentItem>();
    }

    public StandardPage(ContentItem c)
    {
        this();
        content.add(c);
    }

    @Override
    public void upload(ContentItem c)
    {
        if ( !content.contains(c) )
        {
            content.add(c);
        }
    }

    @Override
    public boolean remove(ContentItem c)
    {
        return (content.size() > 1) ? content.remove(c) : content.contains(c);
    }

    @Override
    public boolean isEmptyPage()
    {
        return content.isEmpty();
    }

    @Override
    public boolean containsContentItem(ContentItem c)
    {
        return content.contains(c);
    }

    @Override
    public void Draw()
    {
        System.out.println("Draw in class StandartPage");
    }

}
