package innopolis.poporo;

public abstract class ContentItem
{
    private   static long NEXT_ID = 0;
    private final  long id      = NEXT_ID++;

    public long getID() { return id; }

    @Override
    public boolean equals(final Object o)
    {
    	return ( (o instanceof ContentItem) && (((ContentItem)o).id == this.id) );
    }
}
