package inheritence;

public class BritishAirlineReservation implements ExpediaInterface{
	
	BritishService birtishService = new BritishServiceImpl();
	
	public BritishAirlineReservation() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object doBooking() {
		// TODO Auto-generated method stub
		return birtishService.doBooking();
	}

	@Override
	public Object generateInvoiceAirline() {
		// TODO Auto-generated method stub
		return "britishService.generateInvoice()";
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
	}

}
