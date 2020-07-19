package io.github.mat3e.lang;

import io.github.mat3e.HibernateUtil;
import io.github.mat3e.lang.Lang;

import java.util.List;
import java.util.Optional;

public class LangRepository {
/*    private List<Lang> languages;

    LangRepository() {
        languages = new ArrayList<>();
        languages.add(new Lang(1, "Hello", "en"));
        languages.add(new Lang(2, "Siemano", "pl"));
    }*/

    public List<Lang> findAll() {
        var session = HibernateUtil.getSessionFactory().openSession();
        var transaction = session.beginTransaction();
        List<Lang> result = null;
        try {
            result = session.createQuery("from Lang", Lang.class).list();
            transaction.commit();
        }  catch (Exception e) {
            transaction.rollback();
            System.out.println("Transaction failed: " + e);
        } finally {
            session.close();
        }

        return result;
    }

    public Optional<Lang> findById(Integer id) {
        var session = HibernateUtil.getSessionFactory().openSession();
        var transaction = session.beginTransaction();
        Lang result = null;
        try {
            result = session.get(Lang.class, id);
            transaction.commit();
        }  catch (Exception e) {
            transaction.rollback();
            System.out.println("Transaction failed: " + e);
        } finally {
            session.close();
        }

        return Optional.ofNullable(result);
/*        return languages.stream()
                .filter(l -> l.getId().equals(id))
                .findFirst();*/
    }

}
