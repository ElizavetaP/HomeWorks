package homework4module.films;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Actor gyllenhaal = new Actor("Jake", "Gyllenhaal", LocalDate.of(1980, 12, 19));
        Actor watts = new Actor("Naomi", "Watts", LocalDate.of(1968, 9, 28));

        Film demolition = new Film("Demolition");
        demolition.addActor(gyllenhaal);
        demolition.addActor(watts);

        Film imposible = new Film("Imposible");
        imposible.addActor(watts);

        List<Film> filmography = new ArrayList<>();
        filmography.add(demolition);
        filmography.add(imposible);
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serializ.txt"));
            oos.writeObject(filmography);
            oos.close();
            FileInputStream is = new FileInputStream("serializ.txt");
            ObjectInputStream ois = new ObjectInputStream(is);
            List<Film> filmessout = null;
            while (is.available() > 0) {
                filmessout = (ArrayList<Film>) ois.readObject();
            }
            for (Film film : filmessout) {
                System.out.println("Film " + "'" + film.getName() + "'");
                System.out.println("Actors: ");
                for (Actor actor : film.getActors()) {
                    System.out.println(actor.getFirstname() + " " + actor.getLasttname());
                }
                System.out.println();
            }
            }catch(ClassNotFoundException e){
                e.printStackTrace();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
