package by.tc.task01.main;

import java.util.List;

import by.tc.task01.entity.Appliance;

public class PrintApplianceInfo {
	
	public static void print(List<Appliance> appliance) {

		if (appliance.size() > 0) {
			for (int i = 0; i < appliance.size(); i++) {
				System.out.println(appliance.get(i).toString());
			}
		} else {
			System.out.println("Not found!");
		}
		
	}

}
