package by.tc.task01.entity;

import java.util.List;

public class Appliance {

	private List<String> app;
	
	public Appliance () {
		this.app = null;
	}

	public List<String> getApp() {
		return app;
	}

	public void setApp(List<String> app) {
		this.app = app;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((app == null) ? 0 : app.hashCode());
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
		if (app == null) {
			if (other.app != null)
				return false;
		} else if (!app.equals(other.app))
			return false;
		return true;
	}
	
}
