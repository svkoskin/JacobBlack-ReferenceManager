package ohtu.miniprojekti.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import ohtu.miniprojekti.formvalidation.ArticleValidationObject;
import ohtu.miniprojekti.formvalidation.BookValidationObject;
import ohtu.miniprojekti.formvalidation.InproceedingsValidationObject;
import ohtu.miniprojekti.formvalidation.ViiteValidationObject;
import ohtu.miniprojekti.bibtex.generateBibtex;

@Entity
public class Viite implements Serializable {

    public enum ViiteType {

        ARTICLE, BOOK, INPROCEEDINGS
    }
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private ViiteType viiteType;
    private String refId;
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
    private String editor;
    private String organization;
    private String address;
    private String booktitle;
    
    

    public Viite() {
    }
    
    public void updateFromValidationObj(ArticleValidationObject validationObject) {
        this.viiteType = ViiteType.ARTICLE;
        this.refId = validationObject.getRefId();
        this.author = validationObject.getAuthor();
        this.title = validationObject.getTitle();
        this.journal = validationObject.getJournal();
        this.volume = validationObject.getVolume();
        this.number = validationObject.getNumber();
        this.publicationYear = validationObject.getPublicationYear();
        this.pages = validationObject.getPages();
    }

    public void updateFromValidationObj(BookValidationObject validationObject) {
        this.viiteType = ViiteType.BOOK;
        this.refId = validationObject.getRefId();
        this.author = validationObject.getAuthor();
        this.title = validationObject.getTitle();
        this.publisher = validationObject.getPublisher();
        this.address = validationObject.getAddress();
        this.publicationYear = validationObject.getPublicationYear();
        this.volume = validationObject.getVolume();
        this.series = validationObject.getSeries();
        this.edition = validationObject.getEdition();
        this.pages = validationObject.getPages();
    }

    public void updateFromValidationObj(InproceedingsValidationObject validationObject) {
        this.viiteType = ViiteType.INPROCEEDINGS;
        this.refId = validationObject.getRefId();
        this.author = validationObject.getAuthor();
        this.title = validationObject.getTitle();
        this.booktitle = validationObject.getBooktitle();
        this.publicationYear = validationObject.getPublicationYear();
        this.editor = validationObject.getEditor();
        this.pages = validationObject.getPages();
        this.organization = validationObject.getOrganization();
        this.publisher = validationObject.getPublisher();
        this.address = validationObject.getAddress();
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

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getBooktitle() {
        return booktitle;
    }

    public void setBooktitle(String booktitle) {
        this.booktitle = booktitle;
    }
    
    public void setBibtex(){
    }
    
    public String getBibtex(){
        generateBibtex tex = new generateBibtex();
        return tex.generateBibtex(this);
    }
}
