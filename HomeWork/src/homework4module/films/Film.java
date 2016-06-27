package homework4module.films;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Film implements Serializable{
    private List<Actor> actors = new ArrayList<>();
    private String name;

    public Film(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addActor(Actor actor){
        actors.add(actor);
    }

    public List<Actor> getActors (){
        return actors;
    }

}
