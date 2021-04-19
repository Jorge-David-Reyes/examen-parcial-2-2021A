package uaslp.ingenieria.exams;

import uaslp.ingenieria.exams.instruments.*;

import java.util.Iterator;

public class SongPlayer {
    public void play(Song song, Tipo tipo) {

        Iterator<Nota> notas = song.getSongIterator();
        Piano piano = new Piano();
        Guitarra guitarra = new Guitarra();
        Violin violin = new Violin();
        Flauta flauta = new Flauta();

        while (notas.hasNext()) {
            Nota nota = notas.next();

            switch (tipo) {
                case PIANO -> piano.tocaNota(nota);
                case FLAUTA -> flauta.tocaNota(nota);
                case VIOLIN -> violin.tocaNota(nota);
                case GUITARRA -> guitarra.tocaNota(nota);
                default -> System.out.println("Instrumento no soportado");
            }
        }

    }

}
