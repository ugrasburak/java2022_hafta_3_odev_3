package nLayeredApp_odev_3.dataAccess;

import nLayeredApp_odev_3.entities.Category;
import nLayeredApp_odev_3.entities.Course;
import nLayeredApp_odev_3.entities.Educator;

public class HibernateProductDao implements ProductDao {

	@Override
	public void add(Educator educator,Course course,Category category) {
		System.out.println(educator.getEducatorName()+" kişisi "+category.getCategoryName()+" kategorisinde "+course.getCoursePrice()+" fiyatında JDBC ile kaydedildi.");			
	}
	
}
