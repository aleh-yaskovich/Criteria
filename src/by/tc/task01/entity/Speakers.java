package by.tc.task01.entity;

public class Speakers extends Appliance{

	private int POWER_CONSUMPTION;
	private int NUMBER_OF_SPEAKERS;
	private String FREQUENCY_RANGE;
	private int CORD_LENGTH;
	
	public Speakers () {
		this.POWER_CONSUMPTION = 0;
		this.NUMBER_OF_SPEAKERS = 0;
		this.FREQUENCY_RANGE = "";
		this.CORD_LENGTH = 0;
	}

	public int getPOWER_CONSUMPTION() {
		return POWER_CONSUMPTION;
	}

	public void setPOWER_CONSUMPTION(int pOWER_CONSUMPTION) {
		POWER_CONSUMPTION = pOWER_CONSUMPTION;
	}

	public int getNUMBER_OF_SPEAKERS() {
		return NUMBER_OF_SPEAKERS;
	}

	public void setNUMBER_OF_SPEAKERS(int nUMBER_OF_SPEAKERS) {
		NUMBER_OF_SPEAKERS = nUMBER_OF_SPEAKERS;
	}

	public String getFREQUENCY_RANGE() {
		return FREQUENCY_RANGE;
	}

	public void setFREQUENCY_RANGE(String fREQUENCY_RANGE) {
		FREQUENCY_RANGE = fREQUENCY_RANGE;
	}

	public int getCORD_LENGTH() {
		return CORD_LENGTH;
	}

	public void setCORD_LENGTH(int cORD_LENGTH) {
		CORD_LENGTH = cORD_LENGTH;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + CORD_LENGTH;
		result = prime * result + ((FREQUENCY_RANGE == null) ? 0 : FREQUENCY_RANGE.hashCode());
		result = prime * result + NUMBER_OF_SPEAKERS;
		result = prime * result + POWER_CONSUMPTION;
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
		Speakers other = (Speakers) obj;
		if (CORD_LENGTH != other.CORD_LENGTH)
			return false;
		if (FREQUENCY_RANGE == null) {
			if (other.FREQUENCY_RANGE != null)
				return false;
		} else if (!FREQUENCY_RANGE.equals(other.FREQUENCY_RANGE))
			return false;
		if (NUMBER_OF_SPEAKERS != other.NUMBER_OF_SPEAKERS)
			return false;
		if (POWER_CONSUMPTION != other.POWER_CONSUMPTION)
			return false;
		return true;
	}
	
}
