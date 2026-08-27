package trainticketstask;

public class ProgramDriver {
	public static void main(String[] args) {
		TrainTicketsBooking ttb = new TrainTicketsBooking();
		Passenger ps1 = new Passenger(101,"Hujaifa",22);
		ttb.bookTicket(ps1);
		Passenger ps2 = new Passenger(102,"Amit",24);
		ttb.bookTicket(ps2);
		Passenger ps3 = new Passenger(103,"Ali",21);
		ttb.bookTicket(ps3);
		Passenger ps4 = new Passenger(104,"Ubaid",23);
		ttb.bookTicket(ps4);
		Passenger ps5 = new Passenger(105,"Parvej",23);
		ttb.bookTicket(ps5);
		Passenger ps6 = new Passenger(106,"Masoom",23);
		ttb.bookTicket(ps6);
		Passenger ps7 = new Passenger(107,"Ubaid",23);
		ttb.bookTicket(ps7);
		
		ttb.cancelTicket(103);
		
	}

	
}
