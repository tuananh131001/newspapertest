package sample;

import org.jsoup.Jsoup;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Controller {
    @FXML
    private TextArea titleNewspaper;

    public void initialize() {
        try {
            Document doc = Jsoup.connect("http://vnexpress.net").get();
            String title = doc.title();
            titleNewspaper.setText(title);
        } catch (IOException e) {
            System.out.println(e);
        }

    }


}
