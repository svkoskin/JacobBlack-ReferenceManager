package ohtu.miniprojekti.service;

import java.util.List;
import ohtu.miniprojekti.domain.Viite;
import ohtu.miniprojekti.formvalidation.ArticleValidationObject;
import ohtu.miniprojekti.formvalidation.BookValidationObject;
import ohtu.miniprojekti.formvalidation.InproceedingsValidationObject;
import ohtu.miniprojekti.formvalidation.ViiteValidationObject;
import ohtu.miniprojekti.repository.ViiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import org.springframework.transaction.annotation.Transactional;

@Service
public class ViiteServiceImpl implements ViiteService {

    @Autowired
    private ViiteRepository viiteRepository;

    @Override
    @Transactional
    public Viite save(Viite viite) {
        return viiteRepository.save(viite);
    }

    @Override
    public List<Viite> findAll() {
        return viiteRepository.findAll();
    }

    @Override
    public Viite findById(Long id) {
        return viiteRepository.findOne(id);
    }

    @Override
    public Viite getViite(ViiteValidationObject viiteValidationObject) {
        if (viiteValidationObject.getId() >= 0) {//viite on jo olemassa, haetaan vanha viite
            return findById(viiteValidationObject.getId());
        } else {
            Viite viite = new Viite();

            if (viiteValidationObject.getViiteType() == Viite.ViiteType.ARTICLE) {
                viite.updateFromValidationObj((ArticleValidationObject) viiteValidationObject);
            } else if (viiteValidationObject.getViiteType() == Viite.ViiteType.BOOK) {
                viite.updateFromValidationObj((BookValidationObject) viiteValidationObject);
            } else if (viiteValidationObject.getViiteType() == Viite.ViiteType.INPROCEEDINGS) {
                viite.updateFromValidationObj((InproceedingsValidationObject) viiteValidationObject);
            }

            return viite;
        }

    }

    private boolean refIdUnique(String refId) {
        List<Viite> all = this.findAll();
        for (Viite v : all) {
            if (v.getRefId().equals(refId)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean refIdValid(String refId) {
        if (refId.matches("^[\\wåöäÅÖÄ]+\\d+\\w*$")) {
            return refIdUnique(refId);
        } else {
            return false;
        }
    }

    private String generateAuthorPart(List<String> authors) {

        int numberOfAuthors = 0;
        StringBuilder multipleAuthorBuilder = new StringBuilder();

        for (String author : authors) {
            if (!author.isEmpty()) {
                numberOfAuthors++;
                multipleAuthorBuilder.append(author.charAt(0));
            }
        }

        if (numberOfAuthors > 1) {
            return multipleAuthorBuilder.toString();
        } else {
            // only one author found, refine his surname to an author part
            String[] nameTokens = authors.get(0).split("[\\s\\W]");
            for (String token : nameTokens) {
                if (token.matches("[A-ZÅÖÄ][a-zåöä]*")) {
                    if (token.length() < 4) {
                        return token.substring(0, token.length());
                    } else {
                        return token.substring(0, 4);
                    }
                }
            }
            // if everything else fails
            return "";
        }
    }

    @Override
    public String generateRefId(List<String> authors, String year) {
        String yearPart;

        if (year.length() == 2) {
            yearPart = year;
        } else if (year.length() > 2) {
            yearPart = year.substring(year.length() - 2, year.length());
        } else {
            yearPart = "";
        }

        String refIdCandidate = this.generateAuthorPart(authors) + yearPart;

        if (refIdUnique(refIdCandidate)) {
            return refIdCandidate;
        } else {
            char c = 'a';
            while (!refIdUnique(refIdCandidate + c)) {
                c++;
            }
            return refIdCandidate + c;
        }
    }
}