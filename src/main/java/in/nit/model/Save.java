package in.nit.model;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Save {
	
	public static void main(String[] args) {
		
		
		try {
			
			Configuration cfg = new Configuration();
			
			cfg.configure();
			SessionFactory sf= cfg.buildSessionFactory();
			Session ses= sf.openSession();
			Transaction tx=ses.beginTransaction();
			
			
			Customer cob= new Customer();
			cob.setCustId(100);
			cob.setCustName("Ajay");
			cob.setCustAddr("Mumbai");
			
			Serializable s=ses.save(cob);
			Integer id=(Integer)s;
			tx.commit();
			ses.close();
		
		} catch (Exception e) {
e.printStackTrace();

		}

	
	
}
}