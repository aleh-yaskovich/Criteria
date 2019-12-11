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
	public Appliance find(Criteria criteria) {
		
		List<String> param = new ArrayList<String>();
		List<String> search = new ArrayList<String>();
		Appliance appliance = new Appliance();
		
		Set<String> keys = criteria.getCriteria().keySet();
		
		for(String key : keys) {
			Object value =  criteria.getCriteria().get(key);
			String str = key+"="+value.toString();
			param.add(str);			
		}
		
		
		File appliances_db = new File("C:\\Users\\Lenovo\\eclipse-workspace\\JD1\\jd1-les21-criteria02\\resources\\appliances_db.txt");
		
		try {
			FileReader fr = new FileReader(appliances_db);
			BufferedReader br = new BufferedReader(fr);
			String s;
			for (int i = 0; i < param.size(); i++) {
				String parameter = param.get(i);
				while ((s = br.readLine()) != null) {
					if (s.contains(criteria.getGroupSearchName()) && s.contains(parameter)) {
						search.add(s);
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
		
		appliance.setApp(search);
		
		return appliance;
	}
	
	// you may add your own code here

}


//you may add your own new classes