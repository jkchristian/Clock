/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncingballs;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
import javafx.animation.*;
import javafx.util.*;


public class BouncingBalls extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        RadialGradient g =  new RadialGradient(0,0,0.35,0.35,0.5,true,CycleMethod.NO_CYCLE, new Stop(0.0, Color.WHITE),new Stop(1.0, Color.RED));
        
        Circle ball1 = new Circle(0,0,20);
        ball1.setFill(g);
        
        Circle ball2 = new Circle(0,0,20);
        ball2.setFill(g);
        
        Group root = new Group();
        root.getChildren().addAll(ball1, ball2);

        Scene scene = new Scene(root, 600, 600);

        primaryStage.setTitle("Two Bouncing Ball");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        //Ball 1 
        
        TranslateTransition t1 = new TranslateTransition(Duration.millis(2000), ball1);
        t1.setFromX(ball1.getRadius());
        t1.setToX(scene.getWidth() - ball1.getRadius());
        t1.setFromY(scene.getHeight() / 3);
        t1.setToY(scene.getHeight() / 3);
        t1.setCycleCount(Transition.INDEFINITE);
        t1.setAutoReverse(true);
        t1.setInterpolator(Interpolator.LINEAR);
        
        //ball 2
        TranslateTransition t2 = new TranslateTransition(Duration.millis(2000), ball2);
          t2.setFromX(ball2.getRadius());
        t2.setToX(scene.getWidth() - ball2.getRadius());
        t2.setFromY(scene.getHeight() / 3 * 2);
        t2.setToY(scene.getHeight() / 3 * 2 );
        t2.setCycleCount(Transition.INDEFINITE);
        t2.setAutoReverse(true);
        t2.setInterpolator(Interpolator.LINEAR);
        
        ParallelTransition pt;
        pt = new ParallelTransition(t1, t2);
        pt.play();
        
    }

   
    

}
