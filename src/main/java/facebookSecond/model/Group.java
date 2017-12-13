package facebookSecond.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Group extends AbstactEntity{

    private String name;
    private String followrs;
    private LocalDate dateOfCreate;

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", followrs='" + followrs + '\'' +
                ", dateOfCreate=" + dateOfCreate +
                '}';
    }

   /* public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFollowrs() {
        return followrs;
    }
    public void setFollowrs(String followrs) {
        this.followrs = followrs;
    }
    public LocalDate getDateOfCreate() {
        return dateOfCreate;
    }
    public void setDateOfCreate(LocalDate dateOfCreate) {
        this.dateOfCreate = dateOfCreate;
    }*/
}
