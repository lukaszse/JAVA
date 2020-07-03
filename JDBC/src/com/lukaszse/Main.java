package com.lukaszse;

import com.lukaszse.model.Artist;
import com.lukaszse.model.DataSource;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        DataSource dataSource = new DataSource();

        if(!dataSource.open()){
            System.out.println("Couldn't open datasource");
            return;
        }

        List<Artist> artists = dataSource.querryArtist(DataSource.ORDER_BY_DESC);
        if(artists == null) {
            System.out.println("No artists!");
            return;
        }

        for(Artist artist : artists){
            System.out.println("ID = " + artist.getId() + ",\t Name = " + artist.getName());
        }

        dataSource.close();
    }
}
