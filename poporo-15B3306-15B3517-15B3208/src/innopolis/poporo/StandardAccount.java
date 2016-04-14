package innopolis.poporo;

public class StandardAccount extends Account
{
	private StandardUser user;
	private StandardPage page;
	
	public StandardAccount(){
		this.page=new StandardPage();
	}

	@Override
	public StandardUser openAccount() {
		this.user=new StandardUser();
		return this.user;
	}

	@Override
	public void transmit(ContentItem ci) {
		this.page.upload(ci);
	}

	@Override
	public void closeAccount() {
		System.out.println("Account was closed.");	
		this.page=null;
		this.user=null;
	}

	@Override
	public boolean contains(ContentItem c) {
		if (this.page != null)
			return this.page.containsContentItem(c);
		else
			return false;
	}

}