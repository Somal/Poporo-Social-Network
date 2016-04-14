package innopolis.poporo;

public class EnchantedAccount extends Account
{
	private EnchantedUser user;
	private EnchantedPage page;
	
	public EnchantedAccount(){
		this.page=new EnchantedPage();
	}

	@Override
	public EnchantedUser openAccount() {
		this.user=new EnchantedUser();
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
