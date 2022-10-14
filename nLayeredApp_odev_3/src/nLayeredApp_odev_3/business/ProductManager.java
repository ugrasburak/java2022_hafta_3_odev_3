package nLayeredApp_odev_3.business;

import nLayeredApp_odev_3.core.logging.Logger;
import nLayeredApp_odev_3.dataAccess.ProductDao;
import nLayeredApp_odev_3.entities.Category;
import nLayeredApp_odev_3.entities.Course;
import nLayeredApp_odev_3.entities.Educator;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] courseLogger;
	private Logger[] categoryLogger;
	
	public ProductManager(ProductDao productDao, Logger[] courseLoggers,Logger[] categoryLoggers) {
		this.productDao = productDao;
		this.courseLogger = courseLoggers;
		this.categoryLogger=categoryLoggers;
	}
	
	public void add(Category category,Course course,Educator educator)throws Exception{
		if (course.getCourseName().equals(course)) {
			throw new Exception("Kurs ismi tekrar edemez");
		}
		else if(category.getCategoryName().equals(category)) {
			throw new Exception("Kategori ismi tekrar edemez");
		}
		else if (course.getCoursePrice() < 0) {
			throw new Exception("Kurs fiyatı 0 dan küçük olamaz");
		}
		productDao.add(educator, course, category);
		for (Logger logger : courseLogger) {
			logger.log(course.getCourseName());			
		}
		for (Logger logger : categoryLogger) {
			logger.log(category.getCategoryName());
		}
	}
	
	
}
