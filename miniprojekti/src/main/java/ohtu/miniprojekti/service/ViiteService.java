package ohtu.miniprojekti.service;

import java.util.List;
import ohtu.miniprojekti.domain.Viite;

public interface ViiteService {

    List<Viite> findAll();

    Viite save(Viite viite);
    
    boolean refIdValid(String refId);
    
    String generateRefId(String author, String year);
}
