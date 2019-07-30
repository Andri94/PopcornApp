package main;

import java.io.FileInputStream;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;

public class LeftPanel extends VBox {

    private Label choose;
    private ListView<String> listi;
    private ObservableList<String> options;

    public LeftPanel() {

        init();

    }

    private void init() {

        choose = new Label("Choose: ");
        choose.setFont(new Font("Ariel", 18));

        /* options = FXCollections.observableArrayList();
      options.addAll( "Movies","Tv Shows", "Animation", "Games"
     );*/
        listi = new ListView();
        //listi.setItems(options);
        listi.getItems().addAll("Movies", "Tv Shows");
        listi.setPrefHeight(300);
        listi.setPrefWidth(200);
        listi.setStyle("-fx-background-color: #000000");

        try {
            FileInputStream input = new FileInputStream("src/images/arrow.png");
            Image image = new Image(input);
            ImageView imageView = new ImageView(image);

            //button = new Button("", imageView);
        } catch (Exception ex) {
            System.err.println(ex.toString());
        }

        this.setPadding(new Insets(5));
        this.setSpacing(10);
        this.setMargin(listi, new Insets(0, 50, 0, 10));
        this.setMargin(choose, new Insets(40, 50, 0, 10));

        this.getChildren().addAll(choose, listi);

    }

    public ListView<String> getListi() {

        return listi;
    }

    public ObservableList<String> getOptions() {
        return options;
    }

}
