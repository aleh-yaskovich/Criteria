package by.tc.task01.entity;

public class VacuumCleaner extends Appliance{
	
	private int POWER_CONSUMPTION;
	private char FILTER_TYPE; 
	private char BAG_TYPE;
	private String WAND_TYPE;
	private int MOTOR_SPEED_REGULATION;
	private int CLEANING_WIDTH;
	
	public VacuumCleaner () {
		this.POWER_CONSUMPTION = 0;
		this.FILTER_TYPE = 0; 
		this.BAG_TYPE  = 0;
		this.WAND_TYPE  = null;
		this.MOTOR_SPEED_REGULATION = 0;
		this.CLEANING_WIDTH = 0;
	}

	public int getPOWER_CONSUMPTION() {
		return POWER_CONSUMPTION;
	}

	public void setPOWER_CONSUMPTION(int pOWER_CONSUMPTION) {
		POWER_CONSUMPTION = pOWER_CONSUMPTION;
	}

	public char getFILTER_TYPE() {
		return FILTER_TYPE;
	}

	public void setFILTER_TYPE(char fILTER_TYPE) {
		FILTER_TYPE = fILTER_TYPE;
	}

	public char getBAG_TYPE() {
		return BAG_TYPE;
	}

	public void setBAG_TYPE(char bAG_TYPE) {
		BAG_TYPE = bAG_TYPE;
	}

	public String getWAND_TYPE() {
		return WAND_TYPE;
	}

	public void setWAND_TYPE(String wAND_TYPE) {
		WAND_TYPE = wAND_TYPE;
	}

	public int getMOTOR_SPEED_REGULATION() {
		return MOTOR_SPEED_REGULATION;
	}

	public void setMOTOR_SPEED_REGULATION(int mOTOR_SPEED_REGULATION) {
		MOTOR_SPEED_REGULATION = mOTOR_SPEED_REGULATION;
	}

	public int getCLEANING_WIDTH() {
		return CLEANING_WIDTH;
	}

	public void setCLEANING_WIDTH(int cLEANING_WIDTH) {
		CLEANING_WIDTH = cLEANING_WIDTH;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + BAG_TYPE;
		result = prime * result + CLEANING_WIDTH;
		result = prime * result + FILTER_TYPE;
		result = prime * result + MOTOR_SPEED_REGULATION;
		result = prime * result + POWER_CONSUMPTION;
		result = prime * result + ((WAND_TYPE == null) ? 0 : WAND_TYPE.hashCode());
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
		VacuumCleaner other = (VacuumCleaner) obj;
		if (BAG_TYPE != other.BAG_TYPE)
			return false;
		if (CLEANING_WIDTH != other.CLEANING_WIDTH)
			return false;
		if (FILTER_TYPE != other.FILTER_TYPE)
			return false;
		if (MOTOR_SPEED_REGULATION != other.MOTOR_SPEED_REGULATION)
			return false;
		if (POWER_CONSUMPTION != other.POWER_CONSUMPTION)
			return false;
		if (WAND_TYPE == null) {
			if (other.WAND_TYPE != null)
				return false;
		} else if (!WAND_TYPE.equals(other.WAND_TYPE))
			return false;
		return true;
	}
	
}
