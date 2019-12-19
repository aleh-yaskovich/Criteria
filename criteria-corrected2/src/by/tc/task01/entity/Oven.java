package by.tc.task01.entity;

public class Oven extends Appliance{

	private int POWER_CONSUMPTION; 
	private int CAPACITY; 
	private int DEPTH; 
	private double WEIGHT;
	private double HEIGHT; 
	private double WIDTH;
	
	public Oven () {
		super();
		this.POWER_CONSUMPTION = 0; 
		this.CAPACITY = 0; 
		this.DEPTH = 0; 
		this.WEIGHT = 0;
		this.HEIGHT = 0; 
		this.WIDTH = 0;
	}
	
	public Oven (int POWER_CONSUMPTION, int CAPACITY, int DEPTH, double WEIGHT, double HEIGHT, double WIDTH) {
		super("Oven");
		this.POWER_CONSUMPTION = POWER_CONSUMPTION; 
		this.CAPACITY = CAPACITY; 
		this.DEPTH = DEPTH; 
		this.WEIGHT = WEIGHT;
		this.HEIGHT = HEIGHT; 
		this.WIDTH = WIDTH;
	}

	public int getPOWER_CONSUMPTION() {
		return POWER_CONSUMPTION;
	}

	public void setPOWER_CONSUMPTION(int pOWER_CONSUMPTION) {
		POWER_CONSUMPTION = pOWER_CONSUMPTION;
	}

	public int getCAPACITY() {
		return CAPACITY;
	}

	public void setCAPACITY(int cAPACITY) {
		CAPACITY = cAPACITY;
	}

	public int getDEPTH() {
		return DEPTH;
	}

	public void setDEPTH(int dEPTH) {
		DEPTH = dEPTH;
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
		result = prime * result + CAPACITY;
		result = prime * result + DEPTH;
		long temp;
		temp = Double.doubleToLongBits(HEIGHT);
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
		Oven other = (Oven) obj;
		if (CAPACITY != other.CAPACITY)
			return false;
		if (DEPTH != other.DEPTH)
			return false;
		if (Double.doubleToLongBits(HEIGHT) != Double.doubleToLongBits(other.HEIGHT))
			return false;
		if (POWER_CONSUMPTION != other.POWER_CONSUMPTION)
			return false;
		if (Double.doubleToLongBits(WEIGHT) != Double.doubleToLongBits(other.WEIGHT))
			return false;
		if (Double.doubleToLongBits(WIDTH) != Double.doubleToLongBits(other.WIDTH))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Oven [POWER_CONSUMPTION=" + POWER_CONSUMPTION + ", CAPACITY=" + CAPACITY + ", DEPTH=" + DEPTH
				+ ", WEIGHT=" + WEIGHT + ", HEIGHT=" + HEIGHT + ", WIDTH=" + WIDTH + "]";
	}
	
	
	
}
