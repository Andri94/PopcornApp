package main;

import java.util.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class mainShow extends VBox {

    private ListView<String> mainList;
    private Label label;
    private TextArea txtMovie;
    private Button btnMovie;
    private ObservableList<String> obMovie;
    private ListView<String> opet;
    private Label lblMovie;
    private TextField txtDate;

    public mainShow() {
        init();
    }

    public void init() {
        VBox vb = new VBox();
        opet = new ListView<>();
        btnMovie = new Button("Add");
        btnMovie.setStyle("-fx-background-color: "
                + "linear-gradient(#f4f73e, #d6d6d6)");
        btnMovie.setMinWidth(70);
        label = new Label("Movie results:");
        label.setFont(new Font("Ariel", 18));
        mainList = new ListView();
        txtMovie = new TextArea();
        txtDate = new TextField();
        txtMovie.setPrefSize(300, 100);
        opet.setPrefSize(100, 100);
        //this.setMargin(opet, new Insets(0,200,0,0));
        opet.setTranslateZ(200);
        this.setMargin(label, new Insets(40, 0, 0, 0));

        lblMovie = new Label("Synopsis: ");
        lblMovie.setFont(new Font("Ariel", 18));
        lblMovie.setTranslateX(100);
        txtMovie.setTranslateX(100);
        obMovie = FXCollections.observableArrayList();
        this.setMargin(mainList, new Insets(0, 0, 0, 0));
        this.setMargin(txtMovie, new Insets(10, 0, 0, 0));
        this.setPadding(new Insets(5));
        this.setSpacing(10);
        mainList.setPrefSize(220, 300);
        mainList.setMaxWidth(210);
        VBox test = new VBox();
        txtMovie.setEditable(false);
        ScrollPane sp = new ScrollPane();
        sp.setContent(txtMovie);
        lblMovie.setTextFill(Color.WHITESMOKE);
        sp.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        sp.setHbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        test.setMargin(lblMovie, new Insets(18, 0, 0, 0));
        test.getChildren().addAll(lblMovie, txtMovie, txtDate);
        test.setMargin(txtDate, new Insets(20, 0, 0, 140));

        mainList.setStyle("-fx-backgorund-color: #000000");
        this.getChildren().addAll(label, mainList, btnMovie, test);
        this.getChildren().addAll(vb);

    }

    public ListView<String> getMainList() {
        return mainList;
    }

    public TextArea getTxtMovie() {
        return txtMovie;
    }

    public Button getBtnMovie() {
        return btnMovie;
    }

    public TextField getTxtDate() {
        return txtDate;
    }

}
