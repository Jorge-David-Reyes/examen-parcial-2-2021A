package uaslp.ingenieria.exams;

import uaslp.ingenieria.exams.instruments.Tipo;

import java.io.File;

public class Main{
    public static void main(String[] args, Tipo intrumento) {
        String fileName = "archivo.music"; //args[0];
        Tipo instrumento = Tipo.valueOf("PIANO");  //args[1]

        SongPlayer songPlayer = new SongPlayer();
        Song song = new Song(new File(fileName));

        songPlayer.play(song, intrumento);

    }
}
