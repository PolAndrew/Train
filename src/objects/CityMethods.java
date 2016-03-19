package objects;

import java.util.ArrayList;
import java.util.Random;

public class CityMethods {
	static ArrayList<Road> countryRoad=countryRoad();
		
		public static ArrayList<Road> countryRoad() {
			ArrayList<Road> c=new ArrayList<>(30);
			for (int i = 0; i < 30; i++) {
				Random r= new Random();
				Random r1=new Random();
				int d=r.nextInt(Coutry.Country.size());
				int f=r1.nextInt(Coutry.Country.size());
				if (!Coutry.Country.get(d).equals(Coutry.Country.get(f))) {
					c.add(new Road(i+1,Coutry.Country.get(d),Coutry.Country.get(f)));
				}else{
				i--;
				
				}
			}
			
			
			
			
			return c;
			
		}
		
		public void printRoads(){
			for (Road road : countryRoad) {
				System.out.println(road);
			}
			
		}
		
	
	
	
		
		
	

	
	
	
}
