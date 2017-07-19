package org.smart4j.framework.bean;

import java.lang.reflect.Method;

/**
 * Created by yz on 2017/7/19.
 */
public class Handler {
    /**
     * Controller 类
     */
    private Class<?> controllerClass;
    /**
     * Action 方法
     */
    private Method actionMethod;

    public Handler(Class<?> controllerClass, Method actionMethod) {
        this.controllerClass = controllerClass;
        this.actionMethod = actionMethod;
    }

    public Class<?> getControllerClass() {
        return controllerClass;
    }

    public Method getActionMethod() {
        return actionMethod;
    }
}
