package inheritence;

public abstract class AbstractSMSProvider {

	protected String getVendorName() {
		return "Send By ABC";
	}
	
	public abstract void sendSMS();
}
