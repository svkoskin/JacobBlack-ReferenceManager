package ohtu.miniprojekti.formvalidation;

import java.util.List;
import javax.validation.constraints.*;
import ohtu.miniprojekti.domain.Viite;
import ohtu.miniprojekti.domain.Viite.ViiteType;

public class InproceedingsValidationObject implements ViiteValidationObject {
   
    @NotNull(message="Entry must have at least one author.")
    @Size(min=1, max=200, message="The length must be at most 200 characters.")
    @Pattern(regexp="[\\w äöåÄÖÅ\\,\\'\\-\\.]+\\, [\\w äöåÄÖÅ\\,\\'\\-\\.]+", message="Invalid name. Please use format \"last_name, first_name\".")
    private String author0;
    
    @Size(min=0, max=200, message="The length must be at most 200 characters.")
    @Pattern(regexp="([\\w äöåÄÖÅ\\,\\'\\-\\.]+\\, [\\w äöåÄÖÅ\\,\\'\\-\\.]+)?", message="Invalid name. Please use format \"last_name, first_name\".")
    private String author1;
    
    @Size(min=0, max=200, message="The length must be at most 200 characters.")
    @Pattern(regexp="([\\w äöåÄÖÅ\\,\\'\\-\\.]+\\, [\\w äöåÄÖÅ\\,\\'\\-\\.]+)?", message="Invalid name. Please use format \"last_name, first_name\".")
    private String author2;
    
    @Size(min=0, max=200, message="The length must be at most 200 characters.")
    @Pattern(regexp="([\\w äöåÄÖÅ\\,\\'\\-\\.]+\\, [\\w äöåÄÖÅ\\,\\'\\-\\.]+)?", message="Invalid name. Please use format \"last_name, first_name\".")
    private String author3;
    
    @Size(min=0, max=200, message="The length must be at most 200 characters.")
    @Pattern(regexp="([\\w äöåÄÖÅ\\,\\'\\-\\.]+\\, [\\w äöåÄÖÅ\\,\\'\\-\\.]+)?", message="Invalid name. Please use format \"last_name, first_name\".")
    private String author4;
    
    @Size(min=0, max=200, message="The length must be at most 200 characters.")
    @Pattern(regexp="([\\w äöåÄÖÅ\\,\\'\\-\\.]+\\, [\\w äöåÄÖÅ\\,\\'\\-\\.]+)?", message="Invalid name. Please use format \"last_name, first_name\".")
    private String author5;
    
    @Size(min=0, max=200, message="The length must be at most 200 characters.")
    @Pattern(regexp="([\\w äöåÄÖÅ\\,\\'\\-\\.]+\\, [\\w äöåÄÖÅ\\,\\'\\-\\.]+)?", message="Invalid name. Please use format \"last_name, first_name\".")
    private String author6;
    
    @Size(min=0, max=200, message="The length must be at most 200 characters.")
    @Pattern(regexp="([\\w äöåÄÖÅ\\,\\'\\-\\.]+\\, [\\w äöåÄÖÅ\\,\\'\\-\\.]+)?", message="Invalid name. Please use format \"last_name, first_name\".")
    private String author7;
    
    @Size(min=0, max=200, message="The length must be at most 200 characters.")
    @Pattern(regexp="([\\w äöåÄÖÅ\\,\\'\\-\\.]+\\, [\\w äöåÄÖÅ\\,\\'\\-\\.]+)?", message="Invalid name. Please use format \"last_name, first_name\".")
    private String author8;    
    
    @Size(min=0, max=200, message="The length must be at most 200 characters.")
    @Pattern(regexp="([\\w äöåÄÖÅ\\,\\'\\-\\.]+\\, [\\w äöåÄÖÅ\\,\\'\\-\\.]+)?", message="Invalid name. Please use format \"last_name, first_name\".")
    private String author9;    
    
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
        
        List<String> authors = viite.getAuthors();        
        if(authors.size() > 0) { this.author0 = authors.get(0); };
        if(authors.size() > 1) { this.author1 = authors.get(1); };
        if(authors.size() > 2) { this.author2 = authors.get(2); };
        if(authors.size() > 3) { this.author3 = authors.get(3); };
        if(authors.size() > 4) { this.author4 = authors.get(4); };
        if(authors.size() > 5) { this.author5 = authors.get(5); };
        if(authors.size() > 6) { this.author6 = authors.get(6); };
        if(authors.size() > 7) { this.author7 = authors.get(7); };
        if(authors.size() > 8) { this.author8 = authors.get(8); };
        if(authors.size() > 9) { this.author9 = authors.get(9); };
        
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

    public String getAuthor0() {
        return author0;
    }

    public void setAuthor0(String author0) {
        this.author0 = author0;
    }

    public String getAuthor1() {
        return author1;
    }

    public void setAuthor1(String author1) {
        this.author1 = author1;
    }

    public String getAuthor2() {
        return author2;
    }

    public void setAuthor2(String author2) {
        this.author2 = author2;
    }

    public String getAuthor3() {
        return author3;
    }

    public void setAuthor3(String author3) {
        this.author3 = author3;
    }

    public String getAuthor4() {
        return author4;
    }

    public void setAuthor4(String author4) {
        this.author4 = author4;
    }

    public String getAuthor5() {
        return author5;
    }

    public void setAuthor5(String author5) {
        this.author5 = author5;
    }

    public String getAuthor6() {
        return author6;
    }

    public void setAuthor6(String author6) {
        this.author6 = author6;
    }

    public String getAuthor7() {
        return author7;
    }

    public void setAuthor7(String author7) {
        this.author7 = author7;
    }

    public String getAuthor8() {
        return author8;
    }

    public void setAuthor8(String author8) {
        this.author8 = author8;
    }

    public String getAuthor9() {
        return author9;
    }

    public void setAuthor9(String author9) {
        this.author9 = author9;
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