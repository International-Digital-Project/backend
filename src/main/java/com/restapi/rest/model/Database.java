package com.restapi.rest.model;

import com.restapi.rest.entity.bookingEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Database {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        // Create a new session.
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();

            bookingEntity bookingEntity = new bookingEntity();
            bookingEntity.setTrackingId(12345L);
            bookingEntity.setDeliveryOption("express");
            bookingEntity.setWeight(10);
            bookingEntity.setLength(5);
            bookingEntity.setWidth(8);
            bookingEntity.setHeight(3);
            bookingEntity.setState("Confirmed");
            bookingEntity.setFirstname("John");
            bookingEntity.setLastname("Doe");
            bookingEntity.setCompany("ABC Logistics");
            bookingEntity.setPhoneNumber(123456789);
            bookingEntity.setEmail("john.doe@example.com");
            bookingEntity.setCardHolder("John Doe");
            bookingEntity.setCardNumber(1234567890123456L);
            bookingEntity.setExpiryDate("12/25");
            bookingEntity.setCvc(123);
            bookingEntity.setStreet("123 Main St");
            bookingEntity.setCity("Anytown");
            bookingEntity.setZip(56789);
            bookingEntity.setCountry("United States");

            // Use persist() or saveOrUpdate(), depending on your use case.
            session.persist(bookingEntity);

            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
