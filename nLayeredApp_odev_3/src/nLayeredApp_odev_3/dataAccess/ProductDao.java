package nLayeredApp_odev_3.dataAccess;

import nLayeredApp_odev_3.entities.Category;
import nLayeredApp_odev_3.entities.Course;
import nLayeredApp_odev_3.entities.Educator;

public interface ProductDao {
	void add(Educator educator,Course course,Category category);
}
