package ohtu.miniprojekti.formvalidation;

import javax.validation.constraints.*;

public class InproceedingsValidationObject {
    
    private String refId;
    
    @NotNull(message="Viitteellä täytyy olla vähintään yksi tekijä.")
    @Size(min=1, max=50, message="Tekijän pituus 1-50 merkkiä.")
    @Pattern(regexp="[\\w äöåÄÖÅ\\,\\']+", message="Virheellinen nimi. Anna muodossa \"sukunimi1, etunimi1 and sukunimi2, etunimi2\"")
    private String author;
    
    @NotNull(message="Viitteellä täytyy olla nimi.")
    @Size(min=1, max=50, message="Nimen pituus 1-50 merkkiä.")
    @Pattern(regexp="[\\w äöåÄÖÅ\\,\\-\\:\\!\\']+", message="Virheellinen nimi.")
    private String title;
    
    @NotNull(message="Inproceedings entry must contain booktitle")
    @Size(min=1, max=50, message="Nimen pituus 1-50 merkkiä.")
    @Pattern(regexp="[\\w äöåÄÖÅ\\,\\-\\:\\!\\']+", message="Virheellinen nimi.")
    private String booktitle;
    
    @NotNull(message="Anna julkaisun vuosi.")
    @Digits(integer=4, fraction=0, message="Virheellinen vuosiluku.")
    private String publicationYear;
    
    @Size(min=0, max=50, message="Editor name must be at most 50 characters.")
    @Pattern(regexp="[\\w äöåÄÖÅ\\,\\-\\:\\']+", message="Virheellinen nimi.")
    private String editor;
    
    @Pattern(regexp="([1-9][0-9]*(\\-[1-9][0-9]*)?)?", message="Anna muodossa xxx-yyy.")
    private String pages;

    @Size(min=0, max=50, message="Organization name must be at most 50 characters.")
    @Pattern(regexp="[\\w äöåÄÖÅ\\,\\-\\:\\']+", message="Virheellinen nimi.")
    private String organization;
    
    @Size(min=0, max=50, message="Julkaisijan pituus korkeintaan 50 merkkiä.")
    @Pattern(regexp="[\\w äöåÄÖÅ\\,\\-\\:\\!\\']+", message="Virheellinen nimi.")
    private String publisher;
    
    @Size(min=0, max=50, message="Osoitteen pituus korkeintaan 50 merkkiä.")
    @Pattern(regexp="[\\w äöåÄÖÅ\\,\\-\\:\\!\\']+", message="Virheellinen nimi.")
    private String address;    

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
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

    public String getBooktitle() {
        return booktitle;
    }

    public void setBooktitle(String booktitle) {
        this.booktitle = booktitle;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    

}
