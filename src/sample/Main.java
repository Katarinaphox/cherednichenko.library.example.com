package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
    private ObservableList<Book> book = FXCollections.observableArrayList();

    public Main() {
        System.out.println("Main constructor");

       // book.add(new Book());
       // book.add(new Book());
       // book.add(new Book());
    }

    public ObservableList<Book> getBook() {
        return book;
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
       // Parent root = FXMLLoader.load(getClass().getResource("libr2.fxml"));
        System.out.println("Application start");

        FXMLLoader loader=new FXMLLoader() ;
        loader.setLocation(getClass().getResource("libr2.fxml"));
        AnchorPane root=loader.load();
        SampleController controller=loader.getController();

        primaryStage.setScene(new Scene(root));;
        scene.getStylesheets().add(0, "styles/my.css");
        primaryStage.show();

        //PersonOverviewController controller = loader.getController();
       // controller.setMainApp(this);

    }

    public static void main(String[] args) {

        launch(args);
    }
    // System.out.println("Application close");
}
