public class Contact{

	private String contactName;
	private long mobileNumber;

	public Contact(String contactName,long mobileNumber){
		this.contactName = contactName;
		this.mobileNumber = mobileNumber;
	}
	
	public String getContactName(){
		return contactName;
	}
	public long getMobileNumber(){
		return mobileNumber;
	}
}