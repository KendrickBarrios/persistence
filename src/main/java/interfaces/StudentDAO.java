package interfaces;

import dao.EntityManagerAdmin;
import jakarta.persistence.EntityManager;
import models.Student;

import java.util.List;

public class StudentDAO implements IStudent {
    @Override
    public void save(Student student) {
        EntityManager em = EntityManagerAdmin.getInstance();
        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();
    }

    @Override
    public Student getStudent(Long Id) {
        EntityManager em = EntityManagerAdmin.getInstance();
        return em.find(Student.class, Id);
    }

    @Override
    public void update(Student student) {
        EntityManager em = EntityManagerAdmin.getInstance();
        em.getTransaction().begin();
        em.merge(student);
        em.getTransaction().commit();
    }

    @Override
    public void delete(Student student) {
        EntityManager em = EntityManagerAdmin.getInstance();
        em.getTransaction().begin();
        em.remove(student);
        em.getTransaction().commit();
    }

    @Override
    public List<Student> getStudents() {
        EntityManager em = EntityManagerAdmin.getInstance();
        em.getTransaction().begin();
        return em.createQuery("from Student", Student.class).getResultList();
    }
}
