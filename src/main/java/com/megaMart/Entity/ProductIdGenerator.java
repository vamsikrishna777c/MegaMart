package com.megaMart.Entity;

import java.io.Serializable;
import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public abstract class ProductIdGenerator implements IdentifierGenerator {
    public Serializable generate(SessionImplementor session, Object object) throws HibernateException {

            
            return "PROD"+ UUID.randomUUID().toString();
    }
}
