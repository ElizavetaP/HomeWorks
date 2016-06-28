package homework4module.films;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        if (!new File("serializ.txt").exists()) {
            Actor gyllenhaal = new Actor("Jake", "Gyllenhaal", LocalDate.of(1980, 12, 19));
            Actor watts = new Actor("Naomi", "Watts", LocalDate.of(1968, 9, 28));

            Film demolition = new Film("Demolition");
            demolition.addActor(gyllenhaal);
            demolition.addActor(watts);

            Film imposible = new Film("Imposible");
            imposible.addActor(watts);

            Set<Film> filmography = new HashSet<>();
            filmography.add(demolition);
            filmography.add(imposible);
            try {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serializ.txt"));
                oos.writeObject(filmography);
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Set<Film> filmsout = null;
        try {
            FileInputStream is = new FileInputStream("serializ.txt");
            ObjectInputStream ois = new ObjectInputStream(is);

            while (is.available() > 0) {
                filmsout = (HashSet<Film>) ois.readObject();
            }
            info(filmsout);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Map<String, Film> map = new HashMap<>();
        for (Film film : filmsout) {
            map.put(film.getName(), film);
        }

        Actor mcGregor = new Actor("Ewan", "McGregor", LocalDate.of(1971, 3, 31));

        map.get("Imposible").addActor(mcGregor);

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serializ.txt"));
            oos.writeObject(filmsout);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void info(Set<Film> films) {
        for (Film film : films) {
            System.out.println("Film " + "'" + film.getName() + "'");
            System.out.println("Actors: ");
            for (Actor actor : film.getActors()) {
                System.out.println(actor.getFirstname() + " " + actor.getLasttname());
            }
            System.out.println();
        }
    }
}
