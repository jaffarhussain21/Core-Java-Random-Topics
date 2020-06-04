package inheritence;

public class Vodafone extends AbstractSMSProvider{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("Logic B" + " Send By: " + getVendorName());
	}

	
}
