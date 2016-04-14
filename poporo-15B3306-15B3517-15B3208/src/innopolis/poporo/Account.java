package innopolis.poporo;

public abstract class Account{
	public abstract User openAccount();
	public abstract void transmit(ContentItem ci);
	public abstract void closeAccount();
	public abstract boolean contains ( ContentItem c );
	
}