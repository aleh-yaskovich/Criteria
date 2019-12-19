package by.tc.task01.dao.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.VacuumCleaner;
import by.tc.task01.entity.criteria.Criteria;

public class ApplianceDAOImpl implements ApplianceDAO{

	@Override
	public List<Appliance> find(Criteria criteria) throws IOException {
		
		String fileName = "resources\\appliances_db.txt";
		ApplianceReader reader = new ApplianceReader(fileName);
		
		ApplienceMatcher matcher = new ApplienceMatcher();
		AppliancesFactory factory = new AppliancesFactory();
		
		List<String> strApplianceData = null;
		List<Appliance> appliance = null;
		
		strApplianceData = reader.read(criteria.getGroupSearchName());
		strApplianceData = matcher.match(strApplianceData, criteria);
		appliance = factory.create(strApplianceData);
		
		return appliance;
		
	}
	
	// Считываем строки с нужным нам типом прибора
	class ApplianceReader {
		
		private FileReader reader;
		
		public ApplianceReader(String fileName) throws FileNotFoundException {
			this.reader = new FileReader(fileName);
		}
		
		public List<String> read(String applienceType) {
			if (applienceType == null) {
				return readAll();
			} else {
				return readWithType(applienceType);
			}
		}
		  
		// Если название прибора не указано, возвращаем все приборы
		private List<String> readAll() {
			List<String> list = new ArrayList<String>();
			try {
				BufferedReader br = new BufferedReader(reader);
				String s;
				while ((s = br.readLine()) != null) {
					list.add(s);
				}
				reader.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			return list;
		}
			
		// Если название прибора указано, возвращаем все приборы этого типа
		private List<String> readWithType(String applienceType) {
			List<String> list = new ArrayList<String>();
			try {
				BufferedReader br = new BufferedReader(reader);
				String s;
				while ((s = br.readLine()) != null) {
					if (s.contains(applienceType)) {
						list.add(s);
					}
				}
				reader.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			return list;
		}
	}
	
	// Сравниваем критерии со строками списка приборов и формируем список строк приборов с совпадениями
	class ApplienceMatcher {
		
		public List<String> match (List<String> appliences, Criteria criteria) {
			List<String> results = new ArrayList<String>();
			List<String> requests = partMatchFormer (criteria);
			for (String concreteApplianceData : appliences) {
				if( isMatch(concreteApplianceData, requests) ){
			        results.add(concreteApplianceData);
			      }
			}
			return results;
		}
		
		private List<String> partMatchFormer (Criteria criteria) {
			List<String> requests = new ArrayList<String>();
			Set<String> keys = criteria.getCriteria().keySet();
			for(String key : keys) {
				Object value =  criteria.getCriteria().get(key);
				String str = key+"="+value.toString();
				requests.add(str);
			}
			return requests;
		}
		
		private boolean isMatch (String applianceData, List<String> requests) {
			for(String request : requests){
				if(!applianceData.contains(request)){
			    	return false;
				}
			} 
			return true;
		}
	}
	
	// Создаем список объектов, подходящих по искомым параметрам
	class AppliancesFactory {
		
		public List<Appliance> create (List<String> strAppliancesData) {
			List<Appliance> results = new ArrayList<Appliance>();
			for(String data : strAppliancesData){
				results.add(createAppliance(data));
			}
			return results;  
		}
		
		private Appliance createAppliance (String data){
		    String[] applianceData = data.split(":");
		    
		    switch (applianceData[0].trim()) {
		    case "Oven" :
		    	return createOven(applianceData);
		    case "Laptop":
		    	return createLaptop(applianceData);
		    case "Refrigerator":
		    	return createRefrigerator(applianceData);
		    case "VacuumCleaner":
		    	return createVacuumCleaner(applianceData);
		    case "TabletPC":
		    	return createTabletPC(applianceData);
		    case "Speakers":
		    	return createSpeakers(applianceData);
		    default:
		    	Appliance appliance = new Appliance();
		    	return appliance;
		    }
		}

		private Appliance createOven(String[] data) {
			String[] arguments = data[1].split(",");
			List<String> arg = getValue(arguments);
			int POWER_CONSUMPTION = Integer.parseInt(arg.get(0)); 
			int CAPACITY = Integer.parseInt(arg.get(1));
			int DEPTH = Integer.parseInt(arg.get(2));
			double WEIGHT = Double.parseDouble(arg.get(3));
			double HEIGHT = Double.parseDouble(arg.get(4));
			double WIDTH = Double.parseDouble(arg.get(5));
			Appliance oven = new Oven(POWER_CONSUMPTION, CAPACITY, DEPTH, WEIGHT, HEIGHT, WIDTH);
			return oven;
		}
		private Appliance createLaptop(String[] data) {
			String[] arguments = data[1].split(",");
			List<String> arg = getValue(arguments);
			double BATTERY_CAPACITY = Double.parseDouble(arg.get(0)); 
			String OS = arg.get(1); 
			int MEMORY_ROM = Integer.parseInt(arg.get(2)); 
			int SYSTEM_MEMORY = Integer.parseInt(arg.get(3)); 
			double CPU = Double.parseDouble(arg.get(4)); 
			int DISPLAY_INCHS = Integer.parseInt(arg.get(5));
			Appliance laptop = new Laptop(BATTERY_CAPACITY, OS, MEMORY_ROM, SYSTEM_MEMORY, CPU, DISPLAY_INCHS);
			return laptop;
		}
		private Appliance createRefrigerator(String[] data) {
			String[] arguments = data[1].split(",");
			List<String> arg = getValue(arguments);
			int POWER_CONSUMPTION = Integer.parseInt(arg.get(0)); 
			int FREEZER_CAPACITY = Integer.parseInt(arg.get(1)); 
			double OVERALL_CAPACITY = Double.parseDouble(arg.get(2)); 
			double WEIGHT = Double.parseDouble(arg.get(3));
			double HEIGHT = Double.parseDouble(arg.get(4)); 
			double WIDTH = Double.parseDouble(arg.get(5));
			Appliance refrigerator = new Refrigerator(POWER_CONSUMPTION, FREEZER_CAPACITY, OVERALL_CAPACITY, WEIGHT, HEIGHT, WIDTH);
			return refrigerator;
		}
		private Appliance createVacuumCleaner(String[] data) {
			String[] arguments = data[1].split(",");
			List<String> arg = getValue(arguments);
			int POWER_CONSUMPTION = Integer.parseInt(arg.get(0));
			char FILTER_TYPE = arg.get(1).charAt(0); 
			char BAG_TYPE = arg.get(2).charAt(0);
			String WAND_TYPE = arg.get(3);
			int MOTOR_SPEED_REGULATION = Integer.parseInt(arg.get(4));
			int CLEANING_WIDTH = Integer.parseInt(arg.get(5));
			Appliance vacuumCleaner = new VacuumCleaner(POWER_CONSUMPTION, FILTER_TYPE, BAG_TYPE, WAND_TYPE, MOTOR_SPEED_REGULATION, CLEANING_WIDTH);
			return vacuumCleaner;
		}
		private Appliance createTabletPC(String[] data) {
			String[] arguments = data[1].split(",");
			List<String> arg = getValue(arguments);
			int BATTERY_CAPACITY = Integer.parseInt(arg.get(0));
			int DISPLAY_INCHES = Integer.parseInt(arg.get(1));
			int MEMORY_ROM = Integer.parseInt(arg.get(2));
			int FLASH_MEMORY_CAPACITY = Integer.parseInt(arg.get(3));
			String COLOR = arg.get(4);
			Appliance tabletPC = new TabletPC(BATTERY_CAPACITY, DISPLAY_INCHES, MEMORY_ROM, FLASH_MEMORY_CAPACITY, COLOR);
			return tabletPC;
		}
		private Appliance createSpeakers(String[] data) {
			String[] arguments = data[1].split(",");
			List<String> arg = getValue(arguments);
			int POWER_CONSUMPTION = Integer.parseInt(arg.get(0));
			int NUMBER_OF_SPEAKERS = Integer.parseInt(arg.get(1));
			String FREQUENCY_RANGE = arg.get(2);
			int CORD_LENGTH = Integer.parseInt(arg.get(3));
			Appliance speakers = new Speakers(POWER_CONSUMPTION, NUMBER_OF_SPEAKERS, FREQUENCY_RANGE, CORD_LENGTH);
			return speakers;
		}
		
		private List<String> getValue(String[] arr) {
			List<String> list = new ArrayList<String>();
			for (int i = 0; i < arr.length; i++) {
				String[] tmp = arr[i].split("=");
				list.add(tmp[1]);
			}
			return list;
		}
	}
	
}
