package ohtu.miniprojekti.formvalidation;

import javax.validation.constraints.*;

public class BookValidationObject {
    
    @NotNull(message="Viitteellä täytyy olla vähintään yksi tekijä.")
    @Size(min=1, max=50, message="Tekijän pituus 1-50 merkkiä.")
    @Pattern(regexp="[\\w äöåÄÖÅ\\,]+", message="Virheellinen nimi. Anna muodossa \"sukunimi1, etunimi1 and sukunimi2, etunimi2\"")
    private String author;
    
    @NotNull(message="Viitteellä täytyy olla nimi.")
    @Size(min=1, max=50, message="Nimen pituus 1-50 merkkiä.")
    @Pattern(regexp="[\\w äöåÄÖÅ\\,\\-\\:\\!]+", message="Virheellinen nimi.")
    private String title;
    
    @NotNull(message="Viitteellä täytyy olla julkaisija.")
    @Size(min=1, max=50, message="Julkaisijan pituus 1-50 merkkiä.")
    @Pattern(regexp="[\\w äöåÄÖÅ\\,\\-\\:\\!]+", message="Virheellinen nimi.")
    private String publisher;
    
    @NotNull(message="Anna julkaisun vuosi.")
    @Digits(integer=4, fraction=0, message="Virheellinen vuosiluku.")
    private String publicationYear;
    
    @Pattern(regexp="([1-9][0-9]*)?", message="Virheellinen numero.")
    private String volume;
    
    @Size(min=0, max=50, message="Julkaisusarjan pituus korkeintaan 50 merkkiä.")
    @Pattern(regexp="[\\w äöåÄÖÅ\\,\\-\\:\\!]+", message="Virheellinen nimi.")
    private String series;
    
    @Size(min=0, max=20, message="Painos korkeintaan 20 merkkiä.")
    @Pattern(regexp="[\\w äöåÄÖÅ\\,\\-\\:]+", message="Virheellinen nimi.")
    private String edition;
    
    @Pattern(regexp="([1-9][0-9]*(\\-[1-9][0-9]*)?)?", message="Anna muodossa xxx-yyy.")
    private String pages;


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

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
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

    
    
    
}
