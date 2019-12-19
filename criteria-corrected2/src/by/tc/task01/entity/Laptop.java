package by.tc.task01.entity;

public class Laptop extends Appliance{

	private double BATTERY_CAPACITY; 
	private String OS; 
	private int MEMORY_ROM; 
	private int SYSTEM_MEMORY; 
	private double CPU; 
	private int DISPLAY_INCHS;
	
	public Laptop () {
		super();
		this.BATTERY_CAPACITY = 0; 
		this.OS = null; 
		this.MEMORY_ROM = 0; 
		this.SYSTEM_MEMORY = 0; 
		this.CPU = 0; 
		this.DISPLAY_INCHS = 0;
	}
	
	public Laptop (double BATTERY_CAPACITY, String OS, int MEMORY_ROM, int SYSTEM_MEMORY, double CPU, int DISPLAY_INCHS) {
		super("Laptop");
		this.BATTERY_CAPACITY = BATTERY_CAPACITY; 
		this.OS = OS; 
		this.MEMORY_ROM = MEMORY_ROM; 
		this.SYSTEM_MEMORY = SYSTEM_MEMORY; 
		this.CPU = CPU; 
		this.DISPLAY_INCHS = DISPLAY_INCHS;
	}

	public double getBATTERY_CAPACITY() {
		return BATTERY_CAPACITY;
	}

	public void setBATTERY_CAPACITY(double bATTERY_CAPACITY) {
		BATTERY_CAPACITY = bATTERY_CAPACITY;
	}

	public String getOS() {
		return OS;
	}

	public void setOS(String oS) {
		OS = oS;
	}

	public int getMEMORY_ROM() {
		return MEMORY_ROM;
	}

	public void setMEMORY_ROM(int mEMORY_ROM) {
		MEMORY_ROM = mEMORY_ROM;
	}

	public int getSYSTEM_MEMORY() {
		return SYSTEM_MEMORY;
	}

	public void setSYSTEM_MEMORY(int sYSTEM_MEMORY) {
		SYSTEM_MEMORY = sYSTEM_MEMORY;
	}

	public double getCPU() {
		return CPU;
	}

	public void setCPU(double cPU) {
		CPU = cPU;
	}

	public int getDISPLAY_INCHS() {
		return DISPLAY_INCHS;
	}

	public void setDISPLAY_INCHS(int dISPLAY_INCHS) {
		DISPLAY_INCHS = dISPLAY_INCHS;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(BATTERY_CAPACITY);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(CPU);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + DISPLAY_INCHS;
		result = prime * result + MEMORY_ROM;
		result = prime * result + ((OS == null) ? 0 : OS.hashCode());
		result = prime * result + SYSTEM_MEMORY;
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
		Laptop other = (Laptop) obj;
		if (Double.doubleToLongBits(BATTERY_CAPACITY) != Double.doubleToLongBits(other.BATTERY_CAPACITY))
			return false;
		if (Double.doubleToLongBits(CPU) != Double.doubleToLongBits(other.CPU))
			return false;
		if (DISPLAY_INCHS != other.DISPLAY_INCHS)
			return false;
		if (MEMORY_ROM != other.MEMORY_ROM)
			return false;
		if (OS == null) {
			if (other.OS != null)
				return false;
		} else if (!OS.equals(other.OS))
			return false;
		if (SYSTEM_MEMORY != other.SYSTEM_MEMORY)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Laptop [BATTERY_CAPACITY=" + BATTERY_CAPACITY + ", OS=" + OS + ", MEMORY_ROM=" + MEMORY_ROM
				+ ", SYSTEM_MEMORY=" + SYSTEM_MEMORY + ", CPU=" + CPU + ", DISPLAY_INCHS=" + DISPLAY_INCHS + "]";
	}
	
}
