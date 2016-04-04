package objects;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
		
		public void console(){
			System.out.println("1- вывести список городов с перечислением дорог");
			System.out.println("2-вывести список дорог");
		while (true) {
			switch (printInt()) {
			case 1:
				Coutry.printcountry();

				break;
			case 2:
				printRoad();

				break;
			default:
				break;
			}
		}
			
		
			
			
			
		}
			
		public static Integer printInt(){
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int a = 0;
			try {
				a=Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Ви ввели не число!");
				
			}
			return a;
			
			
		}
	
	
	
		
		
	

	
	
	
}
