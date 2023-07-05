package org.example.CrudServices;

import org.example.entity.Planet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class PlanetCrudService {
    private final SessionFactory sessionFactory;

    public PlanetCrudService(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void createPlanet(Planet planet) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Planet mergedPlanet = (Planet) session.merge(planet);
        session.persist(mergedPlanet);

        transaction.commit();
        session.close();
    }

    public Planet getPlanet(String id) {
        Session session = sessionFactory.openSession();
        Planet planet = session.get(Planet.class, id);
        session.close();
        return planet;
    }

    public void getAllPlanets() {
        Session session = sessionFactory.openSession();
        List<Planet> planets = session.createQuery("FROM Planet", Planet.class).list();
        planets.forEach(allPlanet -> System.out.println("planets list ==> " + allPlanet.toString()));
        session.close();
    }

    public void updatePlanet(Planet planet) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.merge(planet);
        transaction.commit();
        session.close();
    }

    public void deletePlanet(Planet planet) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.remove(planet);
        transaction.commit();
        session.close();
    }
}

