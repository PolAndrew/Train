package objects;

import java.util.ArrayList;

public class Coutry {
	
	 static ArrayList<City> CountryCities= new ArrayList<>(10);
	
	
	static{
		CountryCities.add(new City("Lvov"));
		CountryCities.add(new City("Kiev"));
		CountryCities.add(new City("Lutsk"));
		CountryCities.add(new City("Kovel"));
		CountryCities.add(new City("Rovno"));
		CountryCities.add(new City("Odessa"));
		CountryCities.add(new City("Donetsk"));
		CountryCities.add(new City("Mariypol"));
		CountryCities.add(new City("Ryasne"));
		CountryCities.add(new City("Lukov"));
	}
	
	static ArrayList<Road> countryRoads=new ArrayList<>(30);
	
	/*static{
		for (int i = 0; i < 30; i++) {
			countryRoads.add(new Road(i+1));
		}
		
		
	}*/

	public void printRoads(){
		for (Road road : countryRoads) {
			System.out.println(road.getNumbername());
		}
		
	}
	
	public void printcountry(){
		for (City city : CountryCities) {
			System.out.println(city.getName()+city.getRoads());
		}
		
		
	}
}
