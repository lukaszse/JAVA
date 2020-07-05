package com.lukaszse;

import com.lukaszse.model.Artist;
import com.lukaszse.model.DataSource;
import com.lukaszse.model.SongArtist;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        DataSource dataSource = new DataSource();

        if(!dataSource.open()){
            System.out.println("Couldn't open datasource");
            return;
        }

        List<Artist> artists = dataSource.queryArtist(DataSource.ORDER_BY_DESC);
        if(artists == null) {
            System.out.println("No artists!");
            return;
        }

        for(Artist artist : artists){
            System.out.println("ID = " + artist.getId() + ",\t Name = " + artist.getName());
        }

        List<String> albumsForArtist = dataSource.queryAlbumsForArtists("Pink Floyd", dataSource.ORDER_BY_DESC);

        int i=0;
        for(String album : albumsForArtist) {
            System.out.println("Album " + ++i + ": " + album);
        }

        List<SongArtist> songArtists = dataSource.queryArtistForSong("Go Your Own Way", DataSource.ORDER_BY_ASC);
        if(songArtists == null) {
            System.out.println("Couldn't find the artist for the song");
            return;
        }

        for(SongArtist songArtist : songArtists) {
            System.out.println("Artist name: " + songArtist.getArtistName() +
                                "\tAlbuum name: " + songArtist.getAlbumName() +
                                    "\tTrack: " + songArtist.getTrack());
        }


        dataSource.querySongMetadata();

        dataSource.createViewForSongArtists();

        songArtists = dataSource.querySongInfoView("Go Your Own Way");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some title: ");
        String title = scanner.nextLine();


        if(songArtists.isEmpty()) {
            System.out.println("Could'nt find the artist for the song");
            return;
        }

        i = 0;
        for(SongArtist artist : songArtists) {
            System.out.println(" --------------- Result: "  + ++i + "----------------");
                System.out.println("FROM VIEW - Artist name: " + artist.getArtistName());
                    System.out.println(("FROM VIEW - Album name: ") + artist.getAlbumName());
                        System.out.println("FROM VIEW - Track: " + artist.getTrack());

        }

        dataSource.close();
    }
}
