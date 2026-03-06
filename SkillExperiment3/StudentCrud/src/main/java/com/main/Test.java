package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Student;

public class Test {

    public static void main(String[] args) {

        try {
            // Step 1: Load Hibernate configuration
            Configuration cfg = new Configuration().configure();

            // Step 2: Create SessionFactory
            SessionFactory sf = cfg.buildSessionFactory();

            // Step 3: Open Session
            Session session = sf.openSession();

            // Step 4: Begin Transaction
            Transaction tx = session.beginTransaction();

            // Step 5: Create Student object (INSERT)
            Student s1 = new Student();
            s1.setSno(1);
            s1.setSname("Harsha");

            // Save object
            session.save(s1);

            // Step 6: Commit transaction (VERY IMPORTANT)
            tx.commit();

            // Step 7: Read data
            Student ob = session.find(Student.class, 1);
            System.out.println("Fetched Record: " + ob);

            // Step 8: Update data
            tx = session.beginTransaction();
            ob.setSname("Kumar");
            session.merge(ob);
            tx.commit();

            System.out.println("Update done");

            // ❌ DELETE CODE REMOVED INTENTIONALLY
            // If delete runs, table becomes empty

            // Step 9: Close session
            session.close();
            sf.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
