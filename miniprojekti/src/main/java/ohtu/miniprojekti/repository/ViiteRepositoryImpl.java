package ohtu.miniprojekti.repository;

import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import ohtu.miniprojekti.domain.Viite;
import org.springframework.stereotype.Repository;

@Repository
public class ViiteRepositoryImpl implements ViiteRepositoryCustom{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Viite> findAllWithAuthor(String author) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Viite> criteriaQuery = criteriaBuilder.createQuery(Viite.class);
        Root<Viite> root = criteriaQuery.from(Viite.class);
        Expression<Collection<String>> authors = root.get("authors");
        Predicate predicate = criteriaBuilder.isMember(author, authors);
        criteriaQuery.where(predicate);
        TypedQuery<Viite> query = entityManager.createQuery(criteriaQuery);
        return query.getResultList();
    }
  

}
