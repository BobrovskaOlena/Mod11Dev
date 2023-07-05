package org.example;

import org.example.CrudServices.ClientCrudService;
import org.example.CrudServices.PlanetCrudService;
import org.example.entity.Client;
import org.example.entity.Planet;
import org.example.hibernate.HibernateUtils;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        HibernateUtils hibernateUtils = HibernateUtils.getInstance();
        SessionFactory sessionFactory = hibernateUtils.getSessionFactory();
        ClientCrudService clientCrudService = new ClientCrudService(sessionFactory);
        PlanetCrudService planetCrudService = new PlanetCrudService(sessionFactory);

//        // TODO create client
//         Client client = new Client();
//         client.setName("Artur Don");
//         clientCrudService.createClient(client);
//
//        // TODO create planet
//        Planet planet = new Planet();
//        planet.setId("PLU");
//        planet.setName("Pluto");
//        planetCrudService.createPlanet(planet);
//
//        //TODO get client by id
//        Long clientId = 11L;
//        Client retrievedClient = clientCrudService.getClient(clientId);
//        System.out.println("Retrieved Client: " + retrievedClient.getName());
//
//        //TODO get planet by id
//        String planetId = "PLU";
//        Planet retrievedPlanet = planetCrudService.getPlanet(planetId);
//        System.out.println("Retrieved Planet: " + retrievedPlanet.getName());
//
//        // TODO get all clients
//        clientCrudService.getAllClients();
//
//        //TODO get all planets
//        planetCrudService.getAllPlanets();
//
//        // TODO update client
//        Client client = clientCrudService.getClient(11L);
//        client.setName("Jane Trytenko");
//        clientCrudService.updateClient(client);
//        System.out.println("Updated Client: " + client.getName());
//
//        // TODO update planet
//        Planet planet = planetCrudService.getPlanet("PLU");
//        planet.setName("Pluto2");
//        planetCrudService.updatePlanet(planet);
//        System.out.println("Updated planet: " + planet.getName());
//
//        // TODO delete the client
//        Client client = clientCrudService.getClient(11L);
//        clientCrudService.deleteClient(client);
//        System.out.println("Client Deleted");
//
//        //TODO delete the planet
//        Planet planet = planetCrudService.getPlanet("PLU");
//        planetCrudService.deletePlanet(planet);
//        System.out.println("Planet Deleted");


        hibernateUtils.closeSessionFactory();
        }
    }
