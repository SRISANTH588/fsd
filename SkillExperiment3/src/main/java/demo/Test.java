package demo; 
 
import org.hibernate.cfg.Configuration; 
import org.hibernate.*; 
 
public class Test { 
 
 public static void main(String[] args) { 
  // TODO Auto-generated method stub 
  try 
  { 
   Configuration con=new Configuration().configure(); 
   SessionFactory sf=con.buildSessionFactory(); 
   Session s=sf.openSession(); 
   Transaction t=s.beginTransaction(); 
   //first object 
   Book ob1=new Book(); 
   ob1.setBno(101); 
   ob1.setBname("Java"); 
   ob1.setBprice(2000.0f);//its a float variable 
   //Need to save the object ob1 into database 
   //use session object s to store the data 
   s.persist(ob1); //s.save(ob1); 
   t.commit();//unless we commit, the data will not be 
//stored in the database  
   //Second Object 
   Book ob2=new Book(); 
   ob2.setBno(102); 
   ob2.setBname("Advanced Java"); 
   ob2.setBprice(3000.0f); 
   s.persist(ob2); 
   t.commit();   
 
   
   
   Book b=s.find(Book.class,101); 
   System.out.println(b); 
   //update the record
   b.setBname("dotnet"); 
   s.merge(b);//s.update(b); 
   t.commit(); 
   //delete the record
   s.delete(b); //s.remove(b);
   t.commit();   
   

  } 
  catch(Exception e) 
  { 
    
  } 
 
 } 
 
} 
 