    package studentjsp;  
      
    import org.hibernate.Session;  
    import org.hibernate.SessionFactory;  
    import org.hibernate.Transaction;  
    import org.hibernate.boot.Metadata;  
    import org.hibernate.boot.MetadataSources;  
    import org.hibernate.boot.registry.StandardServiceRegistry;  
    import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import bean.Student;  
      
    public class StoreData {  
      
        public static void main( String[] args )  
        {  
             StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
                Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
              
            SessionFactory factory = meta.getSessionFactoryBuilder().build();  
            Session session = factory.openSession();  
            Transaction t = session.beginTransaction();  
              
               Student e1=new Student();
               e1.setId(1);
               e1.setStudentname("Akshay");
               e1.setCourse("BTech");
               e1.setGender("Male");
               e1.setDateofbirth(07-02-2004);
               e1.setMobile(773252287);
               e1.setAddress("135/16, Bada Bazar, Basai Road, Gurgaon, Gurgaon");
               e1.setEmail("akshay177@gmil.com");
               e1.setPassword("akshay123");
               e1.setConfirmpassword("akshay123");
               
               session.save(e1);
               t.commit();
               System.out.println("successfully saved");
               factory.close();
               session.close();
               
        }  
    }  