package com.xcao.observer.proxy.core;

import com.xcao.observer.core.Event;
import com.xcao.observer.proxy.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * 事件的注册和监听
 */
public class EventLisenter implements InvocationHandler {

    //Map相当于是一个注册器
    protected Map<String, Event> events = new HashMap<>();

    private Subject subject;

    public EventLisenter(Subject subject) {
        this.subject = subject;
    }

    public Object getProxy() {
        Class<? extends Subject> clazz = this.subject.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }


    public void addLisenter(String eventType, Object target, Method callback) {
        events.put(eventType, new Event(target, callback));
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        String methodName = method.getName();
        Event event = this.events.get(methodName);
        if (event != null) {
            event.setTrigger(methodName.toString());
            event.setSource(this);
            event.setTime(System.currentTimeMillis());

            try {
                event.getCallback().invoke(event.getTarget(), event);
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        method.invoke(this.subject, objects);
        return null;
    }
}
