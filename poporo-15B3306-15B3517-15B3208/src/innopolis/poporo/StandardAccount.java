package innopolis.poporo;

public class StandardAccount extends Account
{
    private StandardUser user;
    private StandardPage page;
    
    public StandardAccount()
    {
        this.page = new StandardPage();
    }

    @Override
    public StandardUser openAccount()
    {
        this.user = new StandardUser();
        System.out.println("StandardAccount has been opened.");  
        return this.user;
    }

    @Override
    public void transmit(ContentItem ci)
    {
        page.upload(ci);
    }

    @Override
    public void closeAccount()
    {
        System.out.println("StandardAccount has been closed.");  
    }

    @Override
    public boolean contains(ContentItem c)
    {
        return this.page.containsContentItem(c);
    }

}
