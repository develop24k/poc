package com.develop24k.poc.db.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Component
public class EntityHelper {
    @Autowired
    private EntityManager entityManager;

    public void RunQuery()
    {
        boolean b = entityManager.isOpen();

        Query q = entityManager.createNativeQuery("SELECT first_name from CUSTOMER");
        List list = q.getResultList();
        list.size();
    }
}
