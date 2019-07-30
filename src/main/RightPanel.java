package main;

import DataBase.DataBase;
import DataBase.FormsOfEntertainment;
import DataBase.GenrePOJO;
import DataBase.LoadedGenres;
import DataBase.MoviePOJO;
import DataBase.mainShow2;
import java.io.FileInputStream;
import java.sql.ResultSet;
import java.sql.Statement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class RightPanel extends HBox {

    private Label chooseGenre;
    private ListView<String> lista;
    private Button button;
    private TextArea txtArea;
    private TextArea txtAreaa;
    private FormsOfEntertainment foe;
    private LoadedGenres lG;
    private Button btnLogout;
    private ListView<String> showList;
    private Label lblShowList;
    private Button btnDelete;
    private Button btnClear;

    public RightPanel() {
        init();
    }

    public void init() {

        VBox test = new VBox();
        chooseGenre = new Label("Choose genre");
        showList = new ListView<>();
        showList.setPrefSize(100, 140);
        chooseGenre.setFont(new Font("Ariel", 18));
        try {
            FileInputStream input = new FileInputStream("src/images/arrow.png");
            Image image = new Image(input);
            ImageView imageView = new ImageView(image);

            button = new Button("", imageView);

        } catch (Exception ex) {
            System.err.println(ex.toString());
        }
        btnLogout = new Button("Logout");
        btnLogout.setTranslateX(810);
        btnLogout.setMinWidth(90);
        btnLogout.setMinHeight(30);
        btnLogout.setStyle(" -fx-background-color: "
                + "linear-gradient(#ffffff, #bdbdbd)"
        );

        button.setPrefSize(150, 14);
        button.setTranslateX(20);

        button.setStyle("-fx-background-color: "
                + "linear-gradient(#f4f73e,#d6d6d6)");

        LeftPanel lp = new LeftPanel();
        mainShow ms = new mainShow();
        mainShow2 ms2 = new mainShow2();
        txtArea = new TextArea();
        txtAreaa = new TextArea();
        btnDelete = new Button("Delete");
        btnDelete.setMinWidth(100);
        //btnDelete.setTranslateX(35);
        btnDelete.setStyle(" -fx-background-color: "
                + "linear-gradient(#f73e3e, #f0aaaa)"
        );
        btnClear = new Button("Clear");
        btnClear.setTranslateX(10);
        btnClear.setStyle("-fx-background-color: "
                + "linear-gradient(#f73e3e, #f0aaaa)");
        btnClear.setPrefWidth(100);

        txtArea.setPrefSize(100, 100);
        txtAreaa.setPrefSize(100, 100);
        //txtArea
        button.setOnAction(e -> {

            if (lp.getListi().getSelectionModel().getSelectedItem() == "Movies") {

                foe = FormsOfEntertainment.prikazi(lG.get(lista.getSelectionModel().getSelectedIndex()).getId());
                ms.getMainList().setItems(FXCollections.observableArrayList(foe.getLoadedMovies().getMovieTitles()));

                System.out.println("Working");

            }
            if (lp.getListi().getSelectionModel().getSelectedItem() == "Tv Shows") {
                foe = FormsOfEntertainment.prikaziSerije(lG.get(lista.getSelectionModel().getSelectedIndex()).getId());
                ms2.getTvList().setItems(FXCollections.observableArrayList(foe.getLoadedTvShows().getTvShowsTitles()));

            }

        });

        ms.getMainList().setOnMouseClicked(e -> {
            try {
                int movieId = foe.getLoadedMovies().get(ms.getMainList().getSelectionModel().getSelectedIndex()).getId();

                ms.getTxtMovie().setText(FormsOfEntertainment.getSynopsis(movieId));
                ms.getTxtDate().setText(FormsOfEntertainment.getDate(movieId));

            } catch (Exception ex) {
                System.err.println(ex.toString());
            }

        });

        ms2.getTvList().setOnMouseClicked(e -> {
            int tvId = foe.getLoadedTvShows().get(ms2.getTvList().getSelectionModel().getSelectedIndex()).getId();
            ms.getTxtMovie().setText(FormsOfEntertainment.getSynopsisSerije(tvId));
            ms.getTxtDate().setText(FormsOfEntertainment.getDate(tvId));

        });

        ObservableList<String> mtv = FXCollections.observableArrayList();

        ms.getBtnMovie().setOnMouseClicked(e -> {
            String s = ms.getMainList().getSelectionModel().getSelectedItem();
            mtv.add(s);
            showList.setItems(mtv);
        });

        ms2.getBtnTv().setOnMouseClicked(e -> {

            String k = ms2.getTvList().getSelectionModel().getSelectedItem();
            mtv.add(k);
            showList.setItems(mtv);
        });

        btnDelete.setOnMouseClicked(e -> {
            String q = showList.getSelectionModel().getSelectedItem();

            mtv.remove(q);

        });

        btnClear.setOnMouseClicked(e -> {
            mtv.clear();
        });

        lblShowList = new Label("Watchlist: ");
        lblShowList.setFont(new Font("Ariel", 18));
        lblShowList.setTextFill(Color.WHITESMOKE);
        lista = new ListView();
        lG = loadGenres();
        lista.getItems().addAll(lG.getGenreNames());
        lista.setPrefHeight(300);
        lista.setPrefWidth(200);
        lista.setStyle("-fx-background-color:#000000");

        test.setMargin(lista, new Insets(0, 50, 0, 0));
        test.setPadding(new Insets(5));
        test.setSpacing(10);
        test.setMargin(chooseGenre, new Insets(0, 50, 0, 0));
        test.setMargin(showList, new Insets(0, 0, 0, 0));
        test.setMargin(lblShowList, new Insets(10, 0, 0, 0));
        //this.setMargin(btnClear,new Insets(0,0,100,0));
        //test.setMargin(btnDelete, new Insets(0,0,40,0));
        HBox hButtons = new HBox();
        hButtons.getChildren().addAll(btnDelete, btnClear);
        hButtons.setTranslateX(10);
        test.getChildren().addAll(btnLogout, chooseGenre, lista, button, lblShowList, showList, hButtons);

        this.getChildren().addAll(lp, test, ms, ms2);

    }

    public ListView<String> getLista() {
        return lista;
    }

    public Button getBtnLogout() {
        return btnLogout;
    }

    public ListView<String> getShowList() {
        return showList;
    }

    private static LoadedGenres loadGenres() {
        LoadedGenres result = new LoadedGenres();
        try {

            Statement stmt = DataBase.get().createStatement();
            ResultSet rs = stmt.executeQuery("select * from genres order by title asc");

            while (rs.next()) {
                GenrePOJO current = new GenrePOJO();
                current.setId(rs.getInt("idGenres"));
                current.setName(rs.getString("title"));
                result.add(current);

            }
            return result;
        } catch (Exception e) {

            System.err.println(e);
            return result;
        }
    }

}
