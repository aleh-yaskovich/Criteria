package by.tc.task01.entity;

import java.util.ArrayList;
import java.util.List;

public class Appliance {
	
	private List<String> appliance;
	
	public Appliance(List<String> list) {
		this.appliance = list;
	}

	public Appliance() {
		this.appliance = new ArrayList();
	}

	public List<String> getAppliance() {
		return appliance;
	}

	public void setAppliance(List<String> appliance) {
		this.appliance = appliance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((appliance == null) ? 0 : appliance.hashCode());
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
		Appliance other = (Appliance) obj;
		if (appliance == null) {
			if (other.appliance != null)
				return false;
		} else if (!appliance.equals(other.appliance))
			return false;
		return true;
	}
	
}
