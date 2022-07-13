package com.arturreske.searcher;

import com.arturreske.searcher.dao.UserRepository;
import com.arturreske.searcher.entity.Role;
import com.arturreske.searcher.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SearcherApplicationTests {
    
    
    public static void main(String[] args) {
        

        
//        SessionFactory factory = new Configuration()
//                .configure()
//                .addAnnotatedClass(User.class)
//                .addAnnotatedClass(Role.class)
//                .buildSessionFactory();
//
//        Session session = null;
//        try {
//
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            User user = session.get(User.class, 1);
//            System.out.println(user);
//
//            session.getTransaction().commit();
//
//        } finally {
//            session.close();
//            factory.close();
//        }
    }
}

