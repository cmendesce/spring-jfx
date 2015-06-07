package com.github.cmendesce.springjfx;

import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App extends Application {
    private ApplicationContext appContext;
    private ControllerFactory controllerFactory;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        appContext = new ClassPathXmlApplicationContext("/spring/application-context.xml");
        controllerFactory = appContext.getBean(ControllerFactory.class);

    }
}
