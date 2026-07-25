package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Student s1 = new Student();
//        s1.setSname("anwesha reddy");
//        s1.setSage(25);
//        s1.setRollno(18);

//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClass(org.example.Student.class);
//        cfg.configure();
        Laptopp laptop = new Laptopp();
        laptop.setLid(1);
        laptop.setBrand("Apple");
        laptop.setModel("mac book pro m3");
        laptop.setRam("16");

        Laptopp laptop1 = new Laptopp();
        laptop1.setLid(2);
        laptop1.setBrand("HP");
        laptop1.setModel("noName");
        laptop1.setRam("8");

        Alienn alien = new Alienn();
        alien.setAid(102);
        alien.setAname("shreeja");
        alien.setTech("react");
        alien.setLaptop(Arrays.asList(laptop1,laptop));

        SessionFactory sf = new Configuration().addAnnotatedClass(org.example.Alienn.class).addAnnotatedClass(org.example.Laptopp.class).configure().buildSessionFactory();  //cfg.buildSessionFactory();
        Session s = sf.openSession();
        Transaction transaction = s.beginTransaction(); // transaction is not needed for getting data


        s.persist(laptop);
        s.persist(laptop1);
        s.persist(alien);

        transaction.commit();
//        Student returnStudent = s.get(Student.class,21);
//        System.out.println(returnStudent);
        s.close();
        sf.close();

//        System.out.println(s1);
    }
}