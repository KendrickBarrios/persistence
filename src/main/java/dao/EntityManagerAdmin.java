package dao;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerAdmin {
    private static final String PERSISTENCE = "testdb";
    private static EntityManager instance;

    public EntityManagerAdmin() {
    }

    public static EntityManager getInstance() {
        if (instance == null || !instance.isOpen()) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE);
            instance = emf.createEntityManager();
        }
        return instance;
    }
}
