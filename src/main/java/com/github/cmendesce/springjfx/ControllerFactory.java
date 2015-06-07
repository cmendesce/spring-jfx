package com.github.cmendesce.springjfx;

import com.github.cmendesce.springjfx.controller.Controller;

/**
 * Represents a factory to javafx controllers
 */
public interface ControllerFactory {
    <T extends Controller> T create(Class<T> controllerClass);
}
