package by.tc.task01.dao;

import java.util.List;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public interface ApplianceDAO {
	List<String> generateRequest (Criteria criteria);
	Appliance find (Criteria criteria);
}
