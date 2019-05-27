package zaj9;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class HelloWorld extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });

        GridPane root = new GridPane();
        root.getChildren().add(btn);
        final StackPane p1 = new StackPane();
        final StackPane p2 = new StackPane();
        root.getChildren().add(p1);
        GridPane.setConstraints(p1,0,0);
        GridPane.setConstraints(p2,1,1);
        GridPane.setConstraints(btn,2,2);
        Ellipse e1 = new Ellipse(10,20);
        Ellipse e2 = new Ellipse(10,20);
        final Ellipse ball = new Ellipse(4,4);
        ball.setFill(Color.BLUE);
        e2.setFill(Color.CYAN);
        p1.getChildren().add(e1);
        p2.getChildren().add(e2);
        root.getChildren().add(p2);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean first=false;
                Platform.runLater(()->{p1.getChildren().add(ball);});
                while(true){
                    if (!first){
                        Platform.runLater(()-> {
                            p1.getChildren().remove(ball);
                            p2.getChildren().add(ball);

                        });
                    }
                    else{
                        Platform.runLater(()-> {
                            p2.getChildren().remove(ball);
                            p1.getChildren().add(ball);
                        });
                    }
                    first = !first;
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t.start();

    }


}
