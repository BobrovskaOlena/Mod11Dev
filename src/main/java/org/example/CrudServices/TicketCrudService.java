package org.example.CrudServices;

import org.example.entity.Ticket;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class TicketCrudService {
    private final SessionFactory sessionFactory;

    public TicketCrudService(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void createTicket(Ticket ticket) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Ticket mergedTicket = (Ticket) session.merge(ticket);
        session.persist(mergedTicket);

        transaction.commit();
        session.close();
    }

    public Ticket getTicket(Long id) {
        Session session = sessionFactory.openSession();
        Ticket ticket = session.get(Ticket.class, id);
        System.out.println("Retrieved ticket: " + ticket.toString());
        session.close();
        return ticket;
    }

    public void getAllTickets() {
        Session session = sessionFactory.openSession();
        List<Ticket> tickets = session.createQuery("FROM Ticket", Ticket.class).list();
        tickets.forEach(allTicket -> System.out.println("tickets list ==> " + allTicket.toString()));
        session.close();
    }

    public void updateTicket(Ticket ticket) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Ticket originalTicket = session.get(Ticket.class, ticket.getId());
        originalTicket.setCreatedAt(ticket.getCreatedAt());
        session.merge(originalTicket);

        transaction.commit();
        session.close();
    }

    public void deleteTicket(Ticket ticket) {
        if (ticket != null) {
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            session.remove(ticket);
            transaction.commit();
            System.out.println("Ticket deleted");
            session.close();
        }
    }
}

