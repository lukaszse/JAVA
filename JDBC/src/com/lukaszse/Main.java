package com.lukaszse;

import com.lukaszse.model.Artist;
import com.lukaszse.model.DataSource;
import com.lukaszse.model.SongArtist;

import java.util.List;

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

        dataSource.close();
    }
}
