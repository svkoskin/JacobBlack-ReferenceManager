package ohtu.miniprojekti.formvalidation;

import javax.validation.constraints.*;
import ohtu.miniprojekti.domain.Viite;
import ohtu.miniprojekti.domain.Viite.ViiteType;

public class BookValidationObject implements ViiteValidationObject{
    
    @NotNull(message="Entry must have at least one author.")
    @Size(min=1, max=50, message="The length must be at most 50 characters.")
    @Pattern(regexp="[\\w äöåÄÖÅ\\,\\'\\-]+", message="Invalid name. Please use format \"last_name1, first_name1 and last_name2, first_name2\".")
    private String author;
    
    @NotNull(message="Entry must have a title.")
    @Size(min=1, max=50, message="The length must be at most 50 characters.")
    @Pattern(regexp="[\\w äöåÄÖÅ\\,\\-\\:\\!\\']+", message="Invalid name.")
    private String title;
    
    @NotNull(message="Entry must have a publisher.")
    @Size(min=1, max=50, message="The length must be at most 50 characters.")
    @Pattern(regexp="[\\w äöåÄÖÅ\\,\\-\\:\\!\\']+", message="Invalid name.")
    private String publisher;
    
    @NotNull(message="Entry must have a year.")
    @Digits(integer=4, fraction=0, message="Invalid year.")
    private String publicationYear;
    
    @Pattern(regexp="([1-9][0-9]*)?", message="Invalid number.")
    private String volume;
    
    @Size(min=0, max=50, message="The length must be at most 50 characters.")
    @Pattern(regexp="[\\w äöåÄÖÅ\\,\\-\\:\\!\\']*", message="Invalid name.")
    private String series;
    
    @Size(min=0, max=20, message="The length must be at most 20 characters.")
    @Pattern(regexp="[\\w äöåÄÖÅ\\,\\-\\:\\']*", message="Invalid name.")
    private String edition;
    
    @Pattern(regexp="([1-9][0-9]*(\\-[1-9][0-9]*)?)?", message="Please use format xxx-yyy.")
    private String pages;

    @Size(min=0, max=50, message="The length must be at most 50 characters.")
    @Pattern(regexp="[\\w äöåÄÖÅ\\,\\-\\:\\!\\']*", message="Invalid name.")
    private String address;

    private Long id;
    private Viite.ViiteType viiteType;
    
    @Pattern(regexp="([\\wåöäÅÖÄ]+ \\d+\\w*)?", message="Invalid identifier")
    private String refId;

    public BookValidationObject() {
        viiteType = Viite.ViiteType.BOOK;
        this.id = -1L;
    }

    public BookValidationObject(Viite viite) {
        viiteType = Viite.ViiteType.BOOK;
        this.id = viite.getId();
        this.refId = viite.getRefId();
        this.author = viite.getAuthor();
        this.title = viite.getTitle();
        this.publisher = viite.getPublisher();
        this.publicationYear = viite.getPublicationYear();
        this.volume = viite.getVolume();
        this.series = viite.getSeries();
        this.edition = viite.getEdition();
        this.pages = viite.getPages();
        this.address = viite.getAddress();
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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