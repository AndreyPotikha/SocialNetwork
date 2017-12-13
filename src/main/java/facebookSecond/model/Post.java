package facebookSecond.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Post extends AbstactEntity{

    private String title;
    private String description;
    private LocalDate dateOfPost;


    @Override
    public String toString() {
        return "Post " +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", dateOfPost=" + dateOfPost
                + ", id = " + getId();
    }

    /*public LocalDate getDateOfPost() { return dateOfPost; }
    public void setDateOfPost(LocalDate dateOfPost) { this.dateOfPost = dateOfPost; }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }*/
}
