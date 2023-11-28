package com.salkcdoing.twitter.twitter;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        // WebView 인스턴스 생성
        WebView webView = new WebView();

        // 웹 페이지 로드
        WebEngine engine = webView.getEngine();
        engine.setJavaScriptEnabled(true);
        engine.load("http://localhost:8080");

        // Scene 생성 및 WebView 추가
        Scene scene = new Scene(webView, 800, 600);

        // Stage 설정
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}