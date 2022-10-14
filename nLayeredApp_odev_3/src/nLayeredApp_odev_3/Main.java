package nLayeredApp_odev_3;

import nLayeredApp_odev_3.business.ProductManager;
import nLayeredApp_odev_3.core.logging.DatabaseLogger;
import nLayeredApp_odev_3.core.logging.FileLogger;
import nLayeredApp_odev_3.core.logging.Logger;
import nLayeredApp_odev_3.core.logging.MailLogger;
import nLayeredApp_odev_3.dataAccess.HibernateProductDao;
import nLayeredApp_odev_3.entities.Category;
import nLayeredApp_odev_3.entities.Course;
import nLayeredApp_odev_3.entities.Educator;

public class Main {

	public static void main(String[] args) throws Exception {
		Category category=new Category(1, "Software");
		Course course=new Course(1, "Java", 250);
		Educator educator=new Educator(1, "Burak");
		
		Logger[] loggers= {new DatabaseLogger(),new FileLogger(),new MailLogger()};
		ProductManager productManager=new ProductManager(new HibernateProductDao(), loggers, loggers);
		productManager.add(category, course, educator);
		
		
	}

}
