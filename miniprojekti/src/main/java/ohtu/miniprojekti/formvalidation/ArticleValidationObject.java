package ohtu.miniprojekti.formvalidation;

import javax.validation.constraints.*;
import ohtu.miniprojekti.domain.Viite;
import ohtu.miniprojekti.domain.Viite.ViiteType;

public class ArticleValidationObject implements ViiteValidationObject{
    
    @NotNull(message="Viitteellä täytyy olla vähintään yksi tekijä.")
    @Size(min=1, max=50, message="Tekijän pituus 1-50 merkkiä.")
    @Pattern(regexp="[\\w äöåÄÖÅ\\,\\'\\-]+", message="Virheellinen nimi. Anna muodossa \"sukunimi1, etunimi1 and sukunimi2, etunimi2\"")
    private String author;
    
    @NotNull(message="Viitteellä täytyy olla nimi.")
    @Size(min=1, max=50, message="Nimen pituus 1-50 merkkiä.")
    @Pattern(regexp="[\\w äöåÄÖÅ\\,\\-\\:\\!\\']+", message="Virheellinen nimi.")
    private String title;

    @NotNull(message="Artikkelilla täytyy olla julkaisupaikka.")
    @Size(min=1, max=50, message="Julkaisun pituus 1-50 merkkiä.")
    @Pattern(regexp="[\\w äöåÄÖÅ\\,\\-\\:\\!\\']+", message="Virheellinen nimi.")
    private String journal;
    
    @NotNull(message="Anna julkaisun vuosi.")
    @Digits(integer=4, fraction=0, message="Virheellinen vuosiluku.")
    private String publicationYear;
    
    @Pattern(regexp="([1-9][0-9]*)?", message="Virheellinen numero.")
    private String volume;
    
    @Pattern(regexp="([1-9][0-9]*)?", message="Virheellinen numero.")
    private String number;
    
    @Pattern(regexp="([1-9][0-9]*(\\-[1-9][0-9]*)?)?", message="Anna muodossa xxx-yyy.")
    private String pages;

    private Long id;
    private ViiteType viiteType;
    
    private String refId;
    
    public ArticleValidationObject() {
        viiteType = viiteType.ARTICLE;
        this.id = -1L;
    }
    
    public ArticleValidationObject(Viite viite) {
        viiteType = viiteType.ARTICLE;
        this.id = viite.getId();
        this.refId = viite.getRefId();
        this.author = viite.getAuthor();
        this.title = viite.getTitle();
        this.journal = viite.getJournal();
        this.publicationYear = viite.getPublicationYear();
        this.volume = viite.getVolume();
        this.number = viite.getNumber();
        this.pages = viite.getPages();
    }

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }    
    
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getJournal() {
        return journal;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ViiteType getViiteType() {
        return viiteType;
    }

    public void setViiteType(ViiteType viiteType) {
        this.viiteType = viiteType;
    }

    
    
}