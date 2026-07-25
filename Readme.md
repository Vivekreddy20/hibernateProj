Learn Hibernate


// configurations

SessionFactory sf = new Configuration().addAnnotatedClass(org.example.Alienn.class).addAnnotatedClass(org.example.Laptopp.class).configure().buildSessionFactory();  //cfg.buildSessionFactory();
        Session s = sf.openSession();
        Transaction transaction = s.beginTransaction(); // transaction is not needed for getting data

//saving

s.persist(laptop);

commiting

transaction.commit();

