package by.tc.task01.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public class ApplianceDAOImpl implements ApplianceDAO{
	
	@Override
	public List<String> generateRequest (Criteria criteria) {
		
		List<String> list = new ArrayList<String>();
		Set<String> keys = criteria.getCriteria().keySet();
		
		for(String key : keys) {
			Object value =  criteria.getCriteria().get(key);
			String str = key+"="+value.toString();
			list.add(str);
		}
		
		return list;
		
	}

	@Override
	public Appliance find(Criteria criteria) {
		
		Appliance appliance = new Appliance();
		List<String> list = new ArrayList(generateRequest(criteria));
		String applianceStr = criteria.getGroupSearchName();
		File appliances_db = new File("C:\\Users\\Lenovo\\eclipse-workspace\\JD1\\jd1-les21-criteria02\\resources\\appliances_db.txt");
		
		try {
			FileReader fr = new FileReader(appliances_db);
			BufferedReader br = new BufferedReader(fr);
			String s;
			for (int i = 0; i < list.size(); i++) {
				String parameter = list.get(i);
				while ((s = br.readLine()) != null) {
					if (s.contains(applianceStr) && s.contains(parameter)) {
						appliance.getAppliance().add(s);
					}
				}
			}
			fr.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		return appliance;
		
	}
	
	// you may add your own code here

}


//you may add your own new classes