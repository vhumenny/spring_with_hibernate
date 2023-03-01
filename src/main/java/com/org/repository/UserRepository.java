package com.org.repository;

import com.org.entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    @Autowired
    private Session session;

    public void save(User user) {
        session.save(user);
    }

    public User getById(Long id) {
        return session.load(User.class, id);
//        return session.get(User.class, id);
    }

    public void deleteUser(Long id) {
//        Transaction transaction = session.beginTransaction();
//        User user = session.get(User.class, id);
//        session.delete(user);
//        transaction.commit();
        Transaction transaction = session.beginTransaction();
        session.createQuery("DELETE FROM User u WHERE u.id =:id")
                .setParameter("id", id).executeUpdate();
        transaction.commit();
    }

    public void updateUser(User user) {
        Transaction transaction = session.beginTransaction();
        User userById = getById(user.getId());
        userById = user;
        session.merge(userById);
        transaction.commit();
    }


}
