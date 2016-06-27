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

    public void setLasttname(String lasttname) {
        this.lasttname = lasttname;
    }
}
