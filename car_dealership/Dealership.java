package car_dealership;

//write a program to simuate a car dealership sales process.
//we will have employees, working ,selling vehicles to customers;
public class Dealership {

	public static void main(String[] args) {
		
		
		Customer customer1  = new Customer("Jerry","Pune",1000000);
		
		Vehicle v1 = new Vehicle("Yamaha","HeroHonda",400000);
		Vehicle car = new Vehicle("Bullet","Mahindra",700000);
		
		Employee e1 = new Employee();
		
		customer1.purchaseCar(v1, e1, false);
		
		boolean val = car.equals(v1);
		System.out.println(val);

		
	}

}
