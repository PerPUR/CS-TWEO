package com.example.cstweo.Client;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FxmlNewWin {

    public void addDialog(Stage stage) throws Exception{
        Parent parent = FXMLLoader.load(getClass().getResource("/Dialog.fxml"));
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("错误提示");
        stage.setResizable(false);
        stage.show();
    }

    public void  addAeaechLog(Stage stage) throws Exception{
        Parent parent = FXMLLoader.load(getClass().getResource("/SearchLog.fxml"));
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("提示");
        stage.setResizable(false);
        stage.show();
    }

    public void alterLog(Stage stage) throws Exception{
        Parent parent = FXMLLoader.load(getClass().getResource("/dilogAlter.fxml"));
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("提示");
        stage.setResizable(false);
        stage.show();
    }

}
