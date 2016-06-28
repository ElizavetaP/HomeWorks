package homework4module.films;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;

public class Film implements Serializable{
    private Set<Actor> actors = new HashSet<Actor>();
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

    public Set<Actor> getActors (){
        return actors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Film film = (Film) o;

        return name != null ? name.equals(film.name) : film.name == null;

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
