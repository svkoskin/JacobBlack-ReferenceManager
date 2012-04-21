package ohtu.miniprojekti.service;

import java.util.List;
import ohtu.miniprojekti.domain.Viite;


import ohtu.miniprojekti.formvalidation.ViiteValidationObject;

public interface ViiteService {

    List<Viite> findAll();

    Viite findById(Long id);

    Viite getViite(ViiteValidationObject viiteValidationObject);

    Viite save(Viite viite);

    boolean refIdValid(String refId);

    String generateRefId(List<String> authors, String year);
}