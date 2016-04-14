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
	}

	@Override
	public boolean contains(ContentItem c) {
		return this.page.containsContentItem(c);
	}

}
