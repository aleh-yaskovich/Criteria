package by.tc.task01.entity;

public class TabletPC extends Appliance{
	
	private int BATTERY_CAPACITY;
	private int DISPLAY_INCHES;
	private int MEMORY_ROM;
	private int FLASH_MEMORY_CAPACITY;
	private String COLOR;
	
	public TabletPC() {
		this.BATTERY_CAPACITY = 0;
		this.DISPLAY_INCHES = 0;
		this.MEMORY_ROM = 0;
		this.FLASH_MEMORY_CAPACITY = 0;
		this.COLOR = "";
	}

	public int getBATTERY_CAPACITY() {
		return BATTERY_CAPACITY;
	}

	public void setBATTERY_CAPACITY(int bATTERY_CAPACITY) {
		BATTERY_CAPACITY = bATTERY_CAPACITY;
	}

	public int getDISPLAY_INCHES() {
		return DISPLAY_INCHES;
	}

	public void setDISPLAY_INCHES(int dISPLAY_INCHES) {
		DISPLAY_INCHES = dISPLAY_INCHES;
	}

	public int getMEMORY_ROM() {
		return MEMORY_ROM;
	}

	public void setMEMORY_ROM(int mEMORY_ROM) {
		MEMORY_ROM = mEMORY_ROM;
	}

	public int getFLASH_MEMORY_CAPACITY() {
		return FLASH_MEMORY_CAPACITY;
	}

	public void setFLASH_MEMORY_CAPACITY(int fLASH_MEMORY_CAPACITY) {
		FLASH_MEMORY_CAPACITY = fLASH_MEMORY_CAPACITY;
	}

	public String getCOLOR() {
		return COLOR;
	}

	public void setCOLOR(String cOLOR) {
		COLOR = cOLOR;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + BATTERY_CAPACITY;
		result = prime * result + ((COLOR == null) ? 0 : COLOR.hashCode());
		result = prime * result + DISPLAY_INCHES;
		result = prime * result + FLASH_MEMORY_CAPACITY;
		result = prime * result + MEMORY_ROM;
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
		TabletPC other = (TabletPC) obj;
		if (BATTERY_CAPACITY != other.BATTERY_CAPACITY)
			return false;
		if (COLOR == null) {
			if (other.COLOR != null)
				return false;
		} else if (!COLOR.equals(other.COLOR))
			return false;
		if (DISPLAY_INCHES != other.DISPLAY_INCHES)
			return false;
		if (FLASH_MEMORY_CAPACITY != other.FLASH_MEMORY_CAPACITY)
			return false;
		if (MEMORY_ROM != other.MEMORY_ROM)
			return false;
		return true;
	}
	
}
