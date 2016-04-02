package objects;


import java.util.ArrayList;
import java.util.Random;

public class CityMethods {
	static ArrayList<Road> countryRoad=countryRoad();/*countryRoad();*/

		
	public static ArrayList<Road> countryRoad() {
		ArrayList<Road> c = new ArrayList<>(30);
		for (int i = 0; i < 30; i++) {
			Random r = new Random();
			Random r1 = new Random();
			int d = r.nextInt(Coutry.CountryCities.size());
			int f = r1.nextInt(Coutry.CountryCities.size());
			if (!Coutry.CountryCities.get(d).equals(Coutry.CountryCities.get(f))) 
			{
				Road ro= new Road(i + 1, new City[] { Coutry.CountryCities.get(d), Coutry.CountryCities.get(f) });
				if(!Coutry.CountryCities.get(d).getRoads().contains(ro)){
				
				
				c.add(ro);
				
				
				Coutry.CountryCities.get(d).setRoads(ro);
				Coutry.CountryCities.get(f).setRoads(ro);
				}else{
					i--;
				}
			}

			else {
				i--;
			}
		}
			
		
				
			
			
			
			return c;
			
		}
		
	public static ArrayList<Road> wr(){
		for (int i = 0; i < countryRoad.size(); i++) {
			for (int j = i+1; j < countryRoad.size(); j++) {
				if(countryRoad.get(i).equals(countryRoad.get(j))){
					countryRoad.clear();
				
					countryRoad();
					
				}
			}
		}
		
		
		return countryRoad;
		
		
		
	}
			
		
		
		
		
		public void printRoad(){
			for (Road road : countryRoad) {
				System.out.println(road);
			}
			
		}
		
		
	
	
	
		
		
	

	
	
	
}
