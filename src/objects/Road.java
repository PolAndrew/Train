package objects;

import java.util.Arrays;

public class Road {
	private int numbername;
	/*private City Citydes;
	private City Cityfrom;*/
	City[] fd=new City[2];
	
	



	public Road(int numbername, City[] fd) {
		super();
		this.numbername = numbername;
		this.fd = fd;
		Arrays.sort(fd);
		
	}
	
	public Road() {
		// TODO Auto-generated constructor stub
	}



	


	public Road(int numbername) {
		super();
		this.numbername = numbername;
	}


	@Override
	public String toString() {
		return "Road [numbername=" + numbername + ", fd=" + Arrays.toString(fd) + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(fd);
		result = prime * result + numbername;
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
		Road other = (Road) obj;
		if (!Arrays.equals(fd, other.fd))
			return false;
		
		return true;
	}

	public int getNumbername() {
		return numbername;
	}

	public void setNumbername(int numbername) {
		this.numbername = numbername;
	}

}
