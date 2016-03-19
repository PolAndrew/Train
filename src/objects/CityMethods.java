package objects;

import java.util.ArrayList;
import java.util.Random;

public class CityMethods {
	static ArrayList<Road> countryRoad=countryRoad();
		
	/*	public static ArrayList<Road> countryRoad() {
			ArrayList<Road> c=new ArrayList<>(30);
			for (int i = 0; i < 30; i++) {
				Random r= new Random();
				Random r1=new Random();
				int d=r.nextInt(Coutry.CountryCities.size());
				int f=r1.nextInt(Coutry.CountryCities.size());
				if (!Coutry.CountryCities.get(d).equals(Coutry.CountryCities.get(f))) {
					Road ro=new Road(i,new City[]{Coutry.CountryCities.get(d),Coutry.CountryCities.get(f)});
					if(c.contains(ro.fd))
				}else{
				i--;
				
				}
			}
			
			
			
			
			return c;
			
		}*/
		
		public void printRoads(){
			for (Road road : countryRoad) {
				System.out.println(road);
			}
			
		}
		
	
	
	
		
		
	

	
	
	
}
