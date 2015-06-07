package com.github.cmendesce.springjfx.spring;

import com.github.cmendesce.springjfx.ControllerFactory;
import com.github.cmendesce.springjfx.controller.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class SpringControllerFactory implements ControllerFactory {

    private final ApplicationContext appContext;

    @Autowired
    public SpringControllerFactory(ApplicationContext appContext) {
        this.appContext = appContext;
    }

    public <T extends Controller> T create(Class<T> controllerClass) {
        try {
            Controller controller = getAppContext().getBean(controllerClass);
            return (T) controller;
        } catch (Exception ex) {
            return null;
        }
    }

    public ApplicationContext getAppContext() {
        return appContext;
    }
}
