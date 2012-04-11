package ohtu.miniprojekti.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import ohtu.miniprojekti.formvalidation.ArticleValidationObject;

@Entity
public class Viite implements Serializable {
    public enum ViiteType {ARTICLE, BOOK, INPROCEEDINGS}
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    private ViiteType viiteType;
    private String author;
    private String title;
    private String journal;
    private String volume;
    private String number;
    private String publicationYear;
    private String pages;
    private String publisher;
    private String series;
    private String edition;
    

    public Viite() {
    }

    
    public Viite(ArticleValidationObject validationObject) {
        this.viiteType = ViiteType.ARTICLE;
        this.author = validationObject.getAuthor();
        this.title = validationObject.getTitle();
        this.journal = validationObject.getJournal();
        this.volume = validationObject.getVolume();
        this.number = validationObject.getNumber();
        this.publicationYear = validationObject.getPublicationYear();
        this.pages = validationObject.getPages();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ViiteType getViiteType() {
        return viiteType;
    }

    public void setViiteType(ViiteType viiteType) {
        this.viiteType = viiteType;
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

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    
    
}
