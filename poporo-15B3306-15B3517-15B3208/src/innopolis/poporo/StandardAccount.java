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
        System.out.println("-> Method transmit of class StandardAccount");
    }

    @Override
    public void closeAccount()
    {
        this.page = null;
        this.user = null;
        System.out.println("StandardAccount has been closed.");
    }

    @Override
    public boolean contains(ContentItem c)
    {
        return (this.page != null)? this.page.containsContentItem(c) : false;
    }

}
