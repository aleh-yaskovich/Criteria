package by.tc.task01.main;

import java.util.List;

import by.tc.task01.entity.Appliance;

public class PrintApplianceInfo {
	
	public static void print(Appliance appliance) {

		List<String> list = appliance.getAppliance();
		if (list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		} else {
			System.out.println("Nothing found");
		}
		System.out.println();
		
	}

}
