package inheritence;

public class UnitedAirlineReservation implements ExpediaInterface{
	
	public int counter;

	@Override
	public Object doBooking() {
		// TODO Auto-generated method stub
		counter++;
		return "unitedService.doBooking()";
	}

	@Override
	public Object generateInvoiceAirline() {
		// TODO Auto-generated method stub
		counter++;
		return "unitedService.generateInvoice()";
	}

	public void test2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
	}

}
