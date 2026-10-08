package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import java.time.LocalDate;
import java.util.List;


public class Main {
    public static void main(String[] args) {

//        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().
//                configure("hibernate.cfg.xml").build();
//        SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//
//
//        ProfileEntity profile = new ProfileEntity();
//        profile.setIsm("Kimdir");
//        profile.setEmail("kimdirov111@gmail.com");
//        profile.setPhone("+998905558879");
//        profile.setAge(19);
//        profile.setBio("Java 9 soat 4 dan 6 gacha sessiyaa");
//        profile.setBirthday(LocalDate.of(2026, 10, 7));
//
//        session.save(profile);


//        Student student = new Student();
//        student.setName("Islom Abdullayev");
//        student.setAge(25);
//        student.setAddress("Qarshi");
//        session.save(student);


//        session.getTransaction().commit();
//        session.close();
//        sessionFactory.close();

        getAllProfile();

    }


    public static void getAllProfile(){
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().
                configure("hibernate.cfg.xml").build();
        SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        String hql = "from ProfileEntity";
        Query<ProfileEntity> query = session.createQuery(hql, ProfileEntity.class);
        List<ProfileEntity> list = query.list();
        for (ProfileEntity profileEntity : list) {
            System.out.println(profileEntity);
        }

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();

    }






}