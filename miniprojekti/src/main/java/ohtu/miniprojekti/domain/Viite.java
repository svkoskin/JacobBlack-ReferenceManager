package ohtu.miniprojekti.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
public class Viite implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
   
    @NotNull(message = "Viitteellä täytyy olla otsikko.")
    @Size(min = 1, max = 200, message = "Otsikon pituus saa olla 1-200 merkkiä.")
    @Pattern(regexp = "[\\w äöÄÖ]*", message = "Virheellinen nimi.")
    private String title;
    
    @Size(min = 1, max = 50, message = "Tekijöiden nimien pituus saa olla 1-50 merkkiä.")
    private String author;
  
    // BibTeX "year"
    @NotNull(message = "Julkaisuvuosi täytyy ilmoittaa.")
    @Min(1500)
    @Max(2050)
    private Integer publicationYear;
    
    @NotNull(message = "Julkaisija täytyy ilmoittaa.")
    private String publisher;
    
    @NotNull(message = "Julkaisu täytyy ilmoittaa.")
    private String journal;
    
    private String volume;
    
    // BibTeX "month"
    private String publicationMonth;
    
    private String note;
    
    // BibTeX "key"
    private String referenceKey;
    
    private String number;
    
    private String pages;
    
    private String series;
    
    private String address;
    
    private String edition;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getJournal() {
        return journal;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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

    public String getPublicationMonth() {
        return publicationMonth;
    }

    public void setPublicationMonth(String publicationMonth) {
        this.publicationMonth = publicationMonth;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getReferenceKey() {
        return referenceKey;
    }

    public void setReferenceKey(String referenceKey) {
        this.referenceKey = referenceKey;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }
}
