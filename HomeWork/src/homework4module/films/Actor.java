package homework4module.films;

import java.io.Serializable;
import java.time.LocalDate;

public class Actor implements Serializable{
    private String firstname;
    private String lasttname;
    private LocalDate birth;

    public Actor(String firstname,String lasttname, LocalDate birth){
        this.firstname = firstname;
        this.lasttname = lasttname;
        this.birth = birth;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLasttname() {
        return lasttname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Actor actor = (Actor) o;

        if (firstname != null ? !firstname.equals(actor.firstname) : actor.firstname != null) return false;
        if (lasttname != null ? !lasttname.equals(actor.lasttname) : actor.lasttname != null) return false;
        return birth != null ? birth.equals(actor.birth) : actor.birth == null;

    }

    @Override
    public int hashCode() {
        int result = firstname != null ? firstname.hashCode() : 0;
        result = 31 * result + (lasttname != null ? lasttname.hashCode() : 0);
        result = 31 * result + (birth != null ? birth.hashCode() : 0);
        return result;
    }

    public void setLasttname(String lasttname) {
        this.lasttname = lasttname;
    }
}
