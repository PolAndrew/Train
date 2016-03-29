
import objects.CityMethods;
import objects.Coutry;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coutry country=new Coutry();
		country.printcountry();
		CityMethods m=new CityMethods();
		
		CityMethods.wr();
		m.printRoad();
		
		country.printcountry();
		
	}

}
