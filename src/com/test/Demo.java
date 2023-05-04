package com.test;

/*public class Demo {
   // objects should not be created outside of the method
	public static void main(String[] args) {
	//Object creation statement
		Car bmw = new Car();
		Car audi = new Car();
    // Initialising the object
		bmw.color = "balck";
		bmw.model = "A class";
		bmw.milage = 12;
		bmw.cost = 1000;
		
		audi.color = "blue";
		audi.model = "B class";
		audi.milage = 12;
		audi.cost = 2000;
	//Access methods
		bmw.startCar();
		
		bmw.carDetails();
		bmw.stopCar();
		System.out.println("-------------------------");
		audi.startCar();
		
		audi.carDetails();
		audi.stopCar();		

	}

}*/
public class Demo {
	// Declaration of String and concatenation
	// Predefined methods of Strings
		public static void main(String[] args) 
		{
			String name = "prasanthi";
			String space = " ";
			String lastname = "Vulchi";
			String fullname = name+space+lastname;
			
			System.out.println(fullname);
			System.out.println(fullname.length());
			System.out.println(fullname.substring(6));
			System.out.println(fullname.substring(3, 10));
			
			System.out.println("prasanthi".equals(name));//true
}
}