package car_dealership;

public class Employee {

	public static void handleCustomer(Customer cust,boolean finance,Vehicle vehicle) {
		if(finance==true) {
			double loanAmount = vehicle.getPrice()-cust.getCashOnHand();
			runCreditHistory(cust,loanAmount);
		}else if(vehicle.getPrice()<=cust.getCashOnHand()){
			processTransation(cust,vehicle);
		}else {
			System.out.println("Customer need more money for "+vehicle);
		}
	}

	static void processTransation(Customer cust, Vehicle vehicle) {
		System.out.println("Customer has purchased the vehicle "+vehicle+"with price: "+vehicle.getPrice());
	}

	static void runCreditHistory(Customer cust, double loanAmount) {
		 System.out.println("Running credit history for " + cust.getName());
		 System.out.println("Customer has been approved to finance the vehicle with amount: $" + loanAmount);
		
	}

}
