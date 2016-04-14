package innopolis.poporo;

public class EnchantedPoporoFactory extends PoporoFactory
{
    public EnchantedPoporoFactory()
    {
        System.out.println("-> Constructor of class EnchantedPoporoFactory");
    }

    public ContentItem createContentItem()
    {
        System.out.println("-> Methor createContentItem of class EnchantedPoporoFactory");
        return null;
    }

    public User createUser()
    {
        System.out.println("-> Methor createUser of class EnchantedPoporoFactory");
        return null;
    }

    public Page createPage()
    {
        System.out.println("-> Methor createPage of class EnchantedPoporoFactory");
        return null;
    }

    public Account createAccount()
    {
        System.out.println("-> Methor createAccount of class EnchantedPoporoFactory");
        return null;
    }

}
