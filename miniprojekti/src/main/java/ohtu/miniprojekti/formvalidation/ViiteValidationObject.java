package ohtu.miniprojekti.formvalidation;

import ohtu.miniprojekti.domain.Viite.ViiteType;

public interface ViiteValidationObject {
    Long getId();
    String getRefId();
    ViiteType getViiteType();
}
