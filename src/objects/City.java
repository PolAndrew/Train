package objects;

import java.util.ArrayList;

public class City implements Comparable<City>{
	private String name;
	private ArrayList<Road> roads=new ArrayList<>();
	
	
	
	

	
	

	public City() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Road> getRoads() {
		return roads;
	}

	

	public  void setRoads(Road e) {
		roads.add(e);
	}

	@Override
	public String toString() {
		return "City [name=" + name + "]";
	}

	public City(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(City o) {
		
		return this.name.compareTo(o.name);
	}

	

	
	
}
