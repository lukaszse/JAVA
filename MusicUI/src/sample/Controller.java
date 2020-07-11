package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import sample.model.Artist;
import sample.model.Datasource;

public class Controller {

    class GetAllArtistsTask extends Task {
        @Override
        protected ObservableList<Artist> call() throws Exception {
            return FXCollections.observableArrayList
                                (Datasource.getInstance().queryArtists((Datasource.ORDER_BY_ASC)));
        }
    }
}
