package innopolis.poporo;

public class StandardPoporoFactory extends PoporoFactory
{
    public StandardPoporoFactory()
    {
        System.out.println("-> Constructor of class StandardPpoporoFactory");
    }

    public ContentItem createContentItem()
    {
        System.out.println("-> Methor createContentItem of class StandardPpoporoFactory");
        return null;
    }

    public User createUser()
    {
        System.out.println("-> Methor createUser of class StandardPpoporoFactory");
        return null;
    }

    public Page createPage()
    {
        System.out.println("-> Methor createPage of class StandardPpoporoFactory");
        return null;
    }

    public Account createAccount()
    {
        System.out.println("-> Methor createAccount of class StandardPpoporoFactory");
        return null;
    }

}
