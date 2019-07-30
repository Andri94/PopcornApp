/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

/**
 *
 * @author Nemanja
 */
public class mainShow2 extends VBox {

    private TextArea txtTvShow;
    private ListView<String> tvList;
    private Label labela;
    private Button btnTv;

    public mainShow2() {
        init();
    }

    public void init() {

        txtTvShow = new TextArea();
        tvList = new ListView<>();
        btnTv = new Button("Add");
        btnTv.setStyle("-fx-background-color:"
                + "linear-gradient(#f4f73e, #d6d6d6)");
        btnTv.setMinWidth(70);
        labela = new Label("Tv Shows results: ");
        labela.setFont(new Font("Ariel", 18));
        this.setPadding(new Insets(5));
        this.setSpacing(10);
        this.setMargin(labela, new Insets(40, 0, 0, 0));
        tvList.setPrefSize(210, 300);
        txtTvShow.setPrefSize(200, 100);
        tvList.setMaxWidth(210);
        this.setMargin(tvList, new Insets(0, 0, 0, 0));

        //this.setMargin(labela, new Insets(0,0,0,0));
        this.getChildren().addAll(labela, tvList, btnTv);

    }

    public TextArea getTxtTvShow() {
        return txtTvShow;
    }

    public ListView<String> getTvList() {
        return tvList;
    }

    public Button getBtnTv() {
        return btnTv;
    }

}
