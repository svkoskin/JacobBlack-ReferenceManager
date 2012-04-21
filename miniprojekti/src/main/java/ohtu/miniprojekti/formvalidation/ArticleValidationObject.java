package ohtu.miniprojekti.formvalidation;

import javax.validation.constraints.*;
import ohtu.miniprojekti.domain.Viite;
import ohtu.miniprojekti.domain.Viite.ViiteType;

public class ArticleValidationObject implements ViiteValidationObjectWithManyAuthors {
    
    @NotNull(message="Entry must have at least one author.")
    @Size(min=1, max=200, message="The length must be at most 200 characters.")
    @Pattern(regexp="[\\w äöåÄÖÅ\\,\\'\\-\\.]+", message="Invalid name. Please use format \"last_name1, first_name1 and last_name2, first_name2\".")
    private String author0;
    
    @Size(min=1, max=200, message="The length must be at most 200 characters.")
    @Pattern(regexp="[\\w äöåÄÖÅ\\,\\'\\-\\.]+", message="Invalid name. Please use format \"last_name1, first_name1 and last_name2, first_name2\".")
    private String author1;
    
    @Size(min=1, max=200, message="The length must be at most 200 characters.")
    @Pattern(regexp="[\\w äöåÄÖÅ\\,\\'\\-\\.]+", message="Invalid name. Please use format \"last_name1, first_name1 and last_name2, first_name2\".")
    private String author2;
    
    @Size(min=1, max=200, message="The length must be at most 200 characters.")
    @Pattern(regexp="[\\w äöåÄÖÅ\\,\\'\\-\\.]+", message="Invalid name. Please use format \"last_name1, first_name1 and last_name2, first_name2\".")
    private String author3;
    
    @Size(min=1, max=200, message="The length must be at most 200 characters.")
    @Pattern(regexp="[\\w äöåÄÖÅ\\,\\'\\-\\.]+", message="Invalid name. Please use format \"last_name1, first_name1 and last_name2, first_name2\".")
    private String author4;
    
    @Size(min=1, max=200, message="The length must be at most 200 characters.")
    @Pattern(regexp="[\\w äöåÄÖÅ\\,\\'\\-\\.]+", message="Invalid name. Please use format \"last_name1, first_name1 and last_name2, first_name2\".")
    private String author5;
    
    @Size(min=1, max=200, message="The length must be at most 200 characters.")
    @Pattern(regexp="[\\w äöåÄÖÅ\\,\\'\\-\\.]+", message="Invalid name. Please use format \"last_name1, first_name1 and last_name2, first_name2\".")
    private String author6;
    
    @NotNull(message="Entry must have at least one author.")
    @Size(min=1, max=200, message="The length must be at most 200 characters.")
    @Pattern(regexp="[\\w äöåÄÖÅ\\,\\'\\-\\.]+", message="Invalid name. Please use format \"last_name1, first_name1 and last_name2, first_name2\".")
    private String author7;
    
    @Size(min=1, max=200, message="The length must be at most 200 characters.")
    @Pattern(regexp="[\\w äöåÄÖÅ\\,\\'\\-\\.]+", message="Invalid name. Please use format \"last_name1, first_name1 and last_name2, first_name2\".")
    private String author8;    
    
    @Size(min=1, max=200, message="The length must be at most 200 characters.")
    @Pattern(regexp="[\\w äöåÄÖÅ\\,\\'\\-\\.]+", message="Invalid name. Please use format \"last_name1, first_name1 and last_name2, first_name2\".")
    private String author9;    
    
    @NotNull(message="Entry must have a title.")
    @Size(min=1, max=200, message="The length must be at most 200 characters.")
    @Pattern(regexp="[\\w äöåÄÖÅ\\,\\-\\:\\!\\'\\.\\(\\)]+", message="Invalid name.")
    private String title;

    @NotNull(message="Entry must have a journal.")
    @Size(min=1, max=200, message="The length must be at most 200 characters.")
    @Pattern(regexp="[\\w äöåÄÖÅ\\,\\-\\:\\!\\'\\.]+", message="Invalid name.")
    private String journal;
    
    @NotNull(message="Entry must have a year.")
    @Digits(integer=4, fraction=0, message="Invalid year.")
    private String publicationYear;
    
    @Pattern(regexp="([1-9][0-9]*)?", message="Invalid number.")
    private String volume;
    
    @Pattern(regexp="([1-9][0-9]*)?", message="Invalid number.")
    private String number;
    
    @Pattern(regexp="([1-9][0-9]*(\\-[1-9][0-9]*)?)?", message="Please use format xxx-yyy.")
    private String pages;
    
    private Long id;
    private ViiteType viiteType;
    
    @Pattern(regexp="([\\wåöäÅÖÄ]+\\d+\\w*)?", message="Invalid identifier")
    private String refId;
    
    public ArticleValidationObject() {
        viiteType = viiteType.ARTICLE;
        this.id = -1L;
    }
    
    public ArticleValidationObject(Viite viite) {
        viiteType = viiteType.ARTICLE;
        this.id = viite.getId();
        this.refId = viite.getRefId();
        if(viite.getAuthors().size() > 0) { this.author0 = viite.getAuthors().get(0);};
        if(viite.getAuthors().size() > 1) { this.author1 = viite.getAuthors().get(1);};
        if(viite.getAuthors().size() > 2) { this.author2 = viite.getAuthors().get(2);};
        if(viite.getAuthors().size() > 3) { this.author3 = viite.getAuthors().get(3);};
        if(viite.getAuthors().size() > 4) { this.author4 = viite.getAuthors().get(4);};
        if(viite.getAuthors().size() > 5) { this.author5 = viite.getAuthors().get(5);};
        if(viite.getAuthors().size() > 6) { this.author6 = viite.getAuthors().get(6);};
        if(viite.getAuthors().size() > 7) { this.author7 = viite.getAuthors().get(7);};
        if(viite.getAuthors().size() > 8) { this.author8 = viite.getAuthors().get(8);};
        if(viite.getAuthors().size() > 9) { this.author9 = viite.getAuthors().get(9);};
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

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public ViiteType getViiteType() {
        return viiteType;
    }

    public void setViiteType(ViiteType viiteType) {
        this.viiteType = viiteType;
    }

    
    
}