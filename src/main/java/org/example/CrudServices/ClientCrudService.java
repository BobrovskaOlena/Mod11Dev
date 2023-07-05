package org.example.CrudServices;

import org.example.entity.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class ClientCrudService {
    private final SessionFactory sessionFactory;

    public ClientCrudService(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void createClient(Client client) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(client);
        transaction.commit();
        session.close();
    }

    public Client getClient(Long id) {
        Session session = sessionFactory.openSession();
        Client client = session.get(Client.class, id);
        session.close();
        return client;
    }

    public void getAllClients() {
        Session session = sessionFactory.openSession();
        List<Client> clients = session.createQuery("FROM Client", Client.class).list();
        clients.forEach(allClients -> System.out.println("clients list ==> " + allClients.toString()));
        session.close();
    }

    public void updateClient(Client client) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.merge(client);
        transaction.commit();
        session.close();
    }

    public void deleteClient(Client client) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.remove(client);
        transaction.commit();
        session.close();
    }
}

