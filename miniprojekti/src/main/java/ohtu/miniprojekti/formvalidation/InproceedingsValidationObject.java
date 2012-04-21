package ohtu.miniprojekti.formvalidation;

import javax.validation.constraints.*;
import ohtu.miniprojekti.domain.Viite;
import ohtu.miniprojekti.domain.Viite.ViiteType;

public class InproceedingsValidationObject implements ViiteValidationObject{
   
    @NotNull(message="Entry must have at least one author.")
    @Size(min=1, max=200, message="The length must be at most 200 characters.")
    @Pattern(regexp="[\\w äöåÄÖÅ\\,\\'\\-\\.]+", message="Invalid name. Please use format \"last_name1, first_name1 and last_name2, first_name2\".")
    private String author;
    
    @NotNull(message="Entry must have a title.")
    @Size(min=1, max=200, message="The length must be at most 200 characters.")
    @Pattern(regexp="[\\w äöåÄÖÅ\\,\\-\\:\\!\\'\\.\\(\\)]+", message="Invalid name.")
    private String title;
    
    @NotNull(message="Entry must have a booktitle.")
    @Size(min=1, max=200, message="The length must be at most 200 characters.")
    @Pattern(regexp="[\\w äöåÄÖÅ\\,\\-\\:\\!\\'\\.\\(\\)]+", message="Invalid name")
    private String booktitle;
    
    @NotNull(message="Entry must have a year.")
    @Digits(integer=4, fraction=0, message="Invalid year.")
    private String publicationYear;
    
    @Size(min=0, max=200, message="The length must be at most 200 characters.")
    @Pattern(regexp="[\\w äöåÄÖÅ\\,\\-\\:\\'\\.]*", message="Invalid name.")
    private String editor;
    
    @Pattern(regexp="([1-9][0-9]*(\\-[1-9][0-9]*)?)?", message="Please use format xxx-yyy.")
    private String pages;

    @Size(min=0, max=200, message="The length must be at most 200 characters.")
    @Pattern(regexp="[\\w äöåÄÖÅ\\,\\-\\:\\'\\.]*", message="Invalid name.")
    private String organization;
    
    @Size(min=0, max=200, message="The length must be at most 200 characters.")
    @Pattern(regexp="[\\w äöåÄÖÅ\\,\\-\\:\\!\\'\\.]*", message="Invalid name.")
    private String publisher;
    
    @Size(min=0, max=200, message="The length must be at most 200 characters.")
    @Pattern(regexp="[\\w äöåÄÖÅ\\,\\-\\:\\!\\'\\.]*", message="Invalid name.")
    private String address;
    
    private Long id;
    private ViiteType viiteType;
    
    @Pattern(regexp="([\\wåöäÅÖÄ]+\\d+\\w*)?", message="Invalid identifier.")    

    private String refId;

    public InproceedingsValidationObject() {
        viiteType = ViiteType.INPROCEEDINGS;
        this.id = -1L;
    }

    public InproceedingsValidationObject(Viite viite) {
        viiteType = ViiteType.INPROCEEDINGS;
        this.id = viite.getId();
        this.refId = viite.getRefId();
        this.author = viite.getAuthor();
        this.title = viite.getTitle();
        this.booktitle = viite.getBooktitle();
        this.publicationYear = viite.getPublicationYear();
        this.editor = viite.getEditor();
        this.pages = viite.getPages();
        this.organization = viite.getOrganization();
        this.publisher = viite.getPublisher();
        this.address = viite.getAddress();
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

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }
    
    
}