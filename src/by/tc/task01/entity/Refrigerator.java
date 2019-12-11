package by.tc.task01.entity;

public class Refrigerator extends Appliance{

	private int POWER_CONSUMPTION; 
	private int FREEZER_CAPACITY; 
	private double OVERALL_CAPACITY; 
	private double WEIGHT;
	private double HEIGHT; 
	private double WIDTH;
	
	public Refrigerator () {
		this.POWER_CONSUMPTION = 0; 
		this.FREEZER_CAPACITY = 0; 
		this.OVERALL_CAPACITY = 0; 
		this.WEIGHT = 0;
		this.HEIGHT = 0; 
		this.WIDTH = 0;
	}

	public int getPOWER_CONSUMPTION() {
		return POWER_CONSUMPTION;
	}

	public void setPOWER_CONSUMPTION(int pOWER_CONSUMPTION) {
		POWER_CONSUMPTION = pOWER_CONSUMPTION;
	}

	public int getFREEZER_CAPACITY() {
		return FREEZER_CAPACITY;
	}

	public void setFREEZER_CAPACITY(int fREEZER_CAPACITY) {
		FREEZER_CAPACITY = fREEZER_CAPACITY;
	}

	public double getOVERALL_CAPACITY() {
		return OVERALL_CAPACITY;
	}

	public void setOVERALL_CAPACITY(double oVERALL_CAPACITY) {
		OVERALL_CAPACITY = oVERALL_CAPACITY;
	}

	public double getWEIGHT() {
		return WEIGHT;
	}

	public void setWEIGHT(double wEIGHT) {
		WEIGHT = wEIGHT;
	}

	public double getHEIGHT() {
		return HEIGHT;
	}

	public void setHEIGHT(double hEIGHT) {
		HEIGHT = hEIGHT;
	}

	public double getWIDTH() {
		return WIDTH;
	}

	public void setWIDTH(double wIDTH) {
		WIDTH = wIDTH;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + FREEZER_CAPACITY;
		long temp;
		temp = Double.doubleToLongBits(HEIGHT);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(OVERALL_CAPACITY);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + POWER_CONSUMPTION;
		temp = Double.doubleToLongBits(WEIGHT);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(WIDTH);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Refrigerator other = (Refrigerator) obj;
		if (FREEZER_CAPACITY != other.FREEZER_CAPACITY)
			return false;
		if (Double.doubleToLongBits(HEIGHT) != Double.doubleToLongBits(other.HEIGHT))
			return false;
		if (Double.doubleToLongBits(OVERALL_CAPACITY) != Double.doubleToLongBits(other.OVERALL_CAPACITY))
			return false;
		if (POWER_CONSUMPTION != other.POWER_CONSUMPTION)
			return false;
		if (Double.doubleToLongBits(WEIGHT) != Double.doubleToLongBits(other.WEIGHT))
			return false;
		if (Double.doubleToLongBits(WIDTH) != Double.doubleToLongBits(other.WIDTH))
			return false;
		return true;
	}
	
}
