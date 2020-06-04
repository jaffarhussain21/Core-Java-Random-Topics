package inheritence;

public class ATNT extends AbstractSMSProvider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("Logic A" + " Send By: " + getVendorName());
	}

}
