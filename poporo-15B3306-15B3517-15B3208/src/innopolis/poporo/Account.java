package innopolis.poporo;

public abstract class Account
{
	public abstract void openAccount();
	public abstract void transmit(final ContentItem ci);
	public abstract void closeAccount();
}