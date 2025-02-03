package Ultra;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections; 

public class Array {
	
	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("BMW XM");
		cars.add("BMW 3 series");
		cars.add("Volvo xc 90");
		cars.add("Tata Nexon");
		cars.add("Tata punch");
		cars.add("Grand vitara");
		cars.add("Polo");
		
		cars.add(5, "Vento");
		cars.set(1, "BMW 5 series");
		
		Collections.sort(cars);
		
		{
			for (String i : cars);
		System.out.println(cars);
		
	}

}
}