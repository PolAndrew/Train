package objects;

import java.util.ArrayList;

public class Coutry {
	
	 static ArrayList<City> Country= new ArrayList<>(10);
	
	
	static{
		Country.add(new City("Lvov"));
		Country.add(new City("Kiev"));
		Country.add(new City("Lutsk"));
		Country.add(new City("Kovel"));
		Country.add(new City("Rovno"));
		Country.add(new City("Odessa"));
		Country.add(new City("Donetsk"));
		Country.add(new City("Mariypol"));
		Country.add(new City("Ryasne"));
		Country.add(new City("Lukov"));
	}


	
	public void printcountry(){
		for (City city : Country) {
			System.out.println(city.getName());
		}
		
		
	}
}
