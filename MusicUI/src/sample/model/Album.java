package sample.model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * Created by timbuchalka on 9/12/16.
 */
public class Album {

    private int id;
    private String name;
    private int artistId;

    public int getId() {
        return id;
    }

    public void setId(SimpleIntegerProperty id) {
        this.id = id;
    }

    public SimpleStringProperty getName() {
        return name;
    }

    public void setName(SimpleStringProperty name) {
        this.name = name;
    }

    public SimpleStringProperty getArtistId() {
        return artistId;
    }

    public void setArtistId(SimpleIntegerProperty artistId) {
        this.artistId = artistId;
    }
}
